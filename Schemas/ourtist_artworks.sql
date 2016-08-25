CREATE DATABASE  IF NOT EXISTS `ourtist` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ourtist`;
-- MySQL dump 10.13  Distrib 5.6.17, for Win32 (x86)
--
-- Host: 127.0.0.1    Database: ourtist
-- ------------------------------------------------------
-- Server version	5.6.21-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `artworks`
--

DROP TABLE IF EXISTS `artworks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `artworks` (
  `idartworks` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` text,
  `artist` varchar(45) DEFAULT NULL,
  `likes` int(11) DEFAULT '0',
  `location` varchar(45) DEFAULT NULL,
  `file_location` varchar(1000) DEFAULT NULL,
  `filename` varchar(45) DEFAULT NULL,
  `isapprov` int(11) DEFAULT '0',
  PRIMARY KEY (`idartworks`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artworks`
--

LOCK TABLES `artworks` WRITE;
/*!40000 ALTER TABLE `artworks` DISABLE KEYS */;
INSERT INTO `artworks` VALUES (1,'n,mn,n','gccghf','kkjbkjb',3,'Marikina',NULL,'Art3.jpg',0),(2,'ffsda','sadfasd','safaf',2,'Manila',NULL,'Art2.jpg',1),(3,'affa','saa','asf',1,'Makati',NULL,'image2.png',1),(4,'fafa','affas','afa',5,'afasfsad',NULL,'image1.jpg',1),(7,'asdfsa','afdasfas','asdfa',6,'asdfafasdfass',NULL,'1472038328070-image.jpg',0),(8,'dada','asfda','adasf',0,'asdfasf',NULL,'1472053590063-image.jpg',0),(9,'fdas','asdffa','asdfaf',0,'asdfaf',NULL,'1472053927702-image.jpg',0),(10,'fdas','asdffa','asdfaf',0,'asdfaf',NULL,'1472054725564-image.jpg',0),(11,'testwwe','wetw','wetw',0,'wettw',NULL,'Image1472055583410.jpg',0),(12,'asdsad','asdfas','asdfsafasd',0,'asdfasd',NULL,'Image1472089099179.jpg',0),(13,'dsafsaf','asdfadf','fsdafa',0,'sdaf',NULL,'Image1472089311895.jpg',0);
/*!40000 ALTER TABLE `artworks` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-08-25 10:43:48
