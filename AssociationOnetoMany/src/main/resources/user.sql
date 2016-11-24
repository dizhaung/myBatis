CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mybatis`;

create table t_key(
id int primary key auto_increment,
key_name varchar(20),
fk_lock_id int 
);


create table t_lock(
id int primary key auto_increment,
lock_name varchar(20)
);


