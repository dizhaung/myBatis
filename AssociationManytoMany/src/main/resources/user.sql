CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `mybatis`;

create table t_student(
 id int primary key auto_increment,
 student_name varchar(20)
);

create table t_courses(
id  int primary key auto_increment,
courses_name varchar(20)
);

create table t_stu_cou(
 id int primary key auto_increment,
 fk_stu_id int,
 fk_cou_id int 
);

insert into t_student values (null,'stu1');
insert into t_student values (null,'stu2');
insert into t_student values (null,'stu3');
insert into t_student values (null,'stu4');
insert into t_student values (null,'stu5');

insert into t_courses values (null,'c');
insert into t_courses values (null,'c#');
insert into t_courses values (null,'php');
insert into t_courses values (null,'java');
insert into t_courses values (null,'html');

insert into t_stu_cou values (null,1,1);
insert into t_stu_cou values (null,1,2);
insert into t_stu_cou values (null,2,3);
insert into t_stu_cou values (null,2,4);
insert into t_stu_cou values (null,3,1);
insert into t_stu_cou values (null,3,5);
insert into t_stu_cou values (null,4,4);
insert into t_stu_cou values (null,4,2);


