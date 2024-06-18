use employees;
show tables;
desc departments;
select * from departments;
/*
 [index]
*/
 
 # index 확인 (조회) ========================================================
 show index from employees;
 show indexes in employees;
 
 # index 생성 ==============================================================
 # create [unique] index 인덱스명 on 테이블명 (컬럼명1, 컬럼명2) [asc|desc];
 create index idx_employees_birth_date on employees (birth_date);
 show index from employees;
 
 select * from employees;
 
# index 삭제  ==============================================================
# drop index 인덱스명 on 테이블명;
drop index idx_employees_birth_date on employees;
show index from employees;

 # index 설정 ==============================================================
# alter 추가 : 구조 변경
# alter table 테이블명 add index 인덱스명(컬럼명1, 컬럼명2);
alter table employees add index idx_emp_birth_date(birth_date);
show index from employees;

# alter: 인덱스 삭제
alter table employees drop index idx_emp_birth_date;
show index from employees;

# 전체 DB의 모든 Key 정보 조회 ============================================
 select * from information_schema.table_constraints;
 
 # 특정  DB의 모든 Key 정보 조회 ===========================================
select * from information_schema.table_constraints 
where (TABLE_SCHEMA or CONSTRAINT_SCHEMA)  like '테이블명';

# employee의 DB에 있는 key 만 조회하기
select * 
from information_schema.table_constraints
where TABLE_SCHEMA like 'employees';

# departments의 인덱스 확인
show index from departments;

#  =========================================================================
# Full Table Scan
select * from employees; -- employee : index -> emp_no에 설정

# index 사용 o : single row (cost ↓)
select * 
from employees
where emp_no = 11111;

# index 사용 x : birth_date - index 설정 x  → full table scan (cost ↑)
select  * 
from employees
where birth_date = '1953-09-02';
# 단, 비용이 높아도 효율적인 경우도 있음

# index 설정 
# alter table 테이블명 add index  인덱스명(컬럼명1, 컬럼명2);
alter table employees add index idx_emp_birth_date(birth_date);
show index from employees;

select  * 
from employees
where birth_date = '1953-09-02';
 -- > Execution Plan :  non_ unique key lookup

# index 삭제 
alter table employees drop index idx_emp_birth_date;
show index from employees;

select  * 
from employees
where birth_date = '1953-09-02';
 -- > Execution Plan : Full Table Scan
