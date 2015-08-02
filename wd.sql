/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50544
Source Host           : localhost:3306
Source Database       : wd

Target Server Type    : MYSQL
Target Server Version : 50544
File Encoding         : 65001

Date: 2015-07-28 14:27:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(15) DEFAULT NULL,
  `admin_issuper` smallint(1) DEFAULT NULL,
  `admin_sex` smallint(1) DEFAULT NULL,
  `admin_imgpath` varchar(200) DEFAULT NULL,
  `admin_passwd` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for cinema
-- ----------------------------
DROP TABLE IF EXISTS `cinema`;
CREATE TABLE `cinema` (
  `cinema_id` int(11) NOT NULL AUTO_INCREMENT,
  `cinema_name` varchar(50) DEFAULT NULL,
  `cinema_address` varchar(200) DEFAULT NULL,
  `cinema_city_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`cinema_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cinema
-- ----------------------------

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `city_id` int(11) NOT NULL AUTO_INCREMENT,
  `city_name` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------

-- ----------------------------
-- Table structure for film
-- ----------------------------
DROP TABLE IF EXISTS `film`;
CREATE TABLE `film` (
  `film_id` int(11) NOT NULL AUTO_INCREMENT,
  `film_name` varchar(50) DEFAULT NULL,
  `film_type_id` int(11) DEFAULT NULL,
  `film_imgpath` varchar(200) DEFAULT NULL,
  `film_director` varchar(50) DEFAULT NULL,
  `film_actor` varchar(50) DEFAULT NULL,
  `film_score` float(10,0) DEFAULT NULL,
  `flim_introduction` text,
  PRIMARY KEY (`film_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of film
-- ----------------------------

-- ----------------------------
-- Table structure for filmroom
-- ----------------------------
DROP TABLE IF EXISTS `filmroom`;
CREATE TABLE `filmroom` (
  `filmroom_id` int(11) NOT NULL AUTO_INCREMENT,
  `filmroom_name` varchar(50) DEFAULT NULL,
  `filmroom_cinema_id` int(11) DEFAULT NULL,
  `filmroom_seatnum` int(11) DEFAULT NULL,
  PRIMARY KEY (`filmroom_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of filmroom
-- ----------------------------

-- ----------------------------
-- Table structure for news
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_name` varchar(15) DEFAULT NULL,
  `news_content` text,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for seat
-- ----------------------------
DROP TABLE IF EXISTS `seat`;
CREATE TABLE `seat` (
  `seat_id` int(11) NOT NULL AUTO_INCREMENT,
  `seat_status` smallint(1) DEFAULT NULL,
  `seat_filmroom_id` int(11) DEFAULT NULL,
  `seat_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`seat_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of seat
-- ----------------------------

-- ----------------------------
-- Table structure for ticket
-- ----------------------------
DROP TABLE IF EXISTS `ticket`;
CREATE TABLE `ticket` (
  `ticket_id` int(11) NOT NULL AUTO_INCREMENT,
  `ticket_time_id` int(11) DEFAULT NULL,
  `ticket_filmroom_id` int(11) DEFAULT NULL,
  `ticket_user_id` int(11) DEFAULT NULL,
  `ticket_seat_id` int(11) DEFAULT NULL,
  `ticket_ordertime` datetime DEFAULT NULL,
  `ticket_status` smallint(1) DEFAULT NULL,
  `ticket_valid` smallint(1) DEFAULT NULL,
  PRIMARY KEY (`ticket_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ticket
-- ----------------------------

-- ----------------------------
-- Table structure for time
-- ----------------------------
DROP TABLE IF EXISTS `time`;
CREATE TABLE `time` (
  `time_id` int(11) NOT NULL AUTO_INCREMENT,
  `time_filmroom_id` int(11) DEFAULT NULL,
  `time_flim_id` int(11) DEFAULT NULL,
  `time_stare` datetime DEFAULT NULL,
  `time_price` float DEFAULT NULL,
  PRIMARY KEY (`time_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of time
-- ----------------------------

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT,
  `type_name` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of type
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(15) DEFAULT NULL,
  `user_passed` varchar(15) DEFAULT NULL,
  `user_phone` int(20) DEFAULT NULL,
  `user_truename` varchar(15) DEFAULT NULL,
  `user_sex` smallint(1) DEFAULT NULL,
  `user_birty` datetime DEFAULT NULL,
  `user_mail` varchar(50) DEFAULT NULL,
  `user_address` varchar(200) DEFAULT NULL,
  `user_status` smallint(1) DEFAULT NULL,
  `user_imgpath` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
