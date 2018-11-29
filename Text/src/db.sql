create table goods(
    id varchar2(50 char) primary key,
    name varchar2(50 char),
    price number(10,2)
);
insert into goods values('0001','小米手机',2000);
insert into goods values('0002','华为手机',3000);
insert into goods values('0003','联想手机',4000);
insert into goods values('0004','联想电脑',5000);
insert into goods values('0005','华硕电脑',6000);
insert into goods values('0006','神舟电脑',4000);
insert into goods values('0007','格力空调',8000);
commit;
