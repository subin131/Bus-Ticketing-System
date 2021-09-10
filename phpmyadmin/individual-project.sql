-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:4000
-- Generation Time: Sep 10, 2021 at 06:25 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `individual-project`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `Booking_ID` int(255) NOT NULL,
  `FirstName` varchar(1000) NOT NULL,
  `LastName` varchar(1000) NOT NULL,
  `Mobile` varchar(1000) NOT NULL,
  `Address` varchar(1000) NOT NULL,
  `Gender` varchar(1000) NOT NULL,
  `Booking Date` varchar(1000) NOT NULL,
  `Destination` varchar(1000) NOT NULL,
  `Book Days` int(255) NOT NULL,
  `Book Total Seat` int(255) NOT NULL,
  `Bus Type` varchar(1000) NOT NULL,
  `Payment Type` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`Booking_ID`, `FirstName`, `LastName`, `Mobile`, `Address`, `Gender`, `Booking Date`, `Destination`, `Book Days`, `Book Total Seat`, `Bus Type`, `Payment Type`) VALUES
(0, 'thapa', '98552364', 'banepa', 'male', '2021-3-31', 'pokhara', '2', 5, 22, '', 'cash'),
(108, 'sar', 'jat', '987654234', 'palpa', 'Others', '2021-09-17', 'Pokhara', 21, 1, '--Select--', 'E-Pay'),
(147, 'hellp', 'helo1', '9876543', 'ktm', 'Others', '23456', 'Mustang', 5, 12, 'AC', 'Cash'),
(439, '11', '1111111', '1111111111', '11111111111', 'Male', '111111111', 'Taplejung', 88, 12, 'AC', 'E-Pay'),
(501, 'sita', 'thapa', '985643235', 'kalanki', 'Female', '2021-9-8', 'Mustang', 12, 54, 'Non-AC', 'Cash'),
(507, 'erfgth', 'xcvb', '4566', 'fdvv', 'Male', '23456', 'Mustang', 3, 6, 'AC', 'Cash'),
(509, '12', '1', '35', 'hgfd', 'Male', '46', 'Pokhara', 5, 3, 'Non-AC', 'Cash'),
(765, 'ram kaji', 'shrestha', '98675423', 'banepa', 'Male', '2021-6-8', '--Select--', 3, 11, '--Select--', 'E-Pay'),
(786, 'satyal', 'sabin', '987543223', 'banepa', 'male', '3030-12-31', 'pokhara', 3, 3, 'ac', 'cash'),
(822, 'ram', '1', '1', '1', 'Male', '1', 'Pokhara', 1, 1, 'AC', 'E-Pay'),
(830, 'dfhgjhkj', 'mndbg', '987654', 'ktm', 'Male', '34r5t678', 'Pokhara', 3, 5, 'AC', 'Cash'),
(919, '1', '23', '4567', '76543', 'Male', '4567', 'Kathmandu', 4, 6, 'AC', 'Cash'),
(933, 'surenjan', 'satyal', '98675435', 'fcgvhgjb', 'Male', '2345678', 'Mustang', 6, 12, 'AC', '--Select--');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `UserID` int(255) NOT NULL,
  `FirstName` varchar(1000) NOT NULL,
  `LastName` varchar(1000) NOT NULL,
  `Username` varchar(1000) NOT NULL,
  `Password` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`UserID`, `FirstName`, `LastName`, `Username`, `Password`) VALUES
(12, 'df', 'hgf', 'satyal', '123'),
(50, 'messi123', 'leo', 'messi', 'psg'),
(117, 'subin', 'satyal', 'hero', '2020'),
(212, 'discord', 'student', 'collage', '2021'),
(342, 'fname2020', 'lname2020', 'user2020', '2020'),
(449, 'subin@123', 'subin', 'satyal', '2021'),
(476, 'thaapa', 'meCr7', 'ronaldo', '123'),
(536, 'kunjan123', 'kunjan', 'satyal', '12345'),
(542, '789', '10', '124', 'qwe'),
(598, 'fname22', 'lname33', 'uname11', '123'),
(659, 'ram', 'thapa', 'ram123', '123'),
(660, 'hi', 'hello', 'hey2020', '1234'),
(661, 'cr7', 'cristiano', 'ronaldo', 'mu'),
(775, 'fname2', 'uname1', 'lname3', '123'),
(811, 'leo', 'messi@123', 'mesi', 'qwe'),
(821, 'shrestha', 'keshab123', 'keshab', '987');

-- --------------------------------------------------------

--
-- Table structure for table `user-booking`
--

CREATE TABLE `user-booking` (
  `UserID` int(255) NOT NULL,
  `BookingID` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user-booking`
--

INSERT INTO `user-booking` (`UserID`, `BookingID`) VALUES
(12, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`Booking_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`UserID`);

--
-- Indexes for table `user-booking`
--
ALTER TABLE `user-booking`
  ADD KEY `UserID` (`UserID`),
  ADD KEY `BookingID` (`BookingID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `user-booking`
--
ALTER TABLE `user-booking`
  ADD CONSTRAINT `user-booking_ibfk_1` FOREIGN KEY (`UserID`) REFERENCES `user` (`UserID`),
  ADD CONSTRAINT `user-booking_ibfk_2` FOREIGN KEY (`BookingID`) REFERENCES `booking` (`Booking_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
