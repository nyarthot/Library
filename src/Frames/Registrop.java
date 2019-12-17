/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import clases.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class Registrop extends javax.swing.JFrame {
conexion con= new conexion();
    /**
     * Creates new form Registrop
     */
    public Registrop() {
        initComponents();
        int x,y;
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0,0, this.getBounds().width,this.getBounds().height,27,27);
        close();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JTextField();
        autor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        botonregistro = new javax.swing.JButton();
        botonini = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(212, 212, 213));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 210, -1));

        autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorActionPerformed(evt);
            }
        });
        jPanel1.add(autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 210, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Autor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 50, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Titulo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        jPanel8.setBackground(new java.awt.Color(28, 40, 51));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        botonregistro.setBackground(new java.awt.Color(2, 30, 55));
        botonregistro.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonregistro.setForeground(new java.awt.Color(255, 255, 255));
        botonregistro.setText("Registrar");
        botonregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonregistroMouseClicked(evt);
            }
        });
        botonregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistroActionPerformed(evt);
            }
        });
        jPanel1.add(botonregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        botonini.setBackground(new java.awt.Color(2, 30, 55));
        botonini.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        botonini.setForeground(new java.awt.Color(255, 255, 255));
        botonini.setText("Inicio");
        botonini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botoniniMouseClicked(evt);
            }
        });
        jPanel1.add(botonini, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonregistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonregistroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonregistroMouseClicked

    private void botoniniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botoniniMouseClicked
        Iniciop cho = new Iniciop();
        cho.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botoniniMouseClicked

    private void botonregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistroActionPerformed
        //las variables de los libros son globales en el metodo para que puedan ser accedidas cualquier parte del metodo
       String t=titulo.getText();
       String a= autor.getText();
    if((titulo.getText().equals("")||autor.getText().equals(""))||(titulo.getText().equals("")&& autor.getText().equals(""))){
        JOptionPane.showMessageDialog(this, "falto llenar campos");
    } else {
         try {// todo esto se introduce dentro de un bloque try catch
       
       String sql_q="INSERT INTO libros VALUES(NULL,?,?)"; 
       //PreparedStatement evita inyecciones sql, y agregamos el campo de id tambien como el
       //primer campo y lo pasamos a NULL porque ya es autoincremento automatico.
       
     PreparedStatement query= con.get().prepareStatement(sql_q);
     query.setString(1, t);// aqui lo hacemos de esta forma porque es la mas limpia de hacerlo, aunque
     query.setString(2, a); //se pudo haber hecho desde PreparedStatement en especificacion de values pero por seguridad en la base de datos lo hacemos asi
      
     int resulta=  query.executeUpdate();
      if(resulta==1){
      JOptionPane.showMessageDialog(this, "El libro "+" "+t+" "+ "registrado"+" "+ "exitosamente");
      query.close(); con.conn.close();
      }
    }catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
         
    } 
    }//GEN-LAST:event_botonregistroActionPerformed
public void close(){
Iniciop init= new Iniciop();
init.setVisible(true);
this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField autor;
    private javax.swing.JButton botonini;
    private javax.swing.JButton botonregistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
