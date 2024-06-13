# [문제] ======================================================================
# [titles 테이블의 일부 구조를 복사한 c_titles 테이블 생성]
# emp_no, title, from_date 컬럼 구조만 그대로 복사 -> key 복사
# to_date 컬럼 제외
# 데이터는 title이 Endineer 인 행만 추가

# 1) 테이블 구조(key 포함) 복사
# titles 테이블 복사한 c_titles 테이블 생성
create table c_titles like employees.titles;

# 2) 테이블 목록 확인
show tables like 'c_titles';

# 3) c_titles 테이블 구조 확인
desc c_titles;

# 4) to_date 컬럼 삭제
alter table c_titles drop to_date;
desc c_titles;

# 5) c_titles 테이블 데이터 조회 : 데이터 없음 !
select * from c_titles;

# 6) titles 테이블 조회 
select emp_no, title, from_date 
from employees.titles
where title like 'Engineer';

# 7) c_titles 에 일부 row 추가 : emp_no, title, from_date
insert into c_titles 
select emp_no, title, from_date 
from employees.titles
where title like 'Engineer';

# 8) c_titles 테이블 데이터 조회 
select * from c_titles;


# [문제] ======================================================================
# t1 테이블을 복사한 copy_t1 생성하시오 .
# [copy_t1 테이블] co1 의 값이 10 이상인 row 의 co2 컬럼의 값을 null 로 변경

# 1) t1 테이블을 복사한 copy_t1 생성
create table copy_t1 like t1;

# 2) 테이블 목록 확인
show tables like 'copy%';

# 3) copy_t1 테이블 구조 확인
desc copy_t1;

# 4) copy_t1 테이블 데이터 조회 : 데이터 없음 !
select * from copy_t1;

# 5) t1 테이블 조회 : co1 의 값이 10 이상인 row
select * from t1; 

# 6) copy_t1 에 row 추가 : t1 row 추가
insert into copy_t1 
select * from t1;

# 7) copy_t1 테이블 데이터 조회 : 5 rows 복붙 !
select * from copy_t1;

# 8) copy_t1 테이블 데이터 co1 의 값이 10 이상인 row 의 co2 컬럼의 값을 null 로 변경
update copy_t1
set co2 = null
where co1 >= 10 ;

# 9) copy_t1 테이블 데이터 조회 
select * from copy_t1;

# [문제] ======================================================================
# salaries 의 row 100개 복사한 copy_salaries 테이블 생성
# key 복사 없이, 모든 컬럼과 로우 100개 복사
# 입사일이 1986년도인 직원의 현재 연봉을 10% 인상하시오.

# 1) salaries 의 row 100개 데이터 조회
select * from employees.salaries limit 100;

# 2) key 복사 없이, 모든 컬럼 복사한 copy_salaries 테이블 생성
create table copy_salaries 
as
select * from employees.salaries limit 100;

# 2) 테이블 목록 확인
show tables like 'copy%';

# 3) copy_salaries 테이블 구조 확인
desc copy_salaries;

# 4) copy_salaries 데이터 조회
select * from copy_salaries;

# 5) 입사일이 1986년도인 직원의 현재 연봉
update copy_salaries
set salary = salary * 1.1
where to_date >= '1986-01-01';

# 6) copy_salaries 데이터 조회
select * from copy_salaries where to_date >= '1986-01-01';

# [문제] ======================================================================
# DB명 : example
create database example;
use example;

# 테이블 생성
# department 테이블 생성
create table department(
	deptno int not null,
    deptname varchar(20),
    manager varchar(20),
    primary key(deptno)
);
desc department;

# employee 테이블 생성
create table employee(
	empno int not null,
    name varchar(20),
    phoneno varchar(20),
    address varchar(20),
    gender varchar(20),
    position varchar(20),
    deptno int,
    primary key(empno),
    foreign key(deptno) references department(deptno)
);
desc employee;

# project 테이블 생성
create table project(
	projno int not null,
    projname varchar(20),
    deptno int,
    primary key(projno),
    foreign key(deptno) references department(deptno)
);
desc project;

# works 테이블 생성
create table works(
	projno int not null,
    empno int not null,
    hoursworked int,
    primary key(projno, empno),
    foreign key(projno) references project(projno),
    foreign key(empno) references employee(empno)
);
desc works;

# 데이터 추가
# department 테이블 데이터 추가
insert into department 
values
(1, 'IT', '고남순'),
(2, 'Marketing', '홍길동');

# department 테이블 데이터 조회
select * from department;

# employee 테이블 데이터 추가
insert into employee
values
(1, '김덕성', '010-1234-1232', '서울', '여', 'Programmer', 1),
(2, '이서울', '010-1232-3122', '서울', '남', 'Programmer', 1),
(3, '박연세', '010-7685-1231', '대전', '여', 'Salesperson', 2),
(4, '홍길동', '010-1234-1546', '서울', '남', 'Manager', 2),
(5, '고남순', '010-1231-1112', '서울', '여', 'Manager', 1);

# employee 테이블 데이터 조회
select * from employee;

# project 테이블 데이터 추가
insert into project
values
(1, '데이터베이스구축', 1),
(2, '시장조사', 2);

# project 테이블 데이터 조회
select * from project;

# works 테이블 데이터 추가
insert into works
values
(1, 1, 3),
(1, 2, 1),
(1, 5, 1),
(2, 3, 1),
(2, 5, 5);

# works 테이블 데이터 조회
select * from works;

# 1. IT 부서에서 일하는 사원의 이름과 주소를 조회하시오.
select name, address
from employee
where deptno = 1;

select name, address
from employee e, department d
where e.deptno = d.deptno and d.deptname like 'IT';

# 2. 홍길동 팀장(manager) 부서에서 일하는 사원의 수를 조회하시오.
select count(empno) '사원수'
from employee
where deptno = 2;

select count(empno) '사원수'
from employee e, department d
where e.deptno = d.deptno and manager like '홍길동';

# 3. 프로젝트에 투입된 총 시간과 프로젝트명을 조회하시오.
select projname '프로젝트명', sum_hoursworked '총 투입 시간'
from project p, 
    (select projno, sum(hoursworked) 'sum_hoursworked' from works group by projno) w
where p.projno = w.projno;
