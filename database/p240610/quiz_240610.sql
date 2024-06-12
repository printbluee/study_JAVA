# DB 선택
use employees;

# [문제] 공백이 있는 부서명 조회
# where 절에 함수 사용하는 걸 권장 x
# 가공한 컬럼/데이터
select dept_name, instr(dept_name, ' ')
from departments
where instr(dept_name, ' ') > 0;

# like 연산자로 와일드 카드 사용
# 가공하지 않은 컬럼/데이터
select dept_name, instr(dept_name, ' ')
from departments
where dept_name like '% %';

# [과제 1] 남자 사원의 수
# <방법 1> 깔끔 ! 권장 !
select count(emp_no) as '남자 사원 수'
from employees
where gender like 'M';

# <방법 2> 그룹화하기
select gender, count(*) as '남자 사원 수'
from employees
group by gender
having gender like 'M';

# [과제 2] d005 부서의 현재 근무하고 있는 사원 수
select count(emp_no) as 'd005 부서의 사원 수'
from dept_emp
where dept_no like 'd005' and to_date like '9999-01-01';

# [과제 3] 부서별 현재 재직자 수
# having 으로 to_date 줄 수 없음, 그룹화한 데이터 값이 아니기 때문 !
select dept_no as '부서', count(emp_no) as '재직자 수'
from dept_emp
where to_date = '9999-01-01'
group by dept_no;

# [과제 4] 각 부서의 과거 매니저 수
select dept_no as '부서', count(emp_no) as '과거 매니저 수' 
from dept_manager
where to_date <> '9999-01-01' # <  도 가능
group by dept_no;

# [과제 5] 직책에 공백이 있는 데이터의 길이를 구하시오.
# 단, 중복을 제거하여 하나의 데이터만 조회
# <방법 1>
select distinct title as '직책', length(title) as '직책 문자열 길이'
from titles
where instr(title, ' ');

# <방법 2>
select title, length(title) as '직책 문자열 길이'
from titles
group by title
having title like '% %';

# [과제 6] 부서명, 부서번호, 부서 총 (현재) 직원수 조회
select dept_name as '부서명', dept.dept_no as '부서번호', count(emp_no) as '부서 총 직원수'
from departments dt, dept_emp dept
where dt.dept_no = dept.dept_no and dept.to_date = '9999-01-01'
group by dt.dept_no;

# [과제 7] 현재 연봉이 전체 현재 평균 연봉 보다 많이 받는 직원들의 사원 번호, 현재 연봉 조회
# 1) 전체 직원 연봉 평균(현재 연봉)
select avg(salary) 
from salaries 
where to_date like '9999-01-01';

# 2) 사번, 현재 연봉 조회
select emp_no, salary
from salaries
where to_date = '9999-01-01';

# 3) 최종
select emp_no, salary
from salaries
where to_date like '9999-01-01' 
	and salary > (select avg(salary) from salaries where to_date like '9999-01-01');

# [과제 8] 1960년 이후 태어난 사원들의 사원 번호, 부서 번호 조회 
# 1) 1960년 이후 태어난 사원들의 사원 번호
select emp_no
from employees
where birth_date > '1960-01-01';

# 2) 사원 번호, 부서 번호 조회 
select emp_no, dept_no
from dept_emp;

# 0611(과제)
# 3-1) 인라인 뷰
select de.emp_no, de.dept_no
from dept_emp de, 
	(select emp_no from employees where birth_date >= '1960-01-01') as em
where de.emp_no = em.emp_no; # 조인 조건

# year 함수를 써서 가공됨 -> 모든 데이터에 적용하느라 시간이 걸림, 비추
select de.emp_no, de.dept_no
from dept_emp de, 
	(select emp_no from employees where year(birth_date) >= 1960) as em
where de.emp_no = em.emp_no; # 조인 조건

# 3-2) 중첩 서브쿼리
select emp_no, dept_no
from dept_emp
where emp_no in (select emp_no from employees where birth_date >= '1960-01-01');

select em.emp_no, dept_no
from employees em, dept_emp dp
where em.emp_no = dp.emp_no and birth_date > '1960-01-01';
