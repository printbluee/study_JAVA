#  DB 선택
use employees;
show tables;

# [문제 1] 연봉의 합과 해당 사원 수를 조회하시오.
select * from copy_salaries; # 2844047

# 04만 이하



# 총 직원수 : 240124
select e.emp_no, sum(salary) 
from employees.employees e, employees.salaries s
where e.emp_no = s.emp_no and to_date like '9999-01-01'
group by e.emp_no;

# 총 연봉 합 : 17291866123
select sum(salary) 
from employees.employees e, employees.salaries s
where e.emp_no = s.emp_no and to_date like '9999-01-01';







/* create table salary_rage(
	salary_rage varchar(15),
    sum_emp int,
    sum_salary int
);*/

# insert into salary_rage values('04만 이하', .... )









