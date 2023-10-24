/*
SQLyog Community v12.09 (64 bit)
MySQL - 5.7.35-log : Database - cloud_order
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`spzx-cloud-order` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `spzx-cloud-order`;

/*Table structure for table `tb_order` */

DROP TABLE IF EXISTS `tb_order`;

CREATE TABLE `tb_order` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `user_id` bigint(20) NOT NULL COMMENT '用户id',
  `name` varchar(100) DEFAULT NULL COMMENT '商品名称',
  `price` bigint(20) NOT NULL COMMENT '商品价格',
  `num` int(10) DEFAULT '0' COMMENT '商品数量',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `username` (`name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `tb_order` */

insert  into `tb_order`(`id`,`user_id`,`name`,`price`,`num`) values (101,1,'Apple 苹果 iPhone 12 ',699900,1),(102,2,'雅迪 yadea 新国标电动车',209900,1),(103,3,'骆驼（CAMEL）休闲运动鞋女',43900,1),(104,4,'小米10 双模5G 骁龙865',359900,1),(105,5,'OPPO Reno3 Pro 双模5G 视频双防抖',299900,1),(106,6,'美的（Midea) 新能效 冷静星II ',544900,1),(107,2,'西昊/SIHOO 人体工学电脑椅子',79900,1),(108,3,'梵班（FAMDBANN）休闲男鞋',31900,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
