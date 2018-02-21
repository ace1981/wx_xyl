/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : platform

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2018-02-18 18:30:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_sms_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_sms_log`;
CREATE TABLE `sys_sms_log` (
  `id` varchar(32) COLLATE utf8_unicode_ci NOT NULL COMMENT '主键',
  `user_id` bigint(20) DEFAULT NULL COMMENT '操作人',
  `content` text COLLATE utf8_unicode_ci COMMENT '必填参数。发送内容（1-500 个汉字）UTF-8编码',
  `mobile` text COLLATE utf8_unicode_ci COMMENT '必填参数。手机号码。多个以英文逗号隔开',
  `stime` datetime DEFAULT NULL COMMENT '可选参数。发送时间，填写时已填写的时间发送，不填时为当前时间发送',
  `sign` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '必填参数。用户签名',
  `type` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '必填参数。固定值 pt',
  `extno` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '可选参数。扩展码，用户定义扩展码，只能为数字',
  `send_status` int(11) DEFAULT NULL COMMENT '1成功 0失败',
  `send_id` varchar(32) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '发送编号',
  `invalid_num` int(11) DEFAULT NULL COMMENT '无效号码数',
  `success_num` int(11) DEFAULT NULL COMMENT '成功提交数',
  `black_num` int(11) DEFAULT NULL COMMENT '黑名单数',
  `return_msg` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '返回消息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
