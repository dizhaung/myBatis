CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mybatis`;

create table t_wife(
 id int primary key auto_increment,
 wife_name varchar(20),
 fk_husband_id int
);

create table t_husband(
id int primary key auto_increment,
husband_name varchar(20)
);

insert into t_husband values (null,'hello');
insert into t_wife values(null,'kitty',1)


