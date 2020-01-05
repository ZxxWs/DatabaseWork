/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : sjkwork

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 02/01/2020 18:17:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for checkin
-- ----------------------------
DROP TABLE IF EXISTS `checkin`;
CREATE TABLE `checkin`  (
  `Cid` bigint(20) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT COMMENT '交易的流水号',
  `Gno` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客人的ID',
  `Gno1` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '如果是双人间就填充',
  `Rno` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房间号',
  `InTime` datetime(0) NOT NULL COMMENT '入住时间点',
  `OutTime` datetime(0) NULL DEFAULT NULL COMMENT '退房时间点',
  `AllTime` int(5) NOT NULL COMMENT '开房时长（钟点房单位：小时。单双人间单位：天）',
  `AllMoney` double(10, 2) NOT NULL COMMENT '总金额',
  `FrontNo` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '换房前的房间ID',
  `BackNo` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '换房后的房间ID',
  PRIMARY KEY (`Cid`) USING BTREE,
  INDEX `Rno`(`Rno`) USING BTREE,
  INDEX `Gno`(`Gno`) USING BTREE,
  INDEX `Gno1`(`Gno1`) USING BTREE,
  CONSTRAINT `Gno` FOREIGN KEY (`Gno`) REFERENCES `guest` (`Gno`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Rno` FOREIGN KEY (`Rno`) REFERENCES `room` (`Rno`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Gno1` FOREIGN KEY (`Gno1`) REFERENCES `guest` (`Gno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for guest
-- ----------------------------
DROP TABLE IF EXISTS `guest`;
CREATE TABLE `guest`  (
  `Gno` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客人的身份证号',
  `Gname` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客人的名字',
  `Gsex` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '男' COMMENT '客人性别',
  `Gtel` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '客人的手机号',
  PRIMARY KEY (`Gno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for principal
-- ----------------------------
DROP TABLE IF EXISTS `principal`;
CREATE TABLE `principal`  (
  `Pno` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房间负责人的ID',
  `Pname` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '房间负责人的名字',
  PRIMARY KEY (`Pno`) USING BTREE,
  INDEX `Pname`(`Pname`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room`  (
  `Rno` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房间号',
  `Rtype` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '房间类型（单人间、双人间、单人钟点房、双人钟点房）',
  `Rprice` double(10, 2) NOT NULL COMMENT '房间的价格（单双人间：x/天。钟点房：y/小时）',
  `Rcondition` tinyint(1) NOT NULL DEFAULT 0 COMMENT '当前房间的状态（0为空）',
  `Pno` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0' COMMENT '负责人的ID',
  PRIMARY KEY (`Rno`) USING BTREE,
  INDEX `Pno`(`Pno`) USING BTREE,
  CONSTRAINT `Pno` FOREIGN KEY (`Pno`) REFERENCES `principal` (`Pno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
