-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: java18_shopping
-- ------------------------------------------------------
-- Server version	8.0.32

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

CREATE SCHEMA java18_shopping CHAR SET utf8mb4;

USE java18_shopping;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bill` (
  `ID` int NOT NULL,
  `CREATED_AT` datetime DEFAULT CURRENT_TIMESTAMP,
  `ORDER_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNIQUE_ORDER_ID` (`ORDER_ID`),
  CONSTRAINT `FK_BILL_ORDER` FOREIGN KEY (`ORDER_ID`) REFERENCES `order` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES (1,'2023-07-09 22:05:02',1),(2,'2023-07-09 22:05:02',2),(3,'2023-07-09 22:05:02',3),(4,'2023-07-09 22:05:02',4),(7,'2023-07-09 22:05:02',7),(8,'2023-07-09 22:05:02',8),(9,'2023-07-09 22:05:02',9),(10,'2023-07-09 22:05:02',10);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `DATE_OF_BIRTH` date NOT NULL,
  `ADDRESS` text,
  `PHONE` varchar(20) DEFAULT NULL,
  `GENDER` bit(1) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Susan','1975-10-14','Hòa Khánh Nam','123456789',_binary '\0','susan@gmail.com','12345678'),(2,'Smith','1999-07-12','Hòa Châu','123456789',_binary '','smith@gmail.com','12345678'),(3,'Henry','1988-01-10','Hải Châu 1','123456789',_binary '','henry@gmail.com','12345678'),(4,'Pepe','2002-05-22','Hòa Hiệp Bắc','123456789',_binary '','pepe@gmail.com','12345678'),(5,'Carlos','1992-08-28','Hòa Minh','123456789',_binary '\0','carlis@gmail.com','12345678');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery_status`
--

DROP TABLE IF EXISTS `delivery_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `delivery_status` (
  `ID` int NOT NULL,
  `DESC` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery_status`
--

LOCK TABLES `delivery_status` WRITE;
/*!40000 ALTER TABLE `delivery_status` DISABLE KEYS */;
INSERT INTO `delivery_status` VALUES (1,'Chờ xác nhận'),(2,'Xác nhận thành công'),(3,'Đang đóng gói'),(4,'Đóng gói thành công'),(5,'Đang giao hàng'),(6,'Giao hàng thành công'),(7,'Hủy đơn hàng'),(8,'Giao hàng thất bại');
/*!40000 ALTER TABLE `delivery_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES (1,'Bộ phận nhân sự'),(2,'Bộ phận bán hàng'),(3,'Bộ phận giao hàng'),(4,'Bộ phận giảm sát'),(5,'Bộ phận quảng cáo');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `DATE_OF_BIRTH` date NOT NULL,
  `ADDRESS` text,
  `PHONE` varchar(20) DEFAULT NULL,
  `GENDER` bit(1) NOT NULL,
  `EMAIL` varchar(100) NOT NULL,
  `PASSWORD` varchar(100) NOT NULL,
  `DEPARTMENT_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_EMPLOYEE_DEPARTMENT` (`DEPARTMENT_ID`),
  CONSTRAINT `FK_EMPLOYEE_DEPARTMENT` FOREIGN KEY (`DEPARTMENT_ID`) REFERENCES `department` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Nhân viên A','2001-10-18','Đà Nẵng','123456789',_binary '\0','nhanviena@gmail.com','12345678',1),(2,'Nhân viên B','2002-10-12','Đà Nẵng','123456789',_binary '','nhanvienb@gmail.com','12345678',1),(3,'Nhân viên C','2003-04-14','Đà Nẵng','123456789',_binary '','nhanvienc@gmail.com','12345678',2),(4,'Nhân viên D','2001-11-22','Đà Nẵng','123456789',_binary '','nhanviend@gmail.com','12345678',3),(5,'Nhân viên E','2001-06-08','Đà Nẵng','123456789',_binary '\0','nhanviene@gmail.com','12345678',2),(6,'Nhân viên F','2002-10-10','Đà Nẵng','123456789',_binary '\0','nhanvienf@gmail.com','12345678',2),(7,'Nhân viên G','2001-07-19','Đà Nẵng','123456789',_binary '','nhanvieng@gmail.com','12345678',4),(8,'Nhân viên K','2005-02-27','Đà Nẵng','123456789',_binary '\0','nhanvienk@gmail.com','12345678',5);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_title`
--

DROP TABLE IF EXISTS `employee_title`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_title` (
  `EMPLOYEE_ID` int NOT NULL,
  `TITLE_ID` int NOT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`,`TITLE_ID`),
  KEY `FK_ET_TITLE` (`TITLE_ID`),
  CONSTRAINT `FK_ET_EMPLOYEE` FOREIGN KEY (`EMPLOYEE_ID`) REFERENCES `employee` (`ID`),
  CONSTRAINT `FK_ET_TITLE` FOREIGN KEY (`TITLE_ID`) REFERENCES `title` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_title`
--

LOCK TABLES `employee_title` WRITE;
/*!40000 ALTER TABLE `employee_title` DISABLE KEYS */;
INSERT INTO `employee_title` VALUES (1,1),(2,1),(7,1),(3,2),(4,2),(7,2),(4,3),(8,3),(2,4),(6,4),(5,5);
/*!40000 ALTER TABLE `employee_title` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `int_array`
--

DROP TABLE IF EXISTS `int_array`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `int_array` (
  `VAL` int NOT NULL,
  PRIMARY KEY (`VAL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `int_array`
--

LOCK TABLES `int_array` WRITE;
/*!40000 ALTER TABLE `int_array` DISABLE KEYS */;
INSERT INTO `int_array` VALUES (1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14),(15),(16),(17),(18),(19),(20),(21),(22),(23),(24),(25),(26),(27),(28),(29),(30),(31),(32),(33),(34),(35),(36),(37),(38),(39),(40),(41),(42),(43),(44),(45),(46),(47),(48),(49),(50),(51),(52),(53),(54),(55),(56),(57),(58),(59),(60),(61),(62),(63),(64),(65),(66),(67),(68),(69),(70),(71),(72),(73),(74),(75),(76),(77),(78),(79),(80),(81),(82),(83),(84),(85),(86),(87),(88),(89),(90),(91),(92),(93),(94),(95),(96),(97),(98),(99),(100),(101),(102),(103),(104),(105),(106),(107),(108),(109),(110),(111),(112),(113),(114),(115),(116),(117),(118),(119),(120),(121),(122),(123),(124),(125),(126),(127),(128),(129),(130),(131),(132),(133),(134),(135),(136),(137),(138),(139),(140),(141),(142),(143),(144),(145),(146),(147),(148),(149),(150),(151),(152),(153),(154),(155),(156),(157),(158),(159),(160),(161),(162),(163),(164),(165),(166),(167),(168),(169),(170),(171),(172),(173),(174),(175),(176),(177),(178),(179),(180),(181),(182),(183),(184),(185),(186),(187),(188),(189),(190),(191),(192),(193),(194),(195),(196),(197),(198),(199),(200),(201),(202),(203),(204),(205),(206),(207),(208),(209),(210),(211),(212),(213),(214),(215),(216),(217),(218),(219),(220),(221),(222),(223),(224),(225),(226),(227),(228),(229),(230),(231),(232),(233),(234),(235),(236),(237),(238),(239),(240),(241),(242),(243),(244),(245),(246),(247),(248),(249),(250),(251),(252),(253),(254),(255),(256),(257),(258),(259),(260),(261),(262),(263),(264),(265),(266),(267),(268),(269),(270),(271),(272),(273),(274),(275),(276),(277),(278),(279),(280),(281),(282),(283),(284),(285),(286),(287),(288),(289),(290),(291),(292),(293),(294),(295),(296),(297),(298),(299),(300),(301),(302),(303),(304),(305),(306),(307),(308),(309),(310),(311),(312),(313),(314),(315),(316),(317),(318),(319),(320),(321),(322),(323),(324),(325),(326),(327),(328),(329),(330),(331),(332),(333),(334),(335),(336),(337),(338),(339),(340),(341),(342),(343),(344),(345),(346),(347),(348),(349),(350),(351),(352),(353),(354),(355),(356),(357),(358),(359),(360),(361),(362),(363),(364),(365),(366),(367),(368),(369),(370),(371),(372),(373),(374),(375),(376),(377),(378),(379),(380),(381),(382),(383),(384),(385),(386),(387),(388),(389),(390),(391),(392),(393),(394),(395),(396),(397),(398),(399),(400),(401),(402),(403),(404),(405),(406),(407),(408),(409),(410),(411),(412),(413),(414),(415),(416),(417),(418),(419),(420),(421),(422),(423),(424),(425),(426),(427),(428),(429),(430),(431),(432),(433),(434),(435),(436),(437),(438),(439),(440),(441),(442),(443),(444),(445),(446),(447),(448),(449),(450),(451),(452),(453),(454),(455),(456),(457),(458),(459),(460),(461),(462),(463),(464),(465),(466),(467),(468),(469),(470),(471),(472),(473),(474),(475),(476),(477),(478),(479),(480),(481),(482),(483),(484),(485),(486),(487),(488),(489),(490),(491),(492),(493),(494),(495),(496),(497),(498),(499),(500),(501),(502),(503),(504),(505),(506),(507),(508),(509),(510),(511),(512),(513),(514),(515),(516),(517),(518),(519),(520),(521),(522),(523),(524),(525),(526),(527),(528),(529),(530),(531),(532),(533),(534),(535),(536),(537),(538),(539),(540),(541),(542),(543),(544),(545),(546),(547),(548),(549),(550),(551),(552),(553),(554),(555),(556),(557),(558),(559),(560),(561),(562),(563),(564),(565),(566),(567),(568),(569),(570),(571),(572),(573),(574),(575),(576),(577),(578),(579),(580),(581),(582),(583),(584),(585),(586),(587),(588),(589),(590),(591),(592),(593),(594),(595),(596),(597),(598),(599),(600),(601),(602),(603),(604),(605),(606),(607),(608),(609),(610),(611),(612),(613),(614),(615),(616),(617),(618),(619),(620),(621),(622),(623),(624),(625),(626),(627),(628),(629),(630),(631),(632),(633),(634),(635),(636),(637),(638),(639),(640),(641),(642),(643),(644),(645),(646),(647),(648),(649),(650),(651),(652),(653),(654),(655),(656),(657),(658),(659),(660),(661),(662),(663),(664),(665),(666),(667),(668),(669),(670),(671),(672),(673),(674),(675),(676),(677),(678),(679),(680),(681),(682),(683),(684),(685),(686),(687),(688),(689),(690),(691),(692),(693),(694),(695),(696),(697),(698),(699),(700),(701),(702),(703),(704),(705),(706),(707),(708),(709),(710),(711),(712),(713),(714),(715),(716),(717),(718),(719),(720),(721),(722),(723),(724),(725),(726),(727),(728),(729),(730),(731),(732),(733),(734),(735),(736),(737),(738),(739),(740),(741),(742),(743),(744),(745),(746),(747),(748),(749),(750),(751),(752),(753),(754),(755),(756),(757),(758),(759),(760),(761),(762),(763),(764),(765),(766),(767),(768),(769),(770),(771),(772),(773),(774),(775),(776),(777),(778),(779),(780),(781),(782),(783),(784),(785),(786),(787),(788),(789),(790),(791),(792),(793),(794),(795),(796),(797),(798),(799),(800),(801),(802),(803),(804),(805),(806),(807),(808),(809),(810),(811),(812),(813),(814),(815),(816),(817),(818),(819),(820),(821),(822),(823),(824),(825),(826),(827),(828),(829),(830),(831),(832),(833),(834),(835),(836),(837),(838),(839),(840),(841),(842),(843),(844),(845),(846),(847),(848),(849),(850),(851),(852),(853),(854),(855),(856),(857),(858),(859),(860),(861),(862),(863),(864),(865),(866),(867),(868),(869),(870),(871),(872),(873),(874),(875),(876),(877),(878),(879),(880),(881),(882),(883),(884),(885),(886),(887),(888),(889),(890),(891),(892),(893),(894),(895),(896),(897),(898),(899),(900),(901),(902),(903),(904),(905),(906),(907),(908),(909),(910),(911),(912),(913),(914),(915),(916),(917),(918),(919),(920),(921),(922),(923),(924),(925),(926),(927),(928),(929),(930),(931),(932),(933),(934),(935),(936),(937),(938),(939),(940),(941),(942),(943),(944),(945),(946),(947),(948),(949),(950),(951),(952),(953),(954),(955),(956),(957),(958),(959),(960),(961),(962),(963),(964),(965),(966),(967),(968),(969),(970),(971),(972),(973),(974),(975),(976),(977),(978),(979),(980),(981),(982),(983),(984),(985),(986),(987),(988),(989),(990),(991),(992),(993),(994),(995),(996),(997),(998),(999),(1000),(1001),(1002),(1003),(1004),(1005),(1006),(1007),(1008),(1009),(1010),(1011),(1012),(1013),(1014),(1015),(1016),(1017),(1018),(1019),(1020),(1021),(1022),(1023),(1024),(1025),(1026),(1027),(1028),(1029),(1030),(1031),(1032),(1033),(1034),(1035),(1036),(1037),(1038),(1039),(1040),(1041),(1042),(1043),(1044),(1045),(1046),(1047),(1048),(1049),(1050),(1051),(1052),(1053),(1054),(1055),(1056),(1057),(1058),(1059),(1060),(1061),(1062),(1063),(1064),(1065),(1066),(1067),(1068),(1069),(1070),(1071),(1072),(1073),(1074),(1075),(1076),(1077),(1078),(1079),(1080),(1081),(1082),(1083),(1084),(1085),(1086),(1087),(1088),(1089),(1090),(1091),(1092),(1093),(1094),(1095),(1096),(1097),(1098),(1099),(1100),(1101),(1102),(1103),(1104),(1105),(1106),(1107),(1108),(1109),(1110),(1111),(1112),(1113),(1114),(1115),(1116),(1117),(1118),(1119),(1120),(1121),(1122),(1123),(1124),(1125),(1126),(1127),(1128),(1129),(1130),(1131),(1132),(1133),(1134),(1135),(1136),(1137),(1138),(1139),(1140),(1141),(1142),(1143),(1144),(1145),(1146),(1147),(1148),(1149),(1150),(1151),(1152),(1153),(1154),(1155),(1156),(1157),(1158),(1159),(1160),(1161),(1162),(1163),(1164),(1165),(1166),(1167),(1168),(1169),(1170),(1171),(1172),(1173),(1174),(1175),(1176),(1177),(1178),(1179),(1180),(1181),(1182),(1183),(1184),(1185),(1186),(1187),(1188),(1189),(1190),(1191),(1192),(1193),(1194),(1195),(1196),(1197),(1198),(1199),(1200),(1201),(1202),(1203),(1204),(1205),(1206),(1207),(1208),(1209),(1210),(1211),(1212),(1213),(1214),(1215),(1216),(1217),(1218),(1219),(1220),(1221),(1222),(1223),(1224),(1225),(1226),(1227),(1228),(1229),(1230),(1231),(1232),(1233),(1234),(1235),(1236),(1237),(1238),(1239),(1240),(1241),(1242),(1243),(1244),(1245),(1246),(1247),(1248),(1249),(1250),(1251),(1252),(1253),(1254),(1255),(1256),(1257),(1258),(1259),(1260),(1261),(1262),(1263),(1264),(1265),(1266),(1267),(1268),(1269),(1270),(1271),(1272),(1273),(1274),(1275),(1276),(1277),(1278),(1279),(1280),(1281),(1282),(1283),(1284),(1285),(1286),(1287),(1288),(1289),(1290),(1291),(1292),(1293),(1294),(1295),(1296),(1297),(1298),(1299),(1300),(1301),(1302),(1303),(1304),(1305),(1306),(1307),(1308),(1309),(1310),(1311),(1312),(1313),(1314),(1315),(1316),(1317),(1318),(1319),(1320),(1321),(1322),(1323),(1324),(1325),(1326),(1327),(1328),(1329),(1330),(1331),(1332),(1333),(1334),(1335),(1336),(1337),(1338),(1339),(1340),(1341),(1342),(1343),(1344),(1345),(1346),(1347),(1348),(1349),(1350),(1351),(1352),(1353),(1354),(1355),(1356),(1357),(1358),(1359),(1360),(1361),(1362),(1363),(1364),(1365),(1366),(1367),(1368),(1369),(1370),(1371),(1372),(1373),(1374),(1375),(1376),(1377),(1378),(1379),(1380),(1381),(1382),(1383),(1384),(1385),(1386),(1387),(1388),(1389),(1390),(1391),(1392),(1393),(1394),(1395),(1396),(1397),(1398),(1399),(1400),(1401),(1402),(1403),(1404),(1405),(1406),(1407),(1408),(1409),(1410),(1411),(1412),(1413),(1414),(1415),(1416),(1417),(1418),(1419),(1420),(1421),(1422),(1423),(1424),(1425),(1426),(1427),(1428),(1429),(1430),(1431),(1432),(1433),(1434),(1435),(1436),(1437),(1438),(1439),(1440),(1441),(1442),(1443),(1444),(1445),(1446),(1447),(1448),(1449),(1450),(1451),(1452),(1453),(1454),(1455),(1456),(1457),(1458),(1459),(1460),(1461),(1462),(1463),(1464),(1465),(1466),(1467),(1468),(1469),(1470),(1471),(1472),(1473),(1474),(1475),(1476),(1477),(1478),(1479),(1480),(1481),(1482),(1483),(1484),(1485),(1486),(1487),(1488),(1489),(1490),(1491),(1492),(1493),(1494),(1495),(1496),(1497),(1498),(1499),(1500),(1501),(1502),(1503),(1504),(1505),(1506),(1507),(1508),(1509),(1510),(1511),(1512),(1513),(1514),(1515),(1516),(1517),(1518),(1519),(1520),(1521),(1522),(1523),(1524),(1525),(1526),(1527),(1528),(1529),(1530),(1531),(1532),(1533),(1534),(1535),(1536),(1537),(1538),(1539),(1540),(1541),(1542),(1543),(1544),(1545),(1546),(1547),(1548),(1549),(1550),(1551),(1552),(1553),(1554),(1555),(1556),(1557),(1558),(1559),(1560),(1561),(1562),(1563),(1564),(1565),(1566),(1567),(1568),(1569),(1570),(1571),(1572),(1573),(1574),(1575),(1576),(1577),(1578),(1579),(1580),(1581),(1582),(1583),(1584),(1585),(1586),(1587),(1588),(1589),(1590),(1591),(1592),(1593),(1594),(1595),(1596),(1597),(1598),(1599),(1600),(1601),(1602),(1603),(1604),(1605),(1606),(1607),(1608),(1609),(1610),(1611),(1612),(1613),(1614),(1615),(1616),(1617),(1618),(1619),(1620),(1621),(1622),(1623),(1624),(1625),(1626),(1627),(1628),(1629),(1630),(1631),(1632),(1633),(1634),(1635),(1636),(1637),(1638),(1639),(1640),(1641),(1642),(1643),(1644),(1645),(1646),(1647),(1648),(1649),(1650),(1651),(1652),(1653),(1654),(1655),(1656),(1657),(1658),(1659),(1660),(1661),(1662),(1663),(1664),(1665),(1666),(1667),(1668),(1669),(1670),(1671),(1672),(1673),(1674),(1675),(1676),(1677),(1678),(1679),(1680),(1681),(1682),(1683),(1684),(1685),(1686),(1687),(1688),(1689),(1690),(1691),(1692),(1693),(1694),(1695),(1696),(1697),(1698),(1699),(1700),(1701),(1702),(1703),(1704),(1705),(1706),(1707),(1708),(1709),(1710),(1711),(1712),(1713),(1714),(1715),(1716),(1717),(1718),(1719),(1720),(1721),(1722),(1723),(1724),(1725),(1726),(1727),(1728),(1729),(1730),(1731),(1732),(1733),(1734),(1735),(1736),(1737),(1738),(1739),(1740),(1741),(1742),(1743),(1744),(1745),(1746),(1747),(1748),(1749),(1750),(1751),(1752),(1753),(1754),(1755),(1756),(1757),(1758),(1759),(1760),(1761),(1762),(1763),(1764),(1765),(1766),(1767),(1768),(1769),(1770),(1771),(1772),(1773),(1774),(1775),(1776),(1777),(1778),(1779),(1780),(1781),(1782),(1783),(1784),(1785),(1786),(1787),(1788),(1789),(1790),(1791),(1792),(1793),(1794),(1795),(1796),(1797),(1798),(1799),(1800),(1801),(1802),(1803),(1804),(1805),(1806),(1807),(1808),(1809),(1810),(1811),(1812),(1813),(1814),(1815),(1816),(1817),(1818),(1819),(1820),(1821),(1822),(1823),(1824),(1825),(1826),(1827),(1828),(1829),(1830),(1831),(1832),(1833),(1834),(1835),(1836),(1837),(1838),(1839),(1840),(1841),(1842),(1843),(1844),(1845),(1846),(1847),(1848),(1849),(1850),(1851),(1852),(1853),(1854),(1855),(1856),(1857),(1858),(1859),(1860),(1861),(1862),(1863),(1864),(1865),(1866),(1867),(1868);
/*!40000 ALTER TABLE `int_array` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `COLOR` varchar(20) DEFAULT NULL,
  `MATERIAL` varchar(100) DEFAULT NULL,
  `IMAGE_01` varchar(100) DEFAULT NULL,
  `IMAGE_02` varchar(100) DEFAULT NULL,
  `LAST_UPDATED_AT` datetime DEFAULT CURRENT_TIMESTAMP,
  `ITEM_GROUP_ID` int NOT NULL,
  `PROVIDER_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ITEM_ITEM_GROUP` (`ITEM_GROUP_ID`),
  KEY `FK_ITEM_PROVIDER` (`PROVIDER_ID`),
  KEY `IDX_ITEM_NAME` (`NAME`),
  CONSTRAINT `FK_ITEM_ITEM_GROUP` FOREIGN KEY (`ITEM_GROUP_ID`) REFERENCES `item_group` (`ID`),
  CONSTRAINT `FK_ITEM_PROVIDER` FOREIGN KEY (`PROVIDER_ID`) REFERENCES `provider` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (1,'Áo 1','Trắng','Chất Liệu 1','default.png','default.png','2023-07-09 22:05:02',1,1),(2,'Áo 2','Đen','Chất Liệu 2','default.png','default.png','2023-07-09 22:05:02',1,1),(3,'Giày 1','Trắng','Chất Liệu 3','default.png','default.png','2023-07-09 22:05:02',3,2),(4,'Giày 2','Đen','Chất Liệu 4','default.png','default.png','2023-07-09 22:05:02',3,2),(5,'Giày 3','Trắng','Chất Liệu 1','default.png','default.png','2023-07-09 22:05:02',3,3),(6,'Mũ 1','Đen','Chất Liệu 2','default.png','default.png','2023-07-09 22:05:02',5,1),(7,'Mũ 2','Trắng','Chất Liệu 3','default.png','default.png','2023-07-09 22:05:02',5,2),(8,'Dép 1','Đen','Chất Liệu 4','default.png','default.png','2023-07-09 22:05:02',4,3),(9,'Mũ 3','Trắng','Chất Liệu 5','default.png','default.png','2023-07-09 22:05:02',5,3),(10,'Thắt lưng 1','Đen','Chất Liệu 2','default.png','default.png','2023-07-09 22:05:02',6,3),(11,'Thắt lưng 2','Trắng','Chất Liệu 2','default.png','default.png','2023-07-09 22:05:02',6,2),(12,'Quần 3','Đen','Chất Liệu 3','default.png','default.png','2023-07-09 22:05:02',2,2),(13,'Quần 1','Đen','Chất Liệu 3','default.png','default.png','2023-07-09 22:05:02',2,1),(14,'Quần 2','Trắng','Chất Liệu 1','default.png','default.png','2023-07-09 22:05:02',2,1);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_detail`
--

DROP TABLE IF EXISTS `item_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_detail` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `ITEM_ID` int NOT NULL,
  `SIZE_ID` int NOT NULL,
  `AMOUNT` int NOT NULL,
  `BUY_PRICE` double NOT NULL,
  `SELL_PRICE` double NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNQ_ITEM_SIZE` (`ITEM_ID`,`SIZE_ID`),
  KEY `FK_ITEM_DETAIL_SIZE` (`SIZE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=128 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_detail`
--

LOCK TABLES `item_detail` WRITE;
/*!40000 ALTER TABLE `item_detail` DISABLE KEYS */;
INSERT INTO `item_detail` VALUES (1,1,1,100,195,210),(2,1,3,100,185,230),(3,1,5,100,175,250),(4,1,7,100,165,270),(5,1,9,100,155,290),(6,2,2,120,284,336),(7,2,4,120,268,352),(8,2,6,120,252,368),(9,2,8,120,236,384),(10,2,10,120,220,473),(11,3,1,100,195,210),(12,3,3,100,185,230),(13,3,5,100,175,250),(14,3,7,100,165,552),(15,3,9,100,155,290),(16,4,2,120,284,336),(17,4,4,120,268,352),(18,4,6,120,252,368),(19,4,8,120,236,536),(20,4,10,120,220,427),(21,5,1,100,195,210),(22,5,3,100,185,230),(23,5,5,100,175,250),(24,5,7,100,165,528),(25,5,9,100,155,290),(26,6,2,120,284,336),(27,6,4,120,268,352),(28,6,6,120,252,368),(29,6,8,120,236,384),(30,6,10,120,220,558),(31,7,1,100,195,210),(32,7,3,100,185,230),(33,7,5,100,175,250),(34,7,7,100,165,270),(35,7,9,100,155,290),(36,8,2,120,284,336),(37,8,4,120,268,352),(38,8,6,120,252,368),(39,8,8,120,236,384),(40,8,10,120,220,405),(41,9,1,100,195,210),(42,9,3,100,185,230),(43,9,5,100,175,250),(44,9,7,100,165,270),(45,9,9,100,155,290),(46,10,2,120,284,336),(47,10,4,120,268,352),(48,10,6,120,252,368),(49,10,8,120,236,384),(50,10,10,120,220,552),(51,11,1,100,195,210),(52,11,3,100,185,230),(53,11,5,100,175,250),(54,11,7,100,165,270),(55,11,9,100,155,290),(56,12,2,120,284,336),(57,12,4,120,268,352),(58,12,6,120,252,368),(59,12,8,120,236,384),(60,12,10,120,220,544),(61,13,1,100,195,210),(62,13,3,100,185,230),(63,13,5,100,175,250),(64,13,7,100,165,270),(65,13,9,100,155,290),(66,14,2,120,284,336),(67,14,4,120,268,352),(68,14,6,120,252,368),(69,14,8,120,236,384),(70,14,10,120,220,462);
/*!40000 ALTER TABLE `item_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_group`
--

DROP TABLE IF EXISTS `item_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_group` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_group`
--

LOCK TABLES `item_group` WRITE;
/*!40000 ALTER TABLE `item_group` DISABLE KEYS */;
INSERT INTO `item_group` VALUES (1,'Áo'),(2,'Quần'),(3,'Giày'),(4,'Dép'),(5,'Mũ'),(6,'Thắt lưng'),(7,'Loại Hàng 7'),(8,'Loại Hàng 8'),(9,'Loại Hàng 9'),(10,'Loại Hàng 10');
/*!40000 ALTER TABLE `item_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item_group_backup`
--

DROP TABLE IF EXISTS `item_group_backup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item_group_backup` (
  `ID` int DEFAULT NULL,
  `NAME` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item_group_backup`
--

LOCK TABLES `item_group_backup` WRITE;
/*!40000 ALTER TABLE `item_group_backup` DISABLE KEYS */;
INSERT INTO `item_group_backup` VALUES (1,'Áo'),(2,'Quần'),(3,'Giày'),(4,'Dép'),(5,'Mũ'),(6,'Thắt lưng');
/*!40000 ALTER TABLE `item_group_backup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order` (
  `ID` int NOT NULL,
  `DELIVERY_ADDRESS` text NOT NULL,
  `TOTAL_FEE` double NOT NULL,
  `DELIVERY_DATE` date DEFAULT NULL,
  `DELIVERY_FEE` double DEFAULT NULL,
  `CREATED_AT` datetime DEFAULT CURRENT_TIMESTAMP,
  `CUSTOMER_ID` int NOT NULL,
  `PAYMENT_METHOD_ID` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_ORDER_CUSTOMER` (`CUSTOMER_ID`),
  KEY `FK_ORDER_PAYMENT_METHOD` (`PAYMENT_METHOD_ID`),
  CONSTRAINT `FK_ORDER_CUSTOMER` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `customer` (`ID`),
  CONSTRAINT `FK_ORDER_PAYMENT_METHOD` FOREIGN KEY (`PAYMENT_METHOD_ID`) REFERENCES `payment_method` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
INSERT INTO `order` VALUES (1,'Địa chỉ 1',0,'2023-10-10',20,'2023-07-09 22:05:02',1,1),(2,'Địa chỉ 2',0,'2023-10-10',20,'2023-07-09 22:05:02',2,1),(3,'Địa chỉ 3',0,'2023-10-10',20,'2023-07-09 22:05:02',3,1),(4,'Địa chỉ 4',0,'2023-10-12',30,'2023-07-09 22:05:02',4,2),(5,'Địa chỉ 5',0,'2023-10-12',30,'2023-07-09 22:05:02',2,3),(6,'Địa chỉ 6',0,'2023-10-14',20,'2023-07-09 22:05:02',5,1),(7,'Địa chỉ 7',0,'2023-10-14',40,'2023-07-09 22:05:02',1,2),(8,'Địa chỉ 8',0,'2023-10-16',20,'2023-07-09 22:05:02',2,3),(9,'Địa chỉ 9',0,'2023-10-16',50,'2023-07-09 22:05:02',3,3),(10,'Địa chỉ 10',0,'2023-10-18',20,'2023-07-09 22:05:02',5,2),(11,'Địa chỉ 11',0,'2023-10-18',10,'2023-07-09 22:05:02',4,2),(12,'Địa chỉ 12',0,'2023-10-18',20,'2023-07-09 22:05:02',3,1);
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_delivery_status_detail`
--

DROP TABLE IF EXISTS `order_delivery_status_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_delivery_status_detail` (
  `ORDER_ID` int NOT NULL,
  `STATUS_ID` int NOT NULL,
  `EMPLOYEE_ID` int NOT NULL,
  `LAST_UPDATED_AT` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ORDER_ID`,`STATUS_ID`),
  KEY `FK_ODSD_STATUS` (`STATUS_ID`),
  KEY `FK_ODSD_EMPLOYEE` (`EMPLOYEE_ID`),
  CONSTRAINT `FK_ODSD_EMPLOYEE` FOREIGN KEY (`EMPLOYEE_ID`) REFERENCES `employee` (`ID`),
  CONSTRAINT `FK_ODSD_ORDER` FOREIGN KEY (`ORDER_ID`) REFERENCES `order` (`ID`),
  CONSTRAINT `FK_ODSD_STATUS` FOREIGN KEY (`STATUS_ID`) REFERENCES `delivery_status` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_delivery_status_detail`
--

LOCK TABLES `order_delivery_status_detail` WRITE;
/*!40000 ALTER TABLE `order_delivery_status_detail` DISABLE KEYS */;
INSERT INTO `order_delivery_status_detail` VALUES (1,1,1,'2023-07-04 22:05:02'),(1,2,1,'2023-07-05 22:05:02'),(1,3,1,'2023-07-06 22:05:02'),(1,4,1,'2023-07-07 22:05:02'),(1,5,1,'2023-07-08 22:05:02'),(1,6,1,'2023-07-09 22:05:02'),(2,1,1,'2023-07-04 22:05:02'),(2,2,1,'2023-07-05 22:05:02'),(2,3,1,'2023-07-06 22:05:02'),(2,4,1,'2023-07-07 22:05:02'),(2,5,1,'2023-07-08 22:05:02'),(2,6,1,'2023-07-09 22:05:02'),(3,1,1,'2023-07-04 22:05:02'),(3,2,1,'2023-07-05 22:05:02'),(3,3,1,'2023-07-06 22:05:02'),(3,4,1,'2023-07-07 22:05:02'),(3,5,1,'2023-07-08 22:05:02'),(3,6,1,'2023-07-09 22:05:02'),(4,1,1,'2023-07-04 22:05:02'),(4,2,1,'2023-07-05 22:05:02'),(4,3,1,'2023-07-06 22:05:02'),(4,4,1,'2023-07-07 22:05:02'),(4,5,1,'2023-07-08 22:05:02'),(4,6,1,'2023-07-09 22:05:02'),(5,1,1,'2023-07-04 22:05:02'),(5,2,1,'2023-07-05 22:05:02'),(5,3,1,'2023-07-06 22:05:02'),(5,4,1,'2023-07-07 22:05:02'),(5,5,1,'2023-07-08 22:05:02'),(5,6,1,'2023-07-09 22:05:02'),(6,1,2,'2023-07-06 22:05:02'),(6,2,2,'2023-07-07 22:05:02'),(6,3,2,'2023-07-08 22:05:02'),(6,4,2,'2023-07-09 22:05:02'),(7,1,2,'2023-07-06 22:05:02'),(7,2,2,'2023-07-07 22:05:02'),(7,3,2,'2023-07-08 22:05:02'),(7,4,2,'2023-07-09 22:05:02'),(8,1,2,'2023-07-06 22:05:02'),(8,2,2,'2023-07-07 22:05:02'),(8,3,2,'2023-07-08 22:05:02'),(8,4,2,'2023-07-09 22:05:02'),(9,1,3,'2023-07-05 22:05:02'),(9,2,3,'2023-07-06 22:05:02'),(9,3,3,'2023-07-07 22:05:02'),(9,4,3,'2023-07-08 22:05:02'),(9,5,3,'2023-07-09 22:05:02'),(10,1,3,'2023-07-05 22:05:02'),(10,2,3,'2023-07-06 22:05:02'),(10,3,3,'2023-07-07 22:05:02'),(10,4,3,'2023-07-08 22:05:02'),(10,5,3,'2023-07-09 22:05:02'),(11,7,4,'2023-07-09 22:05:02'),(12,7,4,'2023-07-09 22:05:02');
/*!40000 ALTER TABLE `order_delivery_status_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_detail`
--

DROP TABLE IF EXISTS `order_detail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_detail` (
  `ORDER_ID` int NOT NULL,
  `ITEM_DETAIL_ID` int NOT NULL,
  `AMOUNT` int NOT NULL,
  PRIMARY KEY (`ORDER_ID`,`ITEM_DETAIL_ID`),
  KEY `FK_ORDER_DETAIL_ITEM_DETAIL` (`ITEM_DETAIL_ID`),
  CONSTRAINT `FK_ORDER_DETAIL_ITEM_DETAIL` FOREIGN KEY (`ITEM_DETAIL_ID`) REFERENCES `item_detail` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_detail`
--

LOCK TABLES `order_detail` WRITE;
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
INSERT INTO `order_detail` VALUES (1,4,2),(1,31,5),(1,49,1),(1,68,2),(2,39,2),(2,48,2),(2,50,12),(2,53,3),(3,21,2),(3,22,2),(3,39,2),(3,49,11),(4,11,2),(4,41,3),(4,46,3),(4,69,3),(5,5,3),(5,24,2),(5,39,8),(5,56,8),(6,10,2),(6,23,9),(6,29,3),(6,30,11),(7,17,2),(7,43,15),(7,54,10),(7,57,5),(8,8,20),(8,18,7),(8,59,2),(8,65,9),(9,29,10),(9,34,1),(9,38,7),(9,53,2),(10,22,10),(10,24,10),(10,40,2),(10,50,2),(11,37,2),(11,38,2),(11,48,11),(11,51,2),(12,1,12),(12,29,2),(12,35,1),(12,42,3);
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_method`
--

DROP TABLE IF EXISTS `payment_method`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment_method` (
  `ID` int NOT NULL,
  `DESC` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_method`
--

LOCK TABLES `payment_method` WRITE;
/*!40000 ALTER TABLE `payment_method` DISABLE KEYS */;
INSERT INTO `payment_method` VALUES (1,'Tiền mặt'),(2,'Thẻ tín dụng'),(3,'Thẻ ghi nợ'),(4,'Ví điện tử');
/*!40000 ALTER TABLE `payment_method` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provider`
--

DROP TABLE IF EXISTS `provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `provider` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `TAX_CODE` varchar(20) NOT NULL,
  `ADDRESS` text NOT NULL,
  `PHONE` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provider`
--

LOCK TABLES `provider` WRITE;
/*!40000 ALTER TABLE `provider` DISABLE KEYS */;
INSERT INTO `provider` VALUES (1,'Nhà cung cấp 1','1111','Địa chỉ 1A','11119999'),(2,'Nhà cung cấp 2','2222','Địa chỉ 2A','22229999'),(3,'Nhà cung cấp 3','3333','Địa chỉ 3A','33339999'),(4,'Nhà cung cấp 4','4444','Địa chỉ 4A','44449999'),(5,'Nhà cung cấp 5','5555','Địa chỉ 5A','55559999');
/*!40000 ALTER TABLE `provider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `size`
--

DROP TABLE IF EXISTS `size`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `size` (
  `ID` int NOT NULL,
  `GENDER` tinyint NOT NULL,
  `DESC` text,
  `SIZE` varchar(10) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `UNIQUE_SIZE_GENDER` (`SIZE`,`GENDER`),
  CONSTRAINT `CHK_GENDER` CHECK ((`GENDER` in (0,1))),
  CONSTRAINT `CHK_SIZE` CHECK ((`SIZE` in (_utf8mb4'S',_utf8mb4'M',_utf8mb4'L',_utf8mb4'XL',_utf8mb4'XXL',_utf8mb4'XXXL')))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `size`
--

LOCK TABLES `size` WRITE;
/*!40000 ALTER TABLE `size` DISABLE KEYS */;
INSERT INTO `size` VALUES (1,0,'Mô tả: S Nữ chi tiết ...','S'),(2,1,'Mô tả: S Nam chi tiết ...','S'),(3,0,'Mô tả: M Nữ chi tiết ...','M'),(4,1,'Mô tả: M Nam chi tiết ...','M'),(5,0,'Mô tả: L Nữ chi tiết ...','L'),(6,1,'Mô tả: L Nam chi tiết ...','L'),(7,0,'Mô tả: XL Nữ chi tiết ...','XL'),(8,1,'Mô tả: XL Nam chi tiết ...','XL'),(9,0,'Mô tả: XXL Nữ chi tiết ...','XXL'),(10,1,'Mô tả: XXL Nam chi tiết ...','XXL');
/*!40000 ALTER TABLE `size` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `title`
--

DROP TABLE IF EXISTS `title`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `title` (
  `ID` int NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `DESC` text NOT NULL,
  `STIPEND` double NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `title`
--

LOCK TABLES `title` WRITE;
/*!40000 ALTER TABLE `title` DISABLE KEYS */;
INSERT INTO `title` VALUES (1,'Giám Đốc','Giám Đốc',10),(2,'Phó Giám Đốc','Phó Giám Đốc',6),(3,'Quản Lý','Quản Lý',4),(4,'Nhân Viên Fulltime','Nhân Viên Fulltime',2),(5,'Nhân Viên Parttime','Nhân Viên Parttime',1);
/*!40000 ALTER TABLE `title` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-16 20:22:22
