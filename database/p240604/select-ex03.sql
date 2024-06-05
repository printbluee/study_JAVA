# DB 선택
use employees;
select * from employees;
desc employees;

# first_name(varchar(14)) : 문자열에 연산을 할 경우 문자열이 0 이 됨 (MySQL 에서 처리) 
select emp_no, emp_no + 1, first_name, first_name + 1
from employees;

/*
[산술 연산자] + - * /
1. 단순 계산
select 컬럼명 from 테이블명;

2. 특정 컬럼 데이터 연산
*/

# 1. 단순 계산
# select 에 컬럼을 쓴다는 것은 데이터가 있다는 뜻인데, 만약 컬럼이 없는 것이면, 조건이 컬럼이 됨
select 10 + 10;
select 20 - 10,  30 * 3,  40 / 2;

# 2. 특정 컬럼 데이터 연산
select emp_no, salary, salary + 10 from salaries;
select emp_no, salary, salary + 10 as '10 증가 값' from salaries;

# [문제] 사원 번호, 현재 연봉, 10% 인상된 각 사원의 연봉 조회 (조회 결과 20개 로우만 조회)
select emp_no, salary, salary * 1.1 as '10% 인상' from salaries limit 20;


# [distinct] 중복 제거
select dept_no, emp_no from dept_manager;
select distinct dept_no, emp_no from dept_manager;


# [where clause 사용되는 연산자] 
# * 비교   연산자 (관계 연산자)
# * 논리   연산자
# * 범위   연산자
# * 집합   연산자
# * 문자열 연산자
# * null   연산자
