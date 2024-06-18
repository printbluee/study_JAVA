# [DB 선택] --------------------------------------------------
use test;

# [기존 테이블 삭제] -----------------------------------------
# if exists : 테이블이 존재한다면, 삭제
drop table if exists buy;
drop table if exists customer;

# [테이블 생성] ----------------------------------------------
create table if not exists customer(
	id int,
    name varchar(50),
    primary key(id)
);
desc customer;

create table if not exists order_list(
	order_id int not null,
    id int not null,
    product_name varchar(50) not null,
    primary key(order_id),
    foreign key(id) references customer(id)
);
desc order_list;

select * from customer;
select * from order_list;

# [테이블 추가] ----------------------------------------------
insert into customer
values
(1, '홍길동'),
(2, '박보검'),
(3, '이미자'),
(4, '나가자');

# [5번 회원 없음]
# Error Code: 1452. Cannot add or update a child row: 
# a foreign key constraint fails 
# (`test`.`order_list`, CONSTRAINT `order_list_ibfk_1` FOREIGN KEY (`id`) REFERENCES `customer` (`id`))
insert into order_list
values
(1001, 1, '초콜릿'),
(1002, 1, '샴푸'),
(1003, 2, '책상'),
(1004, 5, '티슈'); # 없는 데이터 5 

# [5번 회원 생성]
insert into customer
values(5, '하늘');

insert into order_list
values
(1001, 1, '초콜릿'),
(1002, 1, '샴푸'),
(1003, 2, '책상'),
(1004, 5, '티슈'); # 없는 데이터 5

# 설정 해제, NO ACTION
# 무결성 깨짐
set FOREIGN_KEY_CHECKS=0;

# [5번 회원 탈퇴] -----------------------------------------------------
# 외래키 제약 조건때문에 삭제 x
# 데이터의 무결성 유지
# Error Code: 3730. Cannot drop table 'customer' referenced by a foreign key constraint 'order_list_ibfk_1' on table 'order_list'.
delete from custome
where id = 5;

select * from customer;
select * from order_list;

# INNER JOIN ===========================================================
# cf) 
select *
from customer c, order_list o
where c.id = o.id; # 조인 조건(조인 조건을 where 에 두는 건 사실 맞지는 않음)

# 조인 조건이 from 절에 들어옴
# 이 방법을 더 권장
# 근데 나머지 데이터는 조회가 안됐는데 이러한 현상을 참여하지 않은 row 라 부름
# inner join
select *
from customer c inner join order_list o on c.id = o.id;

# LEFT JOIN ===========================================================
# from 절 기준으로 왼쪽 오른쪽을 구분
# 조인에 참여하지 않은 로우 포함
# on : join 조건
# ex) 시크릿 쿠폰
select *
from customer c left join order_list o on c.id = o.id;

# 조인에 참여하지 않은 로우만 표시
select *
from customer c left join order_list o on c.id = o.id
where o.id is null;

# right JOIN ===========================================================
# from 절 기준으로 왼쪽 오른쪽을 구분
select *
from customer c right join order_list o on c.id = o.id;

# 조인에 참여하지 않은 로우만 표시
select *
from customer c right join order_list o on c.id = o.id
where c.id is null;

# full outer join =====================================================
# MySQL 은 full outer join 지원 x
# Error Code: 1064. You have an error in your SQL syntax; 
# check the manual that corresponds to your MySQL server version for the right syntax to use near
# 'full outer joinorder_list o on c.id = o.id' at line 1
# select * from customer c full outer joinorder_list o on c.id = o.id;

# [합집합] : 모든 로우 조회
select *
from customer c left join order_list o on c.id = o.id
union
select *
from customer c right join order_list o on c.id = o.id;

# [합집합 - 교집합] : 조인에 참여하지 않은 모든 로우 조회
select *
from customer c left join order_list o on c.id = o.id
where o.id is null
union
select *
from customer c right join order_list o on c.id = o.id
where c.id is null;

# 테이블 생성 일시, 갱신 일시 =========================================
# DB 선택
use information_schema;

# table 목록
show tables like 'tables';

select * from tables;

select table_schema, table_name, create_time, update_time
from tables
where table_schema like 'test';

use test;
show table status;
show table status where name like '%order%';