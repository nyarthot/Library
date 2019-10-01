-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-09-2019 a las 03:30:13
-- Versión del servidor: 10.1.35-MariaDB
-- Versión de PHP: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id` int(1) NOT NULL,
  `titulo` varchar(41) DEFAULT NULL,
  `autor` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id`, `titulo`, `autor`) VALUES
(1, 'ciudades de papel', 'john green'),
(2, 'confubalario', 'juan jose arreola'),
(3, 'perdiendo el tiempo encontrado', 'javier valdez'),
(4, 'concierto barroco', 'alejo carpinter'),
(5, 'once minutos', 'paulo coelho'),
(6, 'cumbres borrascosas', 'emily'),
(7, 'extremos', 'sergio gaut va hartman'),
(8, 'vagando entre sombras y otras historias', 'guillermo fabela'),
(9, 'el alquimista', 'paulo coelho'),
(10, 'laberinto fatal', 'ruben sanchez padilla'),
(11, 'el mundo de yarex', 'elia barcelo'),
(12, 'mi vieja guerra como te hecho de men', 'anthony loyd'),
(13, 'aleteo entre los trinos', 'julio cesar aguilar'),
(14, 'perigrinales', 'hugo gutierrez vega'),
(15, 'prologo de bernardo ruiz', 'salvador silva padilla'),
(16, 'el jugador', 'fiodor m.dotoievski'),
(17, 'asesinato en la cuesta de los millorarios', 'gibsert haefs'),
(18, 'obras completas', 'alejo carpentier'),
(19, 'la acpe y sus presidentes', 'rogelio pizarro sandoval'),
(20, 'la  borgia', 'a.dummas'),
(21, 'odisea por el pencil historico', 'jesus leticia mendoza perez'),
(22, 'caballo de trolla', 'j.j.benitez'),
(23, 'fangirl', 'rainbow rowell'),
(24, 'guia para hacerse rico', 'put robert l.kiyuzaki'),
(25, 'fausto y werther', 'goether johann'),
(26, 'la reina y la favorita', 'kiera cass'),
(27, 'el decameron', 'giovanni boccaccio'),
(28, 'futbol breve', 'microrelatos de jogo bonito'),
(29, 'tapatia', 'dante medina'),
(30, 'cien preguntas de la revolucion de mexico', 'pedro salameron'),
(31, 'otras voces,otros ambitos', ' hugo gutierrez vega'),
(32, 'el ticus', 'juan carlos reyes'),
(33, 'vietnam heroico 1922-1975', ''),
(34, 'corresponsal de guerra mexicano', 'guillermo zamora'),
(35, 'el estado libre y soberano de colima', 'manuel godin velazco'),
(36, 'once de la tribu', 'juan villoro'),
(37, 'todos somos migrantes', ''),
(38, 'juarez la rebelion interminable', 'pedro salmeron'),
(39, 'el pueblo es inmortal', 'vassili groosman'),
(40, 'perro de fuego', 'roberto f.levy'),
(41, 'sidharta', 'hesse'),
(42, 'no habra recreo', 'luis hernandez navarro'),
(43, 'emilio o de la educacion', 'rousseau'),
(44, 'el arte de cuidar a ti misma', 'jennifer louden'),
(45, 'asi hablaba zaratustra', 'federico metzchi'),
(46, 'the road runner', 'scary lesson'),
(47, 'el club de los corazones solitarios', 'elizabeth eulberg'),
(48, 'el universo de los jovenes', ''),
(49, 'maximo gorki', ''),
(50, 'el cid campeador', ''),
(51, 'un mundo feliz', 'aldo hukley'),
(52, 'diario de nikki', 'russell'),
(53, 'first word', ''),
(54, 'leon trotski 1905', ''),
(55, 'electronica de una victoria', 'mart batres guadarrama'),
(56, 'policias comunitarias y autodefensas', 'luis hernandez navarro'),
(57, 'los secretos de la excelencia', 'miguel angel cornejo'),
(58, 'los 7 hambitos de la gente altamente efec', ''),
(59, 'charlottes web', 'e.b.white'),
(60, 'compitiendo por el futuro', 'gary hamel'),
(61, 'corazon diario de un niño', 'edmundo de amicis'),
(62, 'yo la ciudad de mexico', 'jesus leticia mendoza perez'),
(63, 'anatomia politica de un gobernador', 'trinidad de alamillo'),
(64, 'interpetres y triunfos siglos xvl-xvll', 'julia preciado zamora'),
(65, 'lo que revela el juicio de tapes,colima', 'servando ortoll'),
(66, 'jose maria zamora \"el chema\" ', 'gabriel santander'),
(67, 'como suicidarte sin maestro', 'ruiz'),
(68, 'juntos pero no revueltos', 'javier cardena cardenas'),
(69, 'al diablo con la negatividad', 'leonardo stremberg'),
(70, 'inventario', 'juan jose arreola'),
(71, 'desert in bloom', ''),
(72, 'arizona', ''),
(73, 'como proteger a tus hijos contra las drog', ''),
(74, 'caballo de trolla 4', 'j.j.benitez'),
(75, 'caballo  de trolla 3', 'j.j.benitez'),
(76, 'a dream of red mansions', ''),
(77, 'la gran marcha', ''),
(78, 'a feast for crows', 'george r.r .martin'),
(79, 'a storm of swords', 'george r.r .martin'),
(80, 'a clash of kings', 'george r.r .martin'),
(81, 'two little girls in blue', 'mary higgins clark'),
(82, 'cuarto libro de ajedres', 'fred reinfeld'),
(83, 'tercer libro de ajedres', 'fred reinfeld'),
(84, 'segundo libro de ajedres', 'fred reinfeld');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id` int(1) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=85;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
