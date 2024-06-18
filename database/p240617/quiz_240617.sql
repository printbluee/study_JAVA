# [DB 선택] 
use test;

select * from customer;
select * from order_list;

# [합집합] : 모든 로우 조회
select *
from customer c left join order_list o on c.id = o.id
union
select *
from customer c right join order_list o on c.id = o.id;

# [합집합 - 교집합] : 조인에 참여하지 않은 모든 로우 조회
select *
from customer c left join order_list o on c.id = o.id
where o.id is null
union
select *
from customer c right join order_list o on c.id = o.id
where c.id is null;

# ========================================================================
# [view]
# 사번, 부서번호, 부서의 매니저 사번이 조회되는 v_dept_emp_manager 뷰 생성
# 1. DB 선택
use employees;
show tables;

# 2-1. dept_manager 테이블 : 현재 부서 담당 매니저 사번 정보 조회
select dept_no, emp_no
from dept_manager
where to_date like '9999-01-01';

# 2-2. dept_emp 테이블 : 현재 근무 중인 사원들의 사번과 담당 부서번호
select emp_no, dept_no 
from dept_emp
where to_date like '9999-01-01';

# 3. dept_manager 와 dept_emp join
select de.emp_no '사번', de.dept_no '부서명', dm.emp_no '부서 매니저'
from dept_emp de inner join dept_manager dm on de.dept_no = dm.dept_no
where de.to_date like '9999-01-01' and dm.to_date like '9999-01-01';

# 4. test DB 선택
use test;
show tables;

# 5. v_dept_emp_manager view 생성
create view v_dept_emp_manager
as
select de.emp_no as emp_no, de.dept_no as dept_no, dm.emp_no as d_emp_no
from employees.dept_emp de inner join employees.dept_manager dm on de.dept_no = dm.dept_no
where de.to_date like '9999-01-01' and dm.to_date like '9999-01-01';

# 5-1. v_dept_emp_manager 데이터 조회
select * from v_dept_emp_manager
order by emp_no asc;
