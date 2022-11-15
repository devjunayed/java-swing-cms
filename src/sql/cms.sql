-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2022 at 07:21 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `email`, `password`) VALUES
(1, 'admin', 'admin@gmail.com', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `author`
--

CREATE TABLE `author` (
  `id` int(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `question` varchar(250) NOT NULL,
  `answer` varchar(250) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `author`
--

INSERT INTO `author` (`id`, `username`, `email`, `question`, `answer`, `password`) VALUES
(5, 'author0', 'author0@gmail.com', '', '', 'junayed'),
(6, 'junayed', 'junayed@gmail.com', 'What is your childhood nickname?', 'china', 'junayed'),
(7, 'asdfasd', 'asdfsd@gmail.com', 'What is your first pet name?', 'kitty', 'junayed'),
(8, 'sabbir', 'sabbir@gmail.com', 'What is your first pet name?', 'kitty', 'fahim'),
(9, 'shanto', 'shanto@gmail.com', 'Who is your Favourite person?', 'simanto', 'shanto'),
(10, 'fahim', 'fahim0@gmail.com', 'Who is your Favourite person?', 'noman', 'fahim'),
(11, 'fahim1', 'fahim1@gmail.com', 'What is your pet name?', 'kutta', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `content`
--

CREATE TABLE `content` (
  `id` int(250) NOT NULL,
  `title` varchar(250) NOT NULL,
  `description` varchar(500) NOT NULL,
  `author` varchar(100) NOT NULL,
  `image` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `content`
--

INSERT INTO `content` (`id`, `title`, `description`, `author`, `image`) VALUES
(1, 'afasd', 'sadfsad', 'admin', ''),
(2, 'jjjljaljdsf', 'aljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljkdslfaljk', 'admin', ''),
(3, 'adfas', 'asdfas', 'admin', ''),
(4, 'afads', 'asdfs', 'admin', ''),
(5, 'adfasdf', 'asdfasd', 'admin', 'C:\\Users\\Junayed\\Pictures\\arnold-francisca-f77Bh3inUpE-unsplash.jpg'),
(6, 'adfasdf', 'asdfasd', 'admin', 'C:\\Users\\Junayed\\Pictures\\arnold-francisca-f77Bh3inUpE-unsplash.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `content`
--
ALTER TABLE `content`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `author`
--
ALTER TABLE `author`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `content`
--
ALTER TABLE `content`
  MODIFY `id` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
