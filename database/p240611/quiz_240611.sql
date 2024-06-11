# DB 선택
use employees;

# [문제 1] 각 사원의 사번, 이름, 연봉 합 조회
select * from salaries limit 100;

# 1-1) 스칼라 서브쿼리
select emp_no '사번', first_name '이름', 
	(select sum(salary) from salaries where emp_no = employees.emp_no) '연봉합'
from employees;

# 1-2) 인라인 뷰
select em.emp_no '사번', first_name '이름', sum(salary) '연봉합'
from employees em, (select emp_no, salary from salaries) as s
where em.emp_no = s.emp_no
group by em.emp_no;


# [문제 2] d001 부서에 근무하고 있는 사원들의 사번, 이름, 부서번호 조회
# 2-1) 스칼라 서브쿼리, 중첩 서브 쿼리
select emp_no '사번', first_name '이름', (select dept_no from departments where dept_no like 'd001') '부서번호'
from employees
where emp_no in (select emp_no from departments where dept_no like 'd001');
