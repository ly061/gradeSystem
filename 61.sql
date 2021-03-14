/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : 61

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 15/03/2021 01:22:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for act_grade
-- ----------------------------
DROP TABLE IF EXISTS `act_grade`;
CREATE TABLE `act_grade`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `act_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_var` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_rank` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of act_grade
-- ----------------------------
INSERT INTO `act_grade` VALUES (1, '001', 'A001', '参与爱国主义主题教育活动', '班级团校培训活动', '2020.1.8', '1', '1', '0.4');
INSERT INTO `act_grade` VALUES (2, '002', 'A001', '参与爱国主义主题教育活动', '团校培训', '2020.1.8', '1', '1', '0.4');
INSERT INTO `act_grade` VALUES (3, '003', 'A001', '参与爱国主义主题教育活动', '入党积极分子培训', '2020.1.8', '1', '1', '0.4');
INSERT INTO `act_grade` VALUES (4, '001', 'A002', '社会实践服务活动', '2017大学生志愿者暑期“三下乡”社会实践活动', '2020.1.8', '1', '1', '0.3');
INSERT INTO `act_grade` VALUES (5, '002', 'A002', '社会实践服务活动', '2018大学生志愿者暑期“三下乡”社会实践活动', '2020.1.8', '1', '1', '0.3');
INSERT INTO `act_grade` VALUES (6, '003', 'A002', '社会实践服务活动', '2019大学生志愿者暑期“三下乡”社会实践活动', '2020.1.8', '1', '1', '0.3');
INSERT INTO `act_grade` VALUES (7, '001', 'A003', '社团及课外活动', '相声小品协会', '2020.1.8', '1', '1', '0.2');
INSERT INTO `act_grade` VALUES (8, '002', 'A003', '社团及课外活动', '37届校运会', '2020.1.8', '1', '1', '0.2');
INSERT INTO `act_grade` VALUES (9, '003', 'A003', '社团及课外活动', '大数据学院举办第一届欢送杯篮球赛', '2020.1.8', '1', '1', '0.3');
INSERT INTO `act_grade` VALUES (10, '001', 'A004', '志愿者服务活动', '2017年中国龙舟赛暨中国传统龙舟大赛志愿者', '2020.1.8', '1', '1', '0.1');
INSERT INTO `act_grade` VALUES (11, '002', 'A004', '志愿者服务活动', '博文小学爱心支教96天', '2020.1.8', '1', '1', '0.1');
INSERT INTO `act_grade` VALUES (12, '003', 'A004', '志愿者服务活动', '铜仁市博文小学支教活动', '2020.1.8', '1', '1', '0.1');

-- ----------------------------
-- Table structure for all_info
-- ----------------------------
DROP TABLE IF EXISTS `all_info`;
CREATE TABLE `all_info`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `stu_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `var_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of all_info
-- ----------------------------
INSERT INTO `all_info` VALUES (1, '002017', 'A001', '001');
INSERT INTO `all_info` VALUES (4, '002017', 'A001', '001');
INSERT INTO `all_info` VALUES (5, '002017', 'A002', '002');
INSERT INTO `all_info` VALUES (6, '002017', 'A003', '003');
INSERT INTO `all_info` VALUES (7, '002018', 'A001', '001');
INSERT INTO `all_info` VALUES (8, '002018', 'A001', '002');
INSERT INTO `all_info` VALUES (9, '002019', 'A001', '003');
INSERT INTO `all_info` VALUES (10, '002018', 'I001', '001');
INSERT INTO `all_info` VALUES (11, '002018', 'I002', '002');
INSERT INTO `all_info` VALUES (12, '002018', 'I003', '003');
INSERT INTO `all_info` VALUES (13, '002019', 'I001', '001');
INSERT INTO `all_info` VALUES (14, '002019', 'I001', '002');
INSERT INTO `all_info` VALUES (15, '002017', 'I001', '003');
INSERT INTO `all_info` VALUES (16, '002017', 'L001', '001');
INSERT INTO `all_info` VALUES (17, '002017', 'L002', '001');
INSERT INTO `all_info` VALUES (18, '002019', 'L001', '001');
INSERT INTO `all_info` VALUES (19, '002018', 'L002', '001');
INSERT INTO `all_info` VALUES (20, '002018', 'L001', '001');
INSERT INTO `all_info` VALUES (21, '002017', 'R001', '001');
INSERT INTO `all_info` VALUES (22, '002017', 'R002', '001');
INSERT INTO `all_info` VALUES (23, '002019', 'R001', '001');
INSERT INTO `all_info` VALUES (24, '002018', 'R002', '001');
INSERT INTO `all_info` VALUES (25, '002018', 'R001', '001');

-- ----------------------------
-- Table structure for inno_grade
-- ----------------------------
DROP TABLE IF EXISTS `inno_grade`;
CREATE TABLE `inno_grade`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `inno_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `inno_var` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `inno_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `inno_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `inno_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `inno_rank` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `inno_level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `inno_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of inno_grade
-- ----------------------------
INSERT INTO `inno_grade` VALUES (1, '001', 'I001', '科研训练', '教师资格证（高级）', '2018.3.12', '1', '1', '0.3');
INSERT INTO `inno_grade` VALUES (2, '001', 'I002', '学科竞赛', '发泡陶瓷的研究现状与展望期刊论文', '2018.3.12', '1', '1', '0.3');
INSERT INTO `inno_grade` VALUES (3, '001', 'I003', '创业训练', '计算机一级合格证书', '2018.3.12', '1', '1', '0.3');
INSERT INTO `inno_grade` VALUES (4, '002', 'I001', '科研训练', '高温发泡陶瓷的研究与制备省级立项并结题负责人', '2018.3.12', '1', '1', '0.2');
INSERT INTO `inno_grade` VALUES (5, '003', 'I001', '科研训练', '高温发泡陶瓷的研究与制备实用新型专利证书', '2018.3.12', '1', '1', '0.3');
INSERT INTO `inno_grade` VALUES (6, '002', 'I002', '学科竞赛', '普通话水平测试等级证书二级甲等', '2018.3.12', '1', '1', '0.3');
INSERT INTO `inno_grade` VALUES (7, '003', 'I002', '学科竞赛', '教师资格证（高级）', '2018.3.12', '1', '1', '0.2');
INSERT INTO `inno_grade` VALUES (8, '002', 'I003', '创业训练', '英语四级考试成绩60%以上', '2018.3.12', '1', '1', '0.2');
INSERT INTO `inno_grade` VALUES (9, '003', 'I003', '创业训练', '计算机二级合格证书', '2018.3.12', '1', '1', '0.2');

-- ----------------------------
-- Table structure for lec_grade
-- ----------------------------
DROP TABLE IF EXISTS `lec_grade`;
CREATE TABLE `lec_grade`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `lec_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lec_var` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lec_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lec_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lec_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lec_rank` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `lec_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of lec_grade
-- ----------------------------
INSERT INTO `lec_grade` VALUES (1, '001', 'L001', '学术讲座', '15篇讲座', '2015.9.11', '1', '1');
INSERT INTO `lec_grade` VALUES (2, '001', 'L002', '学术心得', '1篇心得', '2015.9.11', '1', '1');

-- ----------------------------
-- Table structure for read_grade
-- ----------------------------
DROP TABLE IF EXISTS `read_grade`;
CREATE TABLE `read_grade`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `read_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `read_var` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `read_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `read_content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `read_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `read_rank` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `read_value` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of read_grade
-- ----------------------------
INSERT INTO `read_grade` VALUES (1, '001', 'R001', '阅读著作', '著作15部', '2016.08.01', '1', '1');
INSERT INTO `read_grade` VALUES (2, '001', 'R002', '阅读学术论文', '学术论文10篇', '2017.07.01', '1', '1');

-- ----------------------------
-- Table structure for stu_info
-- ----------------------------
DROP TABLE IF EXISTS `stu_info`;
CREATE TABLE `stu_info`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `stu_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stu_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stu_sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stu_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stu_class` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stu_major` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stu_total` double(255, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `学号`(`stu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu_info
-- ----------------------------
INSERT INTO `stu_info` VALUES (1, '002017', '李傻', '女', '123@qq.com', '15计算机', '计算机专业', 10);
INSERT INTO `stu_info` VALUES (2, '002018', '李世民', '男', '234@qq.com', '15能源', '能源专业', 10);
INSERT INTO `stu_info` VALUES (3, '002019', '刘备', '男', '456@qq.com', '15设计', '设计专业', 10);

-- ----------------------------
-- Table structure for total_grade
-- ----------------------------
DROP TABLE IF EXISTS `total_grade`;
CREATE TABLE `total_grade`  (
  `id` int(0) NOT NULL,
  `stu_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `act_total` double(255, 0) NULL DEFAULT NULL,
  `inno_total` double(255, 0) NULL DEFAULT NULL,
  `lec_total` double(255, 0) NULL DEFAULT NULL,
  `read_total` double(255, 0) NULL DEFAULT NULL,
  `total` double(255, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of total_grade
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
