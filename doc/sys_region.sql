/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : platform

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2018-02-18 18:30:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_region
-- ----------------------------
DROP TABLE IF EXISTS `sys_region`;
CREATE TABLE `sys_region` (
  `id` mediumint(32) NOT NULL AUTO_INCREMENT,
  `parent_id` mediumint(32) NOT NULL DEFAULT '0',
  `name` varchar(120) NOT NULL DEFAULT '',
  `type` tinyint(1) NOT NULL DEFAULT '2',
  `agency_id` int(50) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `agency_id` (`agency_id`) USING BTREE,
  KEY `parent_id` (`parent_id`) USING BTREE,
  KEY `region_type` (`type`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=46182 DEFAULT CHARSET=utf8;
