/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50152
Source Host           : localhost:3306
Source Database       : testdb

Target Server Type    : MYSQL
Target Server Version : 50152
File Encoding         : 65001

Date: 2016-10-16 23:35:33
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `name` varchar(11) DEFAULT NULL,
  `password` varchar(11) DEFAULT NULL,
  `sex` varchar(4) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('0000000001', 'admin', '111111', '男', '19', '1997-07-03 00:00:00');
INSERT INTO `user` VALUES ('0000000002', '张三', '123', '男', '19', '1997-04-05 00:00:00');
