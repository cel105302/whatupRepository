SELECT * FROM user;
CREATE TABLE `user` (
  `id` bigint(40) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(20) DEFAULT NULL COMMENT '用户名',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `age` int(3) DEFAULT NULL,
  `balance` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user(id,username,name,age,balance) VALUES(1,"user1",'zhangsan',22,19999.0);
INSERT INTO user(username,name,age,balance) VALUES("user2",'李四',22,19999.0);
INSERT INTO user(username,name,age,balance) VALUES("user3",'王五',22,19999.0);
INSERT INTO user(username,name,age,balance) VALUES("user4",'哈哈',22,19999.0);