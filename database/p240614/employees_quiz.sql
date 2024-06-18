#  DB 선택
use employees;
show tables;

# [문제 1] 연봉의 합과 해당 사원 수를 조회하시오.

select '04만 이하' salary_range, count(e.emp_no) '직원수', sum(salary) '연봉합'
from employees e, salaries s
where e.emp_no = s.emp_no and to_date like '9999-01-01' and salary <= 40000
UNION
select '06만 이하' salary_range, count(e.emp_no) '직원수', sum(salary) '연봉합'
from employees e, salaries s
where e.emp_no = s.emp_no and to_date like '9999-01-01' and salary > 40000 and salary <= 60000
union
select '10만 이하' salary_range, count(e.emp_no) '직원수', sum(salary) '연봉합'
from employees e, salaries s
where e.emp_no = s.emp_no and to_date like '9999-01-01' and salary > 60000 and salary <= 100000
union
select '10만 초과' salary_range, count(e.emp_no) '직원수', sum(salary) '연봉합'
from employees e, salaries s
where e.emp_no = s.emp_no and to_date like '9999-01-01' and salary > 100000
union
select null salary_range, count(e.emp_no) '직원수', sum(salary) '연봉합'
from employees e, salaries s
where e.emp_no = s.emp_no and to_date like '9999-01-01';


# [문제 2] 각 부서별 부서 근무 시작 년도 별 사원 수를 조회하시오.

select dept_no, 1990 'year_from_date', count(dept_no)
from dept_emp
where dept_no like 'd%' and from_date < '1990-01-01' 
group by dept_no 
union
select dept_no, 2000 'year_from_date', count(dept_no)
from dept_emp
where dept_no like 'd%' and from_date < '2000-01-01' and from_date >= '1990-01-01' 
group by dept_no
union
select dept_no, 9999 'year_from_date', count(dept_no)
from dept_emp
where dept_no like 'd%' and from_date < '9999-01-01' and from_date >= '2000-01-01'
group by dept_no 
union
select dept_no, null 'year_from_date', count(dept_no)
from dept_emp
where dept_no like 'd%' and from_date < '9999-01-01'
group by dept_no
order by dept_no, year_from_date is null asc;