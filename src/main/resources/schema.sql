--
-- Table structure for table `FOLDERS_TASKS`
--

DROP TABLE IF EXISTS `FOLDERS_TASKS`;
CREATE TABLE `FOLDERS_TASKS` (
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Table structure for table `ITEMS_TASKS`
--

DROP TABLE IF EXISTS `ITEMS_TASKS`;;
CREATE TABLE `ITEMS_TASKS` (
  `completed` bit(1) NOT NULL,
  `id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Table structure for table `TASKS`
--

DROP TABLE IF EXISTS `TASKS`;
CREATE TABLE `TASKS` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `owner_id` bigint(20) NOT NULL,
  `folder_task_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2axmno8xbmcrlcrh896rwhktc` (`owner_id`),
  KEY `FKrt2j66uifjfo5gxp89d01fjxd` (`folder_task_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Table structure for table `USERS`
--

DROP TABLE IF EXISTS `USERS`;
CREATE TABLE `USERS` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_dc4eq7plr20fdhq528twsak1b` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
