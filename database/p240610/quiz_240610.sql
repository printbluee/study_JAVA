# DB 선택
use employees;

# [문제] 공백이 있는 부서명 조회
select dept_name
from departments
where instr(dept_name, ' ');

# [문제 1] 남자 사원의 수
select count(emp_no) as '남자 사원 수'
from employees
where gender like 'm';

# [문제 2] d005 부서의 현재 근무하고 있는 사원 수
select count(dept_no) as 'd005 부서의 현재 근무하고 있는 사원 수'
from dept_emp
where dept_no like 'd005' and to_date like '9999-01-01';

# [문제 3] 부서별 현재 재직자 수
select dept_no as '부서', count(*) as '재직자 수'
from dept_emp
where to_date like '9999-01-01'
group by dept_no;

# [문제 4] 각 부서의 과거 매니저 수
select dept_no as '부서', count(*) as '과거 매니저 수'
from dept_manager
where to_date <> '9999-01-01'
group by dept_no;

# [문제 5] 직책에 공백이 있는 데이터의 길이를 구하시오.
# 단, 중복을 제거하여 하나의 데이터만 조회
select distinct title as '직책', length(title) as '직책 문자열 길이'
from titles
where instr(title, ' ');

# [문제 6] 부서명, 부서번호, 부서 총 (현재) 직원수 조회
select dept_name as '부서명', dept.dept_no as '부서번호', count(emp_no) as '부서 총 직원수'
from departments dt, dept_emp dept
where dt.dept_no = dept.dept_no and dept.to_date like '9999-01-01'
group by dept.dept_no;

# [문제 7] 현재 연봉이 전체 현재 평균 연봉 보다 많이 받는 직원들의 사원 번호, 현재 연봉 조회
select emp_no, salary 
from salaries
where salary > (select avg(salary) from salaries) and to_date like '9999-01-01';

# [문제 8] 1960년 이후 태어난 사원들의 사원 번호, 부서 번호 조회 
select em.emp_no, dept_no
from employees as em, dept_emp as dept
where em.emp_no = dept.emp_no and birth_date >= '1960-01-01';

