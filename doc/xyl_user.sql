/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : platform

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2018-02-19 07:56:07
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for nideshop_user
-- ----------------------------
DROP TABLE IF EXISTS `nideshop_user`;
CREATE TABLE `nideshop_user` (
  `id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(60) NOT NULL DEFAULT '',
  `password` varchar(32) DEFAULT '',
  `gender` tinyint(1) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `register_time` datetime DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `last_login_ip` varchar(15) DEFAULT '',
  `user_level_id` tinyint(3) DEFAULT NULL,
  `nickname` varchar(60) DEFAULT '',
  `mobile` varchar(20) DEFAULT '',
  `register_ip` varchar(45) DEFAULT '',
  `avatar` varchar(255) DEFAULT '',
  `weixin_openid` varchar(50) DEFAULT '',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`username`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;
