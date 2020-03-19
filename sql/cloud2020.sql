/*
 Navicat Premium Data Transfer

 Source Server         : localhost8
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : cloud2020

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 19/03/2020 17:09:49
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `id` bigint(0) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `serial` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付流水号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '支付表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES (1, '胡志鹏');
INSERT INTO `payment` VALUES (2, 'hzp');
INSERT INTO `payment` VALUES (3, '皮卡丘');
INSERT INTO `payment` VALUES (4, 'pikachu');
INSERT INTO `payment` VALUES (5, 'pikachu');
INSERT INTO `payment` VALUES (6, 'pikachu');

SET FOREIGN_KEY_CHECKS = 1;
