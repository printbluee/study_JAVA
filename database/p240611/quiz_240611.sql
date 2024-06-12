# DB 선택
use employees;

# [문제 1] 각 사원의 사번, 이름, 연봉 합 조회
select * from salaries limit 100;

# 1-1) 스칼라 서브쿼리
select emp_no '사번', first_name '이름', 
	(select sum(salary) from salaries where emp_no = employees.emp_no) '연봉합'
from employees;

select emp_no '사번', first_name '이름', 
	(select sum(salary) from salaries where emp_no = employees.emp_no group by emp_no ) '연봉합'
from employees;

# 1-2) 인라인 뷰
select em.emp_no '사번', first_name '이름', sum(salary) '연봉합'
from employees em, (select emp_no, salary from salaries) as s 
where em.emp_no = s.emp_no
group by em.emp_no;

select em.emp_no '사번', first_name '이름', sum_salary '연봉합'
from employees em, (select emp_no, sum(salary) 'sum_salary'  # 다대다 조인
						from salaries 
						group by emp_no) as s 
where em.emp_no = s.emp_no;

select em.emp_no '사번', first_name '이름', sum_salary '연봉합'
from employees em, (select emp_no, format(sum(salary), '#,###') 'sum_salary'  # 다대다 조인
						from salaries 
						group by emp_no) as s 
where em.emp_no = s.emp_no;

# [문제 2] d001 부서에 근무하고 있는 사원들의 사번, 이름, 부서번호 조회
# 2-1) 스칼라 서브쿼리, 중첩 서브 쿼리
# 사원들의 사번, 이름 - main 쿼리 작성
select emp_no, first_name 
from employees;

# d001 부서에 근무하고 있는 사원들의 사번
select emp_no, dept_no
from dept_emp
where dept_no like 'd001';

# d001 부서에 근무하고 있는 사원들의 사번, 이름 - 중첩 서브 쿼리
select emp_no, first_name
from employees
where emp_no in (select emp_no from dept_emp where dept_no like 'd001');

# d001 부서에 근무하고 있는 사원들의 사번, 이름, 부서번호 조회 - 스칼라 서브쿼리
# 작업의 의도에 따라 쿼리문이 달라짐
select emp_no '사번', first_name '이름', 
	(select dept_no 
		from dept_emp de 
        where de.emp_no = e.emp_no
        order by to_date desc  # 내림차순, 그럼 현재 재직으로 뜰 것 9999-01-01
        limit 1) '부서번호'
from employees e
where emp_no in (select emp_no from dept_emp where dept_no like 'd001');

select emp_no '사번', first_name '이름', 
	(select dept_no 
		from dept_emp de 
        where e.emp_no = de.emp_no and to_date = '9999-01-01') '부서번호'
from employees e
where emp_no in (select emp_no from dept_emp where dept_no like 'd001');

# inline view
select e.emp_no, first_name, dept_no
from employees e, (select emp_no, dept_no from dept_emp where dept_no like 'd001') d
where e.emp_no = d.emp_no; # join 조건

select e.emp_no, first_name, dept_no
from employees e, dept_emp d
where e.emp_no = d.emp_no # join 조건
	and dept_no like 'd001'
    and to_date = '9999-01-01';
