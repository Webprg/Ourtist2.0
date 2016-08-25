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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `idusers` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` tinytext,
  `password` tinytext,
  `email_address` tinytext,
  `membership` int(11) DEFAULT '0',
  PRIMARY KEY (`idusers`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'E@YAHOO.COM','P@SSword','edafw',0),(2,'afa','asfa','sf',0),(3,'ede','dwdew','weewd',0),(4,'afa','afdasd','asdfafa',0),(5,'fafd','dfs','fa',0),(6,'afasd','asfsafa','asfasfs',0),(7,'afasd','asfsafa','asfasfs',0),(8,'afsddasf','asdfafa','asdfafasfsfaf',0),(9,'dfcfhfg','ghfdghdhg','dghdjgfjh',0),(10,'vadfasf','asdfa','asdfasdfa',0),(11,'asdfasf','afasdfsdf','afasdfsdfaffdsf',0),(12,'afdaf','asfaf','asfasdfs',0),(13,'fdasfasd','sfdasfa','afsafs',0),(14,'fafd','fasdfda','asfasdf',0),(15,'Corpzinga@yahoo.hcom','afdafdaf','asdfaff',0),(16,'dasfaf','asfaf','asfaf',0),(17,'affasd','asfsda','asdfasaf',0),(18,'asdfadf','asfaf','asdfa',0),(19,'ed@yahoo','afdaf','ws',0),(20,'fdsaf','asdfaf','adsfasf',0),(21,'sfgs','opentidessdggds','dsgdgssd',0),(22,'waw','gg','hihi',0),(23,'werwe','wrewrw','werwwer',0),(24,'admin','opentides','hbhhkjhj',0),(25,'afa','opentides','asdfadf',0),(26,'afa','opentides','asdfaf',0),(27,'newwwww','asfsdaffffffffffff','asdf',0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
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
