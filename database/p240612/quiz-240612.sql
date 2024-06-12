/*
[문제]
temp6 테이블 생성
<컬럼의 정보> 
id   : temp2의 one 컬럼을 참조하는 외래키, null 허용 안함
name : varchar, 길이 30, null 허용 안함
age  : int, 1 이상, null 허용 안함 
*/
create table temp6 (
	id int not null,
    name varchar(30) not null,
	age int default 1 not null,
    foreign key(id) references temp2(one),
    check(age >= 1)
);

# 테이블 구조
desc temp6;
desc temp2;

insert into temp6 values(1, '홍길동', 30);
insert into temp6 values(1, '홍길동', -1);
insert into temp6 values(1, '이미자', 33);

select * from temp6;