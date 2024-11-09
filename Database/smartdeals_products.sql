-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: smartdeals
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `prod_id` int unsigned NOT NULL AUTO_INCREMENT,
  `prod_name` varchar(45) NOT NULL,
  `prod_image` varchar(45) NOT NULL,
  `aprice` int unsigned NOT NULL,
  `f_price` int unsigned NOT NULL,
  `c_price` int unsigned NOT NULL,
  `category` varchar(45) NOT NULL,
  PRIMARY KEY (`prod_id`),
  UNIQUE KEY `prod_id_UNIQUE` (`prod_id`),
  UNIQUE KEY `prod_name_UNIQUE` (`prod_name`),
  UNIQUE KEY `prod_image_UNIQUE` (`prod_image`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'SAMSUNG GALAXY S22','SAMSUNG_GALAXY_S22.jpg',59999,56999,62999,'MOBILE'),(2,'SAMSUNG GALAXY S22 ULTRA','SAMSUNG_GALAXY_S22_ULTRA.jpg',100999,106000,99999,'MOBILE'),(3,'IPHONE 14','IPHONE_14.jpg',86900,85999,89900,'MOBILE'),(4,'REDMI K50 I','REDMI_K50_I.jpg',36900,35999,32999,'MOBILE'),(5,'IPHONE 13','IPHONE_13.jpg',56999,54999,59999,'MOBILE'),(6,'ONE PLUS 10 PRO','ONE_PLUS_10_PRO.jpg',61999,59999,63999,'MOBILE'),(7,'IPHONE 13 PRO','IPHONE_13_PRO.jpg',103900,103900,99000,'MOBILE'),(8,'IPHONE 13 PRO MAX','IPHONE_13_PRO_MAX.jpg',115900,115900,109990,'MOBILE'),(9,'LENOVO LEGION 5 I5','LENOVO_LEGION_5_I5.jpg',70750,70890,72990,'LAPTOP'),(10,'ASUS TUF A15 I5','ASUS_TUF_A15_I5.jpg',55990,56990,52990,'LAPTOP'),(11,'DELL G15 GAMING I5','DELL_G15_GAMING_I5.jpg',75999,78990,74089,'LAPTOP'),(12,'SONY BRAVIA 55 INCHES','SONY_BRAVIA_55_INCHES.jpg',99999,90990,97899,'TV'),(13,'HP PAVILLION I5','HP_PAVILLION_I5.jpg',59830,54870,57990,'LAPTOP'),(14,'IQOO 9T','IQOO_9T.jpg',45999,48999,49999,'MOBILE'),(15,'VIVO V25 PRO','VIVO_V25_PRO.jpg',31999,34999,35999,'MOBILE'),(16,'ONEPLUS NORD 2T','ONEPLUS_NORD_2T.jpg',28999,29999,28999,'MOBILE'),(17,'PIXEL 7 PRO','PIXEL_7_PRO.jpg',85999,84999,84999,'MOBILE'),(18,'MI NOTEBOOK ULTRA','MI_NOTEBOOK_ULTRA.jpg',63999,65999,68999,'LAPTOP'),(19,'ASUS PROART','ASUS_PROART.jpg',84990,85900,84990,'LAPTOP'),(20,'APPLE MACBOOK AIR','APPLE_MACBOOK_AIR.jpg',199990,121000,120990,'LAPTOP'),(21,'SAMSUNG GALAXY BOOK PRO 2','SAMSUNG_GALAXY_BOOK_PRO_2.jpg',134990,130990,135990,'LAPTOP'),(22,'ACER HD TV 40 INCH ','ACER_HD_TV_40_INCH.jpg',17999,18990,17990,'TV'),(23,'REDMI TV 43 INCH','REDMI_TV_43_INCH.jpg',23999,24990,24590,'TV'),(24,'SAMSUNG 4K TV 43 INCH ','SAMSUNG_4K_TV_43_INCH.jpg',34990,35000,34999,'TV'),(25,'REALME 4K TV','REALME_4K_TV.jpg',27999,28999,26990,'TV'),(26,'ASUS ZEPHYRUS 14','ASUS_ZEPHYRUS_14.jpg',98990,103990,101999,'LAPTOP'),(27,'REALME 9 PRO','REALME_9_PRO.jpg',21999,20990,20500,'MOBILE');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-11 15:19:14