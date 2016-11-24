CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mybatis`;

create TABLE t_pet(
id int  primary key auto_increment,
name varchar(20),
type varchar(20),
bone int,
fish int
);


