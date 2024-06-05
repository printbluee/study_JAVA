## DB 선택
use world;

/*
[SQL] 
- 크게 3개로 나뉘어짐
- 쿼리 튜닝, 성능 최적화
- 정의어(DDL) : create(생성), drop(삭제), alter(변경) ...
- 조작어(DML) : select(조회★), insert(추가), update(수정), delete(삭제) ... # 제일 많이 사용
- 제어어(DCL) : grant(부여), revoke(회수), commit(완료), rollback(취소) ...
drop 과 delete 삭제지만, 다른 결의 삭제, 각각 하는 역할이 다름
*/ 

/*
[조작어] select - 조회/검색
<< select statement >> select 문
# select 필드명1, 필드명; [ select clause ] select 절
# from 테이블명;		  [ from   clause ] from   절	
# where 조건; (생략 가능) [ where  clause ] where  절
*/

## DB 선택
use employees;

## table 목록
show tables;

## employees 테이블 구조(정보)
desc employees;

## employees 테이블 조회
# 전체 조회
select * from employees; 

# 선택 조회
select emp_no, birth_date, first_name, last_name, gender, hire_date from employees;

select emp_no, first_name, hire_date from employees;

select birth_date, emp_no from employees;

/* 
============================================================
1. 사원의 이름,      성별   추출
2. 부서의 부서 번호, 부서명 추출
3. 사원의 사원 번호, 연봉   추출
4. 사원의 사원 번호, 직책   추출
============================================================
*/
# DB 선택
use employees; 

# 1. 사원의 이름, 성별 추출
desc employees; 
select first_name, gender from employees;

# 2. 부서의 부서 번호, 부서명 추출
desc departments;
select dept_no, dept_name from departments;

# 3. 사원의 사원 번호, 연봉 추출
desc salaries;
select emp_no, salary from salaries;

# 4. 사원의 사원 번호, 직책 추출
desc titles;
select emp_no, title from titles;


/* 
[LIMIT] 
- 문법 1 : limit 몇 개;
- 문법 2 : limit offset, 몇 개;
*/
select * from employees; # 전체 조회할 때
select * from employees limit 3; # 시작부터 3개까지 조회하고 싶을 때
select * from employees limit 4, 3; # 시작이 되는 위치에서부터 4만큼 떨어진 것