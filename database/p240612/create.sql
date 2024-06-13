use test; # DB 선택
select database(); # DB 확인
show tables; # table 목록 확인

# [Type : float 확인]
# 버전업되면서 float 자리수를 지정 안해줘도 됨 !
create table t2(
	co1 float(5, 1),
    co2 float(5, 2),
    co3 float(5, 3),
    co4 float(5, 4),
    co5 float(5, 5),
    co6 float
);

# 테이블 구조
desc t2;

# 데이터 추가 (=로우 추가) 
# DML insert
# insert into 테이블명(컬럼명1, 컬럼명2) values(값1, 값2);
# insert into 테이블명 values(값1, 값2);
# 칼럼이 6개니까 값 6개 넣어줌
insert into t2 values(1, 1, 1, 1, 1, 1); # Error Code: 1264. Out of range value for column 'co5' at row 1
insert into t2 values(1, 1, 1, 1, 0.1, 1);
insert into t2 values(1.1, 1.1, 1.1, 1.1, 0.1, 1.1);
insert into t2 values(1.12, 1.12, 1.12, 1.12, 0.12, 1.12);
insert into t2 values(1.123, 1.123, 1.123, 1.123, 0.123, 1.123);
insert into t2 values(1.1234, 1.1234, 1.1234, 1.1234, 0.1234, 1.1234);
insert into t2 values(1.12345, 1.12345, 1.12345, 1.12345, 0.12345, 1.12345);
insert into t2 values(1.16, 1.16, 1.16, 1.16, 0.16, 1.16); # 반올림 !

# t2 테이블 데이터 조회
select * from t2;


/*
[제약 조건]
primary key    : 중복 허용 x, null 허용 x, not null + unique
foreign key    : 중복 허용 o, null 허용 o, 참조값만 허용

not nul 	   : null 허용 x
auto_increment : 자동으로 1씩 증가

unique		   : 중복 허용 x(유일한 값만 허용), null 허용 o

check		   : 값의 범위나 종류 지정, 도메인 설정, MySQL 8.0.16 부터 지원
default		   : null 값일 경우 설정되는 값
*/

# PK, NOT NULL, AUTO_INCREMENT ==================================
create table temp1 (
	one int primary key auto_increment, # 컬럼 레벨 방식
    two int not null
);

show tables; # 테이블 목록 확인
desc temp1;   # 테이블 구조 확인 

# 데이터 추가
# 칼럼 개수 대로 값을 넣어줘야 에러가 안남
insert into temp1(one, two) values(1, 1); # 컬럼명 지정
insert into temp1 values(2, 20); 			 # 컬럼명 생략
# 값이 들어오지 않을 때, 마지막 행 기준으로 auto_increment 1씩 증가
insert into temp1(two) values(30);		 # 특정 컬럼에만 값 지정 

insert into temp1 values(100, 100);
insert into temp1(two) values(200);

# not null : two 컬럼 null 허용 x
# Error Code: 1364. Field 'two' doesn't have a default value
insert into temp1(one) values(300);      

# PK 제약 조건에 위해 ! - 중복 
# Error Code: 1062. Duplicate entry '3' for key 'temp1.PRIMARY'
insert into temp1 values(3, 300); 		 

# temp1 테이블 데이터 조회
select * from temp1;


# PK, UNIQUE ====================================================
create table temp2 (
	one int,
    two int unique,
    primary key(one) # 테이블 레벨 방식, 기본키 하고자 하는 컬럼명 넣기
);

show tables; # 테이블 목록 확인
show tables like 'te%'; # 특정 테이블 목록 확인

desc temp2; # temp2 구조 확인

# 데이터 추가
insert into temp2 value(1, 100);

# primary key ----------------------------------------------
# PK 제약 조건 위배 ! - null 허용 x
# Error Code: 1364. Field 'one' doesn't have a default value
insert into temp2(two) value(200); 

# PK 제약 조건 위배 ! - 중복 허용 x
# Error Code: 1062. Duplicate entry '1' for key 'temp2.PRIMARY'
insert into temp2 value(1, 200); 
# unique ---------------------------------------------------
insert into temp2(one) values(2); # unique : null 허용
insert into temp2(one) values(4); # unique : null 허용
# Error Code: 1062. Duplicate entry '100' for key 'temp2.two'
# ex) 아이디
insert into temp2 values(3, 100); # unique : 중복 허용 x

# temp2 테이블 데이터 조회
select * from temp2;


# PRIMARY KEY : MULTIPLE COLUMN PRIMARY KEY
create table temp3 (
	one int,
    two char(10),
    three float,
    four int,
    primary key(one, two, three)
);

# 테이블 구조
desc temp3;

# 데이터 추가
insert into temp3 values(1, '하나', 1.1, 4);
insert into temp3 values(2, '둘', 2.2, 8);

# row 전체가 같지 않아서 중복 x
insert into temp3 values(1, 'first', 1, 1);
insert into temp3 values(1, '하나', 1, 1);

insert into temp3 values(1, '하나', 1.1, 100);  # error ! PK 제약조건 위배 : 중복 허용 x
insert into temp3(two, three, four) values('하나', 1, 100); # error ! PK 제약조건 위배 : null 허용 x

# temp3 테이블 데이터 조회
select * from temp3;


# FOREIGN KEY
# references : 다른 테이블의 기본키 가져옴, 컬럼명은 다르되 타입은 같아야 함
create table temp4 (
	id int,
    name varchar(50),
    foreign key(id) references temp1(one)
);

# 테이블 구조
desc temp4;

# 데이터 추가
insert into temp4 values(1, '홍길동');
insert into temp4 values(10, '박보검'); # 현재 참조 하고 있는 temp1 에 10이 없어서 error !
insert into temp4 values(1, 'hong'); # FK : 중복 허용
insert into temp4(name) values('이미자'); # FK : null 허용

# temp4 테이블 데이터 조회
select * from temp4;
select * from temp1;


# CHECK, DEFAULT
# check(조건)
# constraint 제약명 check(조건)
# M or F, 한 글자이기 때문에 1 byte 여야되는데 2 byte 로 설정함
create table temp5 (
	gender char(2),
    age int default 1,
	constraint ck_gender check(gender in ('M', 'F')),
    check(age >= 1)
);

desc temp5;

# 데이터 추가
insert into temp5 values('M', 25);
insert into temp5 values('F', 26);

insert into temp5 values('male', 33); # Error Code: 1406. Data too long for column 'gender' at row 1
insert into temp5 values('W', 55);    # Error Code: 3819. Check constraint 'ck_gender' is violated.
insert into temp5 values('f', 0);     # Error Code: 3819. Check constraint 'temp5_chk_1' is violated.

insert into temp5 values('m', null);   # default null 들어올 수 있음
insert into temp5(gender) values('m'); # age    컬럼 : null일 경우, 기본값으로 설정
insert into temp5(age) values(33);     # gender 컬럼 : null일 경우, 허용 !

# temp5 테이블 데이터 조회
select * from temp5;

# AUTO_INCREMENT
# Error Code: 1075. Incorrect table definition; there can be only one auto column and it must be defined as a key
create table temp6 (
	co1 int, 
    co2 int auto_increment,
    primary key(co1)
);

# 테이블 생성 쿼리문 확인
show create table temp5;

# 203번줄 코드 실행 후 보여지는 컬럼 마우스 오른쪽 클릭 후 copy row unqouted 클릭하면 됨
# 컬럼 레벨 방식으로 작성해도 테이블 레벨 방식으로 저장이 됨
CREATE TABLE `temp5` (
  `gender` char(2) DEFAULT NULL,
  `age` int DEFAULT '1',
  CONSTRAINT `ck_gender` CHECK ((`gender` in (_utf8mb4'M',_utf8mb4'F'))),
  CONSTRAINT `temp5_chk_1` CHECK ((`age` >= 1))
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

show create table temp1;
CREATE TABLE `temp1` (
  `one` int NOT NULL AUTO_INCREMENT,
  `two` int NOT NULL,
  PRIMARY KEY (`one`)
) ENGINE=InnoDB AUTO_INCREMENT=102 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


# 특정 테이블의 index 정보 조회
show indexes in temp1;
show indexes in temp2;
desc temp2;
show indexes in temp3;
desc temp2;

show indexes in temp4;
desc temp4;

show indexes in temp5;
desc temp5;

# MySQL 버전 확인
select version(); # 8.0.37

show variables like '%version%';

# MySQL port 포트 확인
show variables like '%version%';
show variables like 'port';


/* 
temp6 테이블 생성
<컬럼의 정보> 
id   : temp2의 one 컬럼을 참조하는 외래키, null 허용 안함
name : varchar, 길이 30, null 허용 안함
age  : int, 1 이상, null 허용 안함
*/
use test;
create table temp6 (
	id int not null,
    name varchar(30) not null,
	age int not null,
    foreign key(id) references temp2(one),
    check(age >= 1)
);
show tables like 'temp%';
desc temp6;

insert into temp6 values(1, '홍길동', 25);
insert into temp6 values(3, '박보검', 35); # Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`test`.`temp6`, CONSTRAINT `temp6_ibfk_1` FOREIGN KEY (`id`) REFERENCES `temp2` (`one`))
insert into temp6 values(1, '이미자', 55);
insert into temp6(name, age) values('구름', 100); # Error Code: 1364. Field 'id' doesn't have a default value

select * from temp2;
select * from temp6;

