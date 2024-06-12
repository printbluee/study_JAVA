/* 
[SQL]
* DDL (정의어) : create(생성), drop(삭제), alter(변경)
* DML (조작어) : select(조회★), insert(추가), update(수정), delete(삭제)
* DCL (제어어) : grant(부여), revoke(회수), commit(완료), rollback(취소) 
*/

# Database 생성
# [문법] create database DB명;
create database test;

# DB 목록
show databases;

# test DB 삭제
drop database test;

# DB 목록
show databases;

# test DB생성 : 이모지(emoji) 지원
create database test;
# character set utf8mb4; 버전 업되면서 기본값 됨

# test DB 삭제
drop database test;

# test DB생성
create database test;

show databases;

# 작성된 쿼리문 확인
show create database test;

# test DB 선택
use test; # 선택되면 스키마에 볼드체로 보여짐

# 테이블 목록 확인
show tables; # 방금 생성해서 암것도 없음

/*
[테이블 생성] 방법 3가지

* [문법 1] ---------------------------------------------
- IF NOT EXISTS : 테이블이 존재하지 않을 때만 생성하겠다 ! (옵션)
create table [IF NOT EXISTS] 테이블명 (
	컬럼명1 자료형;
	컬럼명2 자료형(크기);
);

* [문법 2] ---------------------------------------------
: 테이블 구조 + 데이터 복사
: 서브쿼리 이용한 테이블 생성
: 테이블 복사 -> 키는 복사 x
: as # 생략 가능
create table [IF NOT EXISTS] 테이블명
as
select 컬럼명, 컬럼명
from   테이블명
where  조건;

* [문법 3] ---------------------------------------------
: 테이블 구조만 복사
: key 복사
create table [IF NOT EXISTS] 복사본_테이블명 like 원본_테이블명
*/

# [테이블 생성 : 문법 1]
# table 조회 : test DB 에 테이블 없음
show tables;

# t1 테이블 생성
# 컬럼 오고, 타입이 와야함 (순서 바뀌면 error)
create table t1(
	co1 int,
    co2 varchar(10),
    co3 float
);

# table 조회 : t1 테이블 생성 !
show tables;

# t1 테이블 구조 확인
desc t1;

# t1 테이블 데이터 조회
select * from t1;

# [테이블 생성 : 문법 2]
# 서브쿼리 이용한 테이블 생성

# 현재 선택된 DB 확인
select database();

# employees DB 선택
use employees;

# departments 테이블의 모든 데이터 조회
select * from departments;

# test DB 선택
use test;

select database();

# test DB 에서 departments 테이블 데이터 조회
select * from employees.departments;

# employees DB 의 departments 테이블 복사
create table copy_departments
as
select * from employees.departments;

# table 목록 확인
show tables;

# copy_departments 데이터 조회
select * from copy_departments;

# 테이블 구조 확인
# employees DB : departments 테이블 
# UNI : 유효값, 중복을 허용하지 않은 키, 기본키 개념 x
desc employees.departments;

# test DB : copy_departments 테이블
# key 복사 x
desc copy_departments;

# [문제] test DB
# 사번과 직책 컬럼으로 구성된 copy_titles 테이블 생성
# 단, staff 정보만 데이터 구성
create table copy_titles
as
select * 
from employees.titles
where title like 'staff';

# 테이블 목록 확인
show tables;

# copy_titles 테이블 조회
select * from copy_titles;

# copy_titles 구조 확인
# key 복사 x
desc copy_titles;

# [테이블 생성 : 문법 3]
# 테이블 구조만 복사
# employees 테이블 구조 확인
desc employees.employees;

# employees.employees 테이블의 구조를 복사한 copy_employees 테이블 생성
create table copy_employees like employees.employees;

# 테이블 목록
show tables;

# copy_employees 구조 확인
# key 복사 o
desc copy_employees;

# copy_employees 테이블 데이터 조회
# 테이블 구조만 복사될 뿐, 데이터는 복사 x
select * from copy_employees;

# 테이블 생성 : 기존에 생성된 테이블
show tables;

# error ! : Table 't1' already exists
create table t1 (
	co1 int,
    co2 char(5)
);