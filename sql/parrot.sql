/*
Navicat MySQL Data Transfer

Source Server         : largon
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : parrot

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-09-23 00:34:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '用户名',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '注册类型 1-手机 2-微信 3-qq',
  `nick_name` varchar(50) NOT NULL DEFAULT '' COMMENT '昵称',
  `sex` enum('0','1','2') NOT NULL DEFAULT '0' COMMENT '性别 0-未知 1-男 2-女',
  `birthday` date DEFAULT NULL COMMENT '出生日期',
  `phone` varchar(30) NOT NULL DEFAULT '' COMMENT '绑定手机号',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态 0-正常 2-禁用',
  `create_at` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
  `updated_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `delete_at` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';

-- ----------------------------
-- Table structure for user_third_accesses
-- ----------------------------
DROP TABLE IF EXISTS `user_third_accesses`;
CREATE TABLE `user_third_accesses` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(11) NOT NULL,
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '类型 1-微信 2-qq',
  `openid` varchar(100) NOT NULL DEFAULT '',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态 0-正常 2-禁用',
  PRIMARY KEY (`id`),
  KEY `index_userid` (`user_id`) USING BTREE,
  KEY `index_type` (`type`) USING BTREE,
  KEY `index_status` (`status`) USING BTREE,
  KEY `index_openid` (`openid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户第三方类型关联';
