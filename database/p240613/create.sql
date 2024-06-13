# DB 선택
use test;

# 테이블 목록
show tables like 'temp%';

# temp2 테이블 구조 확인
desc temp2;

# temp7 테이블 생성
# 모든 컬럼에 null 허용 x
# id : temp2 테이블의 one 컬럼 참조
# constraint : 제약명
create table temp7 (
	id int not null,
    name varchar(30) not null,
    age int not null,
    constraint pk_id primary key(id),
    constraint fk_id foreign key(id) references temp2(one),
    constraint ck_age check(age >= 1)
);

# temp7 테이블 구조 확인
desc temp7;

# 데이터 추가
insert into temp7 values(1, '홍길동', 25);
insert into temp7 values(3, '박보검', 35); # Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`test`.`temp7`, CONSTRAINT `fk_id` FOREIGN KEY (`id`) REFERENCES `temp2` (`one`))
insert into temp7 values(1, '이미자', 55); # Error Code: 1062. Duplicate entry '1' for key 'temp7.PRIMARY' 

# temp7 테이블 구조 확인
select * from temp7;


# [system catalog] temp7 테이블의 제약 조건 확인
show databases;
use information_schema;
show tables;

select * from table_constraints;

# test DB의 정보
select * 
from table_constraints
where table_schema like 'test';

# test DB의 temp7 테이블 정보
select * 
from table_constraints
where table_schema like 'test'
	and table_name like 'temp7';








