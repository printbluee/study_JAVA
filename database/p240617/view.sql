/*
뷰 [view]
가상 테이블
- 물리적으로 존재 x --> 논리적 존재
- 쿼리문(select) --> 쿼리 재사용
- 추가, 삭제, 수정에 제약이 따를 수 있음
- 뷰는 인덱스를 가질 수 없음 --> 실제 테이블이 아니기 때문
- 보안의 효과를 가짐

[문법]
create [or replace] view 뷰이름
as
select 컬럼명
from 테이블명;
*/

# DB 선택
use test;

# [view] emp 생성
create view emp
as
select * from employees.employees;

show tables like 'emp';

# [view] emp 조회
# select * from (select * from employees.employees); # 사실상 쿼리문이 실행된 것
select * from emp;

# [view] emp 로우 추가
insert into emp 
values(10000, '2000-01-01', 'Hey', 'Kim', 'M', '2024-01-01');

# [view] emp 조회
# 가상 테이블로 추가/수정/삭제 할 때 물리적으로 존재하고 있는 테이블, 기반 테이블에도 반영이 됨
select * from emp;
select * from employees.employees; # 기반 테이블

# [base table] employees 로우 삭제
delete from employees.employees
where emp_no = 10000;

# [base table] employees 삭제 여부
select * from employees.employees; # 기반 테이블

# [view] emp 삭제 여부 : 반영됨
select * from emp;

# --------------------------------------------------------------------
show tables like 'emp';

# [view 로 새로운 view 생성]
# view 로 또 다른 새로운 view 생성 가능
# select first_name as name, gender
# from (select * from employees.employees);
create view view_emp
as
select first_name as name, gender
from emp;

# table 목록
show tables like '%emp'; # emp, view_emp

# [view] view_emp 조회
select * from view_emp
where gender like 'M';

# [view] view_emp 로우 추가
# 함부러 데이터 추가가 안되게 제약이 따름 !
insert into view_emp
values('Hong', 'F'); # Error Code: 1423. Field of view 'test.view_emp' underlying table doesn't have a default value

desc employees.employees; # 기반 테이블에서 null 을 허용 안하는데, first_name 과 gender 만 넣어주니 error !

# [view] view_emp 로우 수정 : Georgi -> Kang
select * from view_emp;

# 253 row(s) affected Rows matched: 253  Changed: 253  Warnings: 0
update view_emp
set name = 'Kang'
where name like 'Georgi';

# 253 row(s) returned
select * 
from view_emp
where name like 'Kang';

# [base table] 데이터 변경 여부
# 253 row(s) returned
select * from employees.employees
where first_name like 'Kang';

# 작업 취소
rollback;

# 253 row(s) returned
select * from view_emp
where name like 'Georgi';

# [base table] Georgi 삭제
# 253 row(s) affected
delete from employees.employees
where first_name like 'Georgi';

# [view] view_emp 삭제 여부 확인
# 0 row(s) returned
select * from view_emp
where name like 'Georgi';

# [view] emp 삭제 여부 확인
select * from emp;

# [작업 취소]
rollback;

# [base table] 
# 253 row(s) affected
delete from employees.employees
where first_name like 'Georgi';

# [view] view_emp 삭제 여부 확인
# 0 row(s) returned
select * from view_emp
where name like 'Georgi';

# [view] emp 삭제 여부 확인
select * from emp;


# [문제] --------------------------------------------------------
show tables like 'copy%';

# copy_departments 테이블 삭제
drop table copy_departments;

# departments 테이블 복사한 copy_departments 테이블 생성
create table copy_departments
as
select * from employees.departments;

show tables like 'copy%';

# copy_departments 테이블 데이터 조회
select * from copy_departments;

# 1. view 생성
# 뷰 이름 : view_depart
# 뷰 컬럼 : dept_name
create view view_depart
as select dept_name from copy_departments;

# 2. view 데이터 조회
select * from view_depart;

# [view] 로우 추가 : 홍보부
insert into view_depart
values('홍보부');

desc view_depart;
desc copy_departments;

# 3. [base table] copy_departments 삭제
drop table copy_departments;

# 4. [view] : 조회
# Error Code: 1356. View 'test.view_depart' references invalid table(s) or column(s) or function(s) or definer/invoker 
# of view lack rights to use them
select * from view_depart;

# --------------------------------------------------------------------------------------
# [view] view_emp
select * from view_emp;

# [view] 구조 변경
# 쿼리를 다시 재정의
# 말은 구조 변경이지 아님
alter view view_emp
as
select emp_no, first_name as name, gender
from emp;

# [view] view_emp 조회
select * from view_emp;


# view 확인하는 또 다른 방법 ----------------------------------------------------
show tables;
show tables like 'view%';

show full tables; # Table_Type, 물리적인 테이블(BASE TABLE) | 가상 테이블 (VIEW)
show full tables where table_type like 'VIEW';  # 대소문자 구분 !!
 
select *
from information_schema.tables; # TABLE_TYPE 

select table_schema, table_name, table_type
from information_schema.tables
# where table_type like 'view' error ! : 대소문사 구분
where table_type like 'VIEW' and table_schema like 'test'; 


# -------------------------------------------------------------------------------
# view 생성 쿼리
# 생성 구문
show create view view_emp;

CREATE 
ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER
VIEW `view_emp` 
AS 
select `emp`.`emp_no` AS `emp_no`,
		`emp`.`first_name` AS `name`,
        `emp`.`gender` AS `gender`
from `emp`
, utf8mb4, utf8mb4_0900_ai_ci;


# view 목록
show full tables where table_type like 'VIEW';

# view 삭제
drop view view_emp;

# [view] view_depart 데이터 조회
select * from emp; 

# view 생성
# 이미 이름이 있는 view 생성할 수 없음
create view emp
as
select emp_no, first_name
from employees.employees;

# or replace : 이미 이름이 있는 view 가 있다면 교체
create or replace view emp
as
select emp_no, first_name
from employees.employees;

# [view] emp 데이터 조회
select * from emp;

# [view] emp index 생성 
# Error Code: 1347. 'test.emp' is not BASE TABLE
create index idx_emp_emp_no on emp(emp_no);