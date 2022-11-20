-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 20, 2022 at 03:21 PM
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
(14, 'junayed', 'junayed@gmail.com', 'What is your nickname?', 'junayed', 'junayed'),
(15, 'fahim', 'fahim@gmail.com', 'What is your school name?', 'fahim', 'fahim'),
(16, 'sabbir', 'sabbir@gmail.com', 'What is your pet name?', 'lulu', 'sabbir'),
(17, 'nur hasnat', 'nurhasnat@gmail.com', 'Who is your favourite person?', 'nurhasnat', 'nurhasnat');

-- --------------------------------------------------------

--
-- Table structure for table `content`
--

CREATE TABLE `content` (
  `id` int(250) NOT NULL,
  `title` varchar(250) NOT NULL,
  `description` varchar(500) NOT NULL,
  `author` varchar(100) NOT NULL,
  `image` varchar(255) NOT NULL,
  `like` int(255) NOT NULL,
  `dislike` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `content`
--

INSERT INTO `content` (`id`, `title`, `description`, `author`, `image`, `like`, `dislike`) VALUES
(29, 'adfasd', 'kedare toi', 'admin', '', 0, 0),
(30, 'dsfasdfsdf', 'adfasadsfasdf', 'admin', '', 0, 0),
(31, 'How to make pasta', 'a;lkjdfl asdjlfksdj lfkasjdlfkasdj flkasdjflkasd jflksadj flasdjfasld; fjhndlkfh asdkljfhasdn sdljkfajsd lkfkjfka sdhlkaflksdhowheopiwehopcvahsboipufovhbsak;jlfn asldkjfhsbkjcv ihfb sanl;vbsdkjlv asiyvbnas ohnflkjasd mfhoiuasidbn cvosa dghoweqho[fui asbnoivuwbe[oiucvgbzxcjklvsado[jkvhboi[vhbsad0f9ywegh9SD;iocvouiasdchbasoidfhbasodihoiasdbopasdhcv]0s0 ioho;fhasdofnas[odif[hq-\n99fh\\ywqpifghasdo\'ifihaoghasdo\'ifhasodifyha]0s\'ftgasoidbvio[vhq=9we7]0fg[iasdyva-d\\', 'admin', '', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `pr_authors`
--

CREATE TABLE `pr_authors` (
  `id` int(250) NOT NULL,
  `username` varchar(250) NOT NULL,
  `question` varchar(255) NOT NULL,
  `answer` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `pr_content`
--

CREATE TABLE `pr_content` (
  `id` int(100) NOT NULL,
  `title` varchar(250) NOT NULL,
  `description` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `img` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

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
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `content`
--
ALTER TABLE `content`
  MODIFY `id` int(250) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
