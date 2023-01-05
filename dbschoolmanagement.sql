-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 05, 2023 at 12:26 PM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbschoolmanagement`
--

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
  `ClassID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`ClassID`, `Name`) VALUES
(1, 'KG'),
(2, 'One'),
(3, 'Two'),
(4, 'Three');

-- --------------------------------------------------------

--
-- Table structure for table `classes`
--

CREATE TABLE `classes` (
  `ClassesID` int(11) NOT NULL,
  `ClassID` int(11) NOT NULL,
  `SectionID` int(11) NOT NULL,
  `TeacherID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `classes`
--

INSERT INTO `classes` (`ClassesID`, `ClassID`, `SectionID`, `TeacherID`) VALUES
(1, 1, 1, 1),
(2, 2, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `examination`
--

CREATE TABLE `examination` (
  `ExamID` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date NOT NULL,
  `Status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `examination`
--

INSERT INTO `examination` (`ExamID`, `Name`, `StartDate`, `EndDate`, `Status`) VALUES
(1, 'Mid', '2021-12-01', '2022-12-01', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `fee`
--

CREATE TABLE `fee` (
  `FeeID` int(11) NOT NULL,
  `StudentID` int(11) NOT NULL,
  `FeeMonth` varchar(50) NOT NULL,
  `Date` date NOT NULL,
  `Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fee`
--

INSERT INTO `fee` (`FeeID`, `StudentID`, `FeeMonth`, `Date`, `Amount`) VALUES
(1, 3, 'jj', '2020-01-01', 7000),
(1, 3, 'jj', '2020-01-01', 7000);

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `ExamID` int(11) NOT NULL,
  `StudentID` int(11) NOT NULL,
  `TeacherID` int(11) NOT NULL,
  `TotalMarks` int(11) NOT NULL,
  `ObtainedMarks` int(11) NOT NULL,
  `Result` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`ExamID`, `StudentID`, `TeacherID`, `TotalMarks`, `ObtainedMarks`, `Result`) VALUES
(2, 3, 4, 100, 20, 0);

-- --------------------------------------------------------

--
-- Table structure for table `sections`
--

CREATE TABLE `sections` (
  `SectionID` int(11) NOT NULL,
  `SectionName` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sections`
--

INSERT INTO `sections` (`SectionID`, `SectionName`) VALUES
(1, 'Blue'),
(2, 'Green');

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `StudentID` int(11) NOT NULL,
  `AdmissionNumber` int(11) NOT NULL,
  `StudentName` varchar(255) NOT NULL,
  `FatherName` varchar(255) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `Phone` varchar(255) DEFAULT NULL,
  `Address` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `ClassesID` int(11) DEFAULT NULL,
  `Status` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`StudentID`, `AdmissionNumber`, `StudentName`, `FatherName`, `DateOfBirth`, `Phone`, `Address`, `Email`, `ClassesID`, `Status`) VALUES
(3, 123, 'Zubair Kohi', 'Nameer', '2020-01-01', '6666', 'Kohi ', 'SSS@gmail.com', 2, '1');

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE `teachers` (
  `TeacherID` int(11) NOT NULL,
  `RegistrationNumber` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Father` varchar(50) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `CNIC` varchar(15) NOT NULL,
  `Qualification` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `RegistrationDate` date NOT NULL,
  `Status` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `teachers`
--

INSERT INTO `teachers` (`TeacherID`, `RegistrationNumber`, `Name`, `Father`, `DateOfBirth`, `Phone`, `CNIC`, `Qualification`, `Email`, `Address`, `RegistrationDate`, `Status`) VALUES
(1, 1000, 'Jabir', 'Rasheed', '2012-12-06', '031113334', '52302452233', 'BA', 'Jabir@gmail.com', 'Malir KHi', '2022-12-08', '1'),
(4, 88, 'wajid', 'Zaheer', '2020-01-01', '666', '222', 'jjj', 'jjj@gmail.com', 'jjj', '2020-02-01', '1'),
(12, 12, 'Nigar', 'Balach', '2020-01-01', '666', '666', 'BA', 'hhh@gmail.com', 'Kohi', '2020-01-01', '1'),
(14, 126, 'Nigar', 'Balach', '2020-01-01', '666', '666', 'BA', 'hhh@gmail.com', 'Kohi', '2020-01-01', '1'),
(32, 234, 'Saeedullah', 'Qa', '2020-01-01', '+923111335594', '33', 'Ba', 'Saeedullahqamar@gmail.com', 'Kohi Goth Malir Karachi', '2020-01-01', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sections`
--
ALTER TABLE `sections`
  ADD PRIMARY KEY (`SectionID`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`StudentID`);

--
-- Indexes for table `teachers`
--
ALTER TABLE `teachers`
  ADD PRIMARY KEY (`TeacherID`),
  ADD UNIQUE KEY `RegistrationNumber` (`RegistrationNumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `StudentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
