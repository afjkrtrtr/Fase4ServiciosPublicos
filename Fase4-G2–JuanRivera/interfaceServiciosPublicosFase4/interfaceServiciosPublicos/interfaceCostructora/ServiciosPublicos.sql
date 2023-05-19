-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-04-2023 a las 02:03:34
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ServiciosPublicos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `email` varchar(45) NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
-- 

                                                                                                                                                                
INSERT INTO `cliente` (`id`, `nombre`, `numero`, `email`, `usuario`, `contraseña`) VALUES                                                     
(3, 'Camilo Alzate', 30056, 'camiloa37@gmail.com', 'camilo385', '491'),
(9, 'Caterine Hincapie', 3670588, 'caterinehincapie49@hotmail.com', 'cathin596', '193'),
(2, 'Erick Robledo', 3445790, 'erickrobl@gmail.com', 'erick45', 'Z385'),
(5901, 'Tatiana Caicedo', 3579014, 'tateca367@gmail.com', 'tetcaic369', '9'),
(48702, 'Aurelio Cheveroni', 30056895, 'aurelioclub10@hotmail.com', 'aureliano3824e', 'Au567'),
(347915, 'Samuel Valbuena', 3112478, 'samuelvalbuena26@gmail.com', 'samuel55', 'AER3f'),
(2479157, 'Falcao García', 34567, 'eltigreimitador34@gmail.com', 'eltigreimit130567', 'DESYB545'),
(2480138, 'Mariana Sepulveda', 30026, 'marianasepul524@gmail.com', 'mari', 'q2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `id` varchar(45) NOT NULL,
  `Area` varchar(45) NOT NULL,
  `Cargo` varchar(45) NOT NULL, 
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `numero` int(11) NOT NULL,
  `sexo` varchar(11) NOT NULL,
  `estadocivil` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` int(11) NOT NULL,  
  `email` varchar(45) NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--
INSERT INTO `empleado` (`id`, `Area`, `Cargo`, `nombre`, `apellidos`, `numero`, `sexo`, `estadocivil`, `direccion`, `telefono`, `email`) VALUES
(3, 'Almacen', 'coordinadores de area', 'Luis', 'Micolta', 604017, 'masculino', 'soltero', 'Carrera 64 C # 78-19 Apartamento 34',  '4508469', 'luismicolta23@gmail.com'),
(5, 'facturadores', 'coordinadores de area', 'Carmen', 'Buendia', 30026, 'femenino', 'casada', 'Carrera 37 C # 32-47 Apartamento 46', '4807245', 'carmenbuendia45@gmail.com'),
(7, 'cuadrilla', 'coordinadores de area', 'Esteban', 'Cambiazzo', 40075, 'transmale', 'divorciada', 'Carrera 57 C # 69-12 Apartamento 50', '6702349', 'estebancambiazzo@gmail.com'),
(2, 'administrativo', 'coordinadores de area', 'Tatiana', 'Liberta', 6007, 'transfemale', 'viuda', 'Carrera 79 C # 12-39 Apartamento 43', '2305187', 'tatianaliberta67@gmail.com'),
(93, 'oriente', 'facturadores', 'Camilo', 'Maya', 3407781, 'masculino', 'casado', 'Carrera 36 C # 17-94 Apartamento 68', '4607354', 'camilomaya32@gmail.com'),
(318057, 'occidente', 'facturadores', 'Dayana', 'Perez', 2006507790, 'femenino', 'unionlibre', 'Carrera 46 A # 80-26 Departamento 41', '5907138', 'dayanaperez28@gmail.com'),
(4708913, 'norte', 'facturadores', 'Horacio', 'Gomez', 700150, 'transmale', 'soltero', 'Carrera 82 B # 30-59 Departamento 27', '7902695', 'horaciogamez42@gmail.com'),
(5798451, 'sur', 'facturadores', 'Caterina', 'Posada', 697832, 'transfemale', 'divorciada', 'Carrera 95 E # 35-81 Apartamento 61', '3704468', 'caterinaposada78@gmail.com'),
(9, 'cuadrilla', 'alcantarillado', 'Daniel', 'Giraldo', 400750, 'transmale', 'divorciada', 'Carrera 57 C # 69-12 Apartamento 50', '6702349', 'estebancambiazzo@gmail.com'),
(2641, 'administrativo', 'coordinadores de area', 'Tatiana', 'Liberta', 60079, 'transfemale', 'viuda', 'Carrera 79 C # 12-39 Apartamento 43', '2305187', 'tatianaliberta67@gmail.com'),
(27910, 'oriente', 'facturadores', 'Camilo', 'Maya', 3407781, 'masculino', 'casado', 'Carrera 36 C # 17-94 Apartamento 68', '4607354', 'camilomaya32@gmail.com'),
(318056, 'occidente', 'facturadores', 'Dayana', 'Perez', 2006507790, 'femenino', 'unionlibre', 'Carrera 46 A # 80-26 Departamento 41', '5907138', 'dayanaperez28@gmail.com'),
(4708933, 'norte', 'facturadores', 'Horacio', 'Gomez', 7001503, 'transmale', 'soltero', 'Carrera 82 B # 30-59 Departamento 27', '7902695', 'horaciogamez42@gmail.com'),
(5798421, 'sur', 'facturadores', 'Caterina', 'Posada', 697832, 'transfemale', 'divorciada', 'Carrera 95 E # 35-81 Apartamento 61', '3704468', 'caterinaposada78@gmail.com');
-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id` int(11) NOT NULL,
  `nombrePedido` varchar(45) NOT NULL,
  `clienteIdidid` int(11) NOT NULL,
  `cantidadPedido` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id`, `nombrePedido`, `clienteIdidid`, `cantidadPedido`) VALUES
(12, 'taladro', 2, 2),
(15, 'arena', 2, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` int(11) NOT NULL,
  `ididcliente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `codigo`, `tipo`, `cantidad`, `precio`, `ididcliente`) VALUES
(30, 20, 'cono', 1, 300000, 2),
(31, 21, 'carreta', 1, 200000, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1027544;

--
-- AUTO_INCREMENT de la tabla `empleado`
--
ALTER TABLE `empleado`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
