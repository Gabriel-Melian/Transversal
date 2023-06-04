-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-06-2023 a las 08:30:03
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `universidad`
--
CREATE DATABASE IF NOT EXISTS `universidad` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `universidad`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE IF NOT EXISTS `alumno` (
  `id_Alumno` int(11) NOT NULL AUTO_INCREMENT,
  `dni` int(11) NOT NULL,
  `apellido` varchar(100) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_Alumno`),
  UNIQUE KEY `dni` (`dni`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id_Alumno`, `dni`, `apellido`, `nombre`, `fecha_nacimiento`, `estado`) VALUES
(1, 43491021, 'Melian', 'Gabriel', '2000-11-03', 0),
(2, 42483024, 'Mansilla', 'Dario', '1994-06-29', 0),
(3, 29960012, 'Moll Montiveros', 'Jesica ', '1983-05-12', 1),
(4, 43562319, 'Jofre', 'Santiago', '2001-04-03', 0),
(5, 32654782, 'Villar', 'Emanuel', '1999-07-15', 0),
(6, 31457390, 'Rodriguez', 'Miguel', '1998-06-20', 0),
(7, 35748834, 'Gonzalez', 'Ezequiel', '1997-10-21', 1),
(8, 36674723, 'Saez', 'Juanjo', '1998-04-12', 1),
(9, 121212, 'ggggg', 'dddd', '2023-06-08', 0),
(10, 1321321, 'fffff', 'ssss', '2023-06-09', 0),
(17, 222, 'kjhk', 'jkhkj', '2023-06-15', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripcion`
--

CREATE TABLE IF NOT EXISTS `inscripcion` (
  `id_Inscripto` int(11) NOT NULL AUTO_INCREMENT,
  `nota` int(11) NOT NULL,
  `id_Alumno` int(11) NOT NULL,
  `id_Materia` int(11) NOT NULL,
  PRIMARY KEY (`id_Inscripto`),
  UNIQUE KEY `id_Alumno` (`id_Alumno`,`id_Materia`),
  KEY `id_Materia` (`id_Materia`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `inscripcion`
--

INSERT INTO `inscripcion` (`id_Inscripto`, `nota`, `id_Alumno`, `id_Materia`) VALUES
(1, 0, 1, 1),
(2, 0, 1, 2),
(3, 8, 2, 2),
(4, 8, 2, 3),
(5, 3, 3, 3),
(7, 0, 4, 1),
(8, 0, 4, 2),
(9, 0, 5, 5),
(10, 0, 5, 6),
(11, 0, 6, 3),
(12, 0, 6, 2),
(14, 0, 7, 3),
(16, 0, 7, 8),
(17, 0, 7, 6),
(18, 0, 7, 5),
(19, 0, 7, 4),
(21, 0, 3, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE IF NOT EXISTS `materia` (
  `id_Materia` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `anio` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_Materia`),
  UNIQUE KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_Materia`, `nombre`, `anio`, `estado`) VALUES
(1, 'Matematica', 2023, 0),
(2, 'Biologia', 2022, 1),
(3, 'Laboratorio l', 2022, 1),
(4, 'Ingles', 2018, 0),
(5, 'EDA', 2023, 1),
(6, 'WEB I', 2022, 1),
(8, 'Gabriel ', 2020, 0),
(9, 'Laboratorio 2', 2023, 1);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `inscripcion`
--
ALTER TABLE `inscripcion`
  ADD CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`id_Materia`) REFERENCES `materia` (`id_Materia`),
  ADD CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`id_Alumno`) REFERENCES `alumno` (`id_Alumno`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
