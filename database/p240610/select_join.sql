## 수평 조인 : from 절에 테이블명을 , 로 구분하여 여러 개
select * from dept_manager;
select * from departments;

# 다대다 조인 : M x N
# 있는 row 를 다 연결
select * from dept_manager, departments;

# error! : Column 'dept_no' in field list is ambiguous
# select 절에 dept_no 가 2개(여러 개)가 있어서 구분하기 어려움 !
select emp_no, dept_no, from_date, to_date, dept_no, dept_name
from dept_manager, departments;

# 원래는 테이블명이 생략된 것 !
select emp_no, dept_manager.dept_no, from_date, to_date, departments.dept_no, dept_name
from dept_manager, departments;

# as 생략 가능 !
select emp_no, dm.dept_no, from_date, to_date, de.dept_no, dept_name
from dept_manager dm, departments de;


## 수직 조인 : where 절에 조인 조건(징검 다리)
# 부서번호가 같은 row 수평 조인
# 1) 
select emp_no, dm.dept_no, from_date, to_date, dp.dept_no, dept_name
from dept_manager as dm, departments as dp
where dm.dept_no = dp.dept_no; # 조인 조건

# 2) 특정 컬럼만 조회
select dept_name, emp_no
from dept_manager dm, departments dp
where dm.dept_no = dp.dept_no;

# 3-1) 부서의 현재 매니저 정보 조회
select dept_name as '부서명', emp_no as '사번'
from dept_manager dm, departments dp
where dm.dept_no = dp.dept_no and to_date like '9999-01-01';

# 3-2) 사원의 사번, 이름, 직책 조회
# 	   단, 현재 직책만 조회
select emp.emp_no, first_name, title
from employees emp, titles t 
where emp.emp_no = t.emp_no and t.to_date like '9999-01-01';



