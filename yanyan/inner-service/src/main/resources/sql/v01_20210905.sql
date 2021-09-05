--用户表
CREATE TABLE `user_info` (
                             `name` varchar(255) CHARACTER SET utf8 DEFAULT '' COMMENT '姓名',
                             `age` int(10) DEFAULT NULL COMMENT '年龄'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;