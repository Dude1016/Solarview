CREATE DATABASE  IF NOT EXISTS `mydb` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `mydb`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mydb
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `planet`
--

DROP TABLE IF EXISTS `planet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planet` (
  `planet_id` int NOT NULL,
  `circumference` decimal(10,0) DEFAULT NULL,
  `weight` varchar(45) DEFAULT NULL,
  `satellites` varchar(45) DEFAULT NULL,
  `distance_from_sun` decimal(10,3) DEFAULT NULL,
  `global_tempature` decimal(10,0) DEFAULT NULL,
  `habitable_zone` tinyint DEFAULT NULL,
  `description` text,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`planet_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planet`
--

LOCK TABLES `planet` WRITE;
/*!40000 ALTER TABLE `planet` DISABLE KEYS */;
INSERT INTO `planet` VALUES (1,9525,'7.242 × 10^23 ','none',0.387,332,0,'Mercury is the swift and restless messenger of the solar system, a world of extremes where the Sun rules without mercy. Its surface is a scarred testament to countless impacts, frozen in time by the absence of wind or rain. Days stretch endlessly under scorching heat, while nights plunge into bone-chilling cold. Standing on Mercury, you’d see the Sun grow three times larger in the sky than on Earth, a blinding beacon moving in strange loops because of Mercury’s eccentric orbit. There are no moons, no clouds, no seasons—just stark silence and endless craters. Yet in its desolate beauty, Mercury remains an enigmatic survivor of the Sun’s fiery embrace.','Mercury '),(2,23627,'1.073 × 10^25 ','none',0.720,864,0,'Shrouded in thick, toxic clouds, Venus hides its secrets beneath a veil of sulfuric acid and perpetual twilight. Its atmosphere churns with hurricane-force winds that race around the planet, and its surface bakes in heat hot enough to melt lead. To visit Venus is to enter a world where rain never reaches the ground, but evaporates in the stifling air above. Once imagined as Earth’s twin, Venus reveals instead a haunting vision of what can happen when a planet’s climate runs wild. Volcanic plains and tortured mountain ranges lie beneath the clouds, sculpted by ancient forces that may still stir deep below. Mysterious and hostile, Venus remains our closest yet most elusive neighbor.\n\n','Venus'),(3,24901,'1.317 × 10^25 ','moon',1.000,59,1,'Earth is a living masterpiece—a blue and green oasis adrift in the void. Its lands shift and breathe through drifting continents, while oceans swirl with life from shimmering coral reefs to the darkest abysses. Earth’s thin atmosphere cradles us, painting the sky with sunsets and shielding us from cosmic harm. Seasons transform landscapes into vibrant cycles of growth and rest. From icy polar caps to steaming rainforests, Earth teems with astonishing diversity and intricate balance. Alone among known worlds, it hums with the music of rivers, winds, and countless living beings. To gaze upon Earth is to see not just rock and water, but a rare miracle shaped by time, chance, and fragile harmony.','Earth'),(4,13263,'1.409 × 10^24','Phobos, Deimos',1.520,-81,1,'Mars is the ancient frontier—a rust-red desert where towering volcanoes and yawning canyons whisper stories of a wetter, possibly living past. Dust storms can engulf the entire planet, sweeping over rocky plains and frozen polar caps. Dry riverbeds and lake basins hint at lost seas, while strange, dark streaks appear seasonally on crater slopes, deepening the mystery of what Mars still hides beneath its surface. Two small, misshapen moons circle above, like sentinels of forgotten history. The thin atmosphere lets the sky glow pink at sunset, a haunting beauty that has inspired generations to dream of exploration and even life beyond Earth.\n\n','Mars'),(5,272946,'4.184 × 10^27','Ganymede, Io, Europa, callisto',5.200,-166,0,'Jupiter is a giant of restless storms and swirling clouds, its presence so immense it shapes the orbits of countless other worlds. The Great Red Spot, a titanic storm twice as wide as Earth, has raged for centuries, surrounded by roiling bands of amber, cream, and rust. Beneath its colorful clouds lie layers of crushing pressure and seething metallic hydrogen, swirling faster than any storm on Earth. Jupiter’s vast family of moons add further intrigue—volcanic Io, icy Europa with its hidden ocean, and others each more unique than the last. It is a world of scale and power beyond imagining, the grand guardian of the solar system.\n\n','Jupiter'),(6,235298,'1.253 × 10^27','Titan, Rhea, Dione, Tethys',9.540,-288,0,'Saturn is the solar system’s jewel, encircled by glittering rings made of ice and rock that catch the sunlight in silent, ethereal splendor. Beyond the rings, Saturn’s cloud tops swirl with gentle gold hues and massive storms that can last for months. Despite its serene appearance, Saturn’s atmosphere conceals fierce winds and deep mysteries. Its moons add to the allure: Titan’s thick orange haze hides lakes of liquid methane, while Enceladus sends plumes of water vapor into space from its icy crust. Together, Saturn and its moons form a breathtaking system, as elegant as it is enigmatic.\n\n','Saturn'),(7,99786,'1.914 × 10^26','Titania, Umbriel, Miranda, Oberon',19.180,-360,0,'Uranus drifts through space with a quiet, icy elegance, its pale blue-green color the result of methane in its atmosphere. Unlike any other planet, it rolls along the edge of its orbit, tipped over so far that its poles face the Sun directly during long seasons. Hidden beneath its calm exterior are fierce winds, and faint rings that trace its equator in ghostly arcs. Uranus’s moons bear names from Shakespeare and swirl in dark mystery, while the planet itself remains largely unexplored. Silent and distant, Uranus is a cold enigma that beckons us to learn what secrets it holds.','Uranus'),(8,96685,'2.258 × 10^26','Triton, Thalassa, Nereid, Galatea',30.060,-364,0,'Neptune is a deep, sapphire mystery, the most distant major planet in our solar system. Fierce winds, the fastest of any planet, whip its clouds into striking dark storms and white wisps that swirl across its surface. Though it appears calm from afar, Neptune’s atmosphere churns with hidden energy and dramatic weather. Its moon Triton, orbiting backwards, hints at captured origins and features geysers of icy nitrogen that erupt into the thin sky. Neptune’s remote majesty, veiled in blue, symbolizes the outer boundaries of the Sun’s domain—a reminder of how much we still have to discover.\n\n','Neptune');
/*!40000 ALTER TABLE `planet` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-08-03 16:27:11
