package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NORMA
 */
public class conexion {
    
    private String bd="biblioteca.accdb";  //declaro los atributos de la clase conexion y son alcanze privado para 
    private String pass=""; //protegerlos y nadie los modifique desde otra clase instanceando esta.
    private String user=""; // El alcanze de estas variables es global, para que asi pueda retornarse desde cualquier otro lado del codigo.
    private String url="jdbc:ucanaccess://" + System.getProperty("user.dir").replace("\\","/")+"/"+bd;
    public Connection conn; 
    
     public conexion(){ //aqui definimos el metodo conexion (comportamiento de la clase) para la conexion
        try {           //de acceso publico.
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException ex) {
           
            System.out.println(ex.getMessage()); //aqui lo que definimos es una transaccion de que si
                                                 //al intento no se encuentran los atributos que estan pasados en
        }                                       // el metodo getConnection lanzara un error.
    }
    
    private Connection getConectionCarlos(){ // este es un metodo privado por lo tanto no se podra acceder a el a
        return this.conn;        // menos que accedas a un metodo get que lo retorne, usando get() desde otra clase.
    
    }
    
    public Connection get(){
    return this.getConectionCarlos(); //metodo que retorna metodo de arriba, con este metodo si se puede acceder
}
   
}//hoy buscare la manera de implementarlo a interfaz y añadir mi bd cuando termine mis pruebas
