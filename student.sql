/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50152
Source Host           : localhost:3306
Source Database       : testdb

Target Server Type    : MYSQL
Target Server Version : 50152
File Encoding         : 65001

Date: 2016-10-16 23:35:21
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` char(12) NOT NULL,
  `name` varchar(10) NOT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `classname` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '张三', '男', '20', '1996-07-07', '软件12班');
INSERT INTO `student` VALUES ('2', '李四', '男', '20', '1996-04-22', '网络142');
INSERT INTO `student` VALUES ('3', '王丽', '女', '20', '1996-04-22', '网络141C');
INSERT INTO `student` VALUES ('4', '张红', '女', '19', '1997-03-12', '网络141C');
INSERT INTO `student` VALUES ('5', '李阳', '女', '20', '1996-07-07', '网络161');
