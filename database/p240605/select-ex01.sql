/* 
[where clause 사용되는 연산자]
* 비교(관계) 연산자
	<  : 작다, 미만
	>  : 크다, 초과
	<= : 작거나 같다, 이하
	>= : 크거나 같다, 이상
	=  : 같다
	<> : 다르다

* 논리 연산자 : and, or, not
* 범위 연산자 : between A and B
* 집합 연산자 : in (값 1, 값 2, ...)
				not in (값 1, 값 2 , ...)
* 문자열 연산자 : like
				  not like
				  와일드 카드 - '%' (모든), '_' (하나)
* null 연산자 : is null			null 과 같다. 	   null 이다. (부등호를 쓰는 것이 아니라 is)
			    is not null		null 과 같지 않다. null이 아니다.
*/

/* [DML] 조작어 : select - 조회, 검색
<< select statement >> select 문
select 필드명 1, 필드명 2		# select clause
from 테이블명							# from clause
where 조건;								# where clause
*/
##################################################################################################
# DB 선택
use employees;

# 테이블 목록
show tables;

# employees 구조 확인
desc employees;

# 전체 직원 정보 중 사원과 이름만 조회
select emp_no, first_name from employees;

# 사번이 10001인 사원 이름 조회
/* select emp_no, first_name from employees
where 컬럼명 연산자 값; */
select emp_no, first_name 
from employees 
where emp_no = 10001;

# [문제 1] d005 부서 매니저의 사원번호, 부서번호 추출하시오.
select emp_no, dept_no from dept_manager
where dept_no = 'd005';

# [문제 2] d003 부서 소속(담당)이 아닌 매니저들의 사원번호, 부서번호 추출하시오. 
# 난 왜 24개지
select emp_no, dept_no from dept_manager
where dept_no <> 'd003';

# [문제 3] 연봉이 150,000 이상인 사원들의 사원번호, 연봉 추출하시오.
select emp_no, salary from salaries
where salary >= 150000;

# [문제 4] 1986년 이후에 입사한 사원의 사원번호, 입사일, 이름 추출하시오.
select emp_no, hire_date, first_name from employees
where hire_date >= '1986-01-01';

# [문제 5] 1990년 이후부터 매니저로 근무하고 있는 
# 사원들의 사원번호, 부서번호, 매니저 시작 날짜 추출하시오.
select emp_no, dept_no, from_date, to_date from dept_manager
where from_date >= '1990-01-01' and to_date = '9999-01-01';

# [문제 6] 1990년 이전 입사한 사원들의 사원번호, 입사일 추출하시오.
select emp_no, hire_date from employees
where hire_date <= '1990-12-31';

##################################################################################################
/* 
[논리 연산자] : and, or, not
and 연산자 
*/
# d001 부서 매니저 중 1990년 이후 매니저인 사원의 사번, 부서번호, 매니저 시작일 조회
select emp_no, dept_no, from_date from dept_manager
where dept_no = 'd001' and from_date >= '1990-01-01';

# sql 에서는 피연산자가 여러 개 올 수 있다 !
select * from employees
where emp_no <= 10100 
	and hire_date >= '1986-01-01'
	and gender = 'F';

# [문제 1] 1990년 이후 입사한 남자 사원의 사원번호, 성별, 입사일 추출
select emp_no, gender, hire_date from employees
where gender = 'M' and hire_date >= '1990-01-01';

# [문제 2] 1990년 이후부터 연봉을 60,000 이상 받는 사원의 사원 번호, 연봉, 연봉 시작일 추출
select emp_no, salary, from_date from salaries
where from_date > '1990-01-01' and salary >= 60000;

# [문제 3] d001 부서와 d002 부서 매니저의 사원번호, 부서번호 추출
# 조건이 같을 때 dept_no = 'd001' or 'd002' 하면 실행이 제대로 안됨
# 연산자 기준으로 실행이 되기 때문에 위 코드처럼 하면 연산자를 제외한 것
select * from dept_manager
where dept_no = 'd001' or dept_no = 'd002';

# [문제 4] 직책이 staff 이거나 engineer 인 사원의 사원번호, 직책 추출
select * from titles
where title = 'staff' or title = 'engineer';

# [문제 5] d003 부서 소속(담당)이 아닌 매니저의 사원번호, 부서번호 추출
select * from dept_manager
where dept_no <> 'd003'; # 논리 연산자

select * from dept_manager
where not dept_no = 'd003';

##################################################################################################
# 범위 연산자 : between A and B
# 연봉이 60,000 이상 70,000 이하인 사원의 사번, 연봉 추출
# <and 연산자>
select emp_no, salary from salaries 
where salary >= 60000 and salary <= 70000;

# <between 연산자>
select emp_no, salary from salaries 
where salary between 60000 and 70000;

# 집합 연산자 : in (값 1, 값 2, ...) / not in (값 1, 값 2 , ...)
# d001 부서와 d002 부서 매니저의 사번, 부서번호 추출
# <or 연산자>
select emp_no, dept_no from dept_manager
where dept_no = 'd001' or dept_no = 'd002';

# <집합 연산자>
select emp_no, dept_no from dept_manager
where dept_no in ('d001', 'd002');  

# d001 부서와 d002 부서가 아닌 매니저의 사번, 부서번호 추출
# <or 연산자>
select emp_no, dept_no from dept_manager
where dept_no <> 'd001' and dept_no <> 'd002';

# <not in 연산자>
select emp_no, dept_no from dept_manager
where dept_no not in ('d001', 'd002');  

##################################################################################################
# 문자열 연산자 : like, not like, 와일드 카드 - '%' (모든, 글자 1개 이상), '_' (하나, 글자 1개)
# 컬럼의 타입이 문자열인 것만 ! 
# <like 연산자>
select * from departments
where dept_name = 'Marketing'; 

select * from departments
where dept_name like 'Marketing';

# R 로 시작하는 부서명
select * from departments
where dept_name like 'R%';

# S 로 끝나는 부서명
select * from departments
where dept_name like '%S';

# S 가 포함된 부서명
select * from departments
where dept_name like '%S%';

# 대/소문자 구분
select * from employees
where binary first_name like '%g%'
	and gender like 'm';

# 이름의 두 번째 글자가 r 인 데이터 추출
select * from employees
where first_name like '_r%';

# [문제 1] 이름이 B 로 시작하는 사원의 사번, 이름 추출
select emp_no, first_name from employees
where first_name like 'B%';

# [문제 2] 이름이 i 로 끝나는 사원의 사번, 이름 추출
select emp_no, first_name from employees
where first_name like '%i';

# [문제 3] 이름의 두 번째 글자가 r 인 사원의 사번, 이름 추출
#          단, 이름 글자 수가 3개인 이름만 
select emp_no, first_name from employees
where first_name like '_r_';

# [문제 4] 이름이 B 로 시작하지 않은 직원의 이름과 사번 추출
select emp_no, first_name from employees
where first_name not like 'B%';


##################################################################################################
# null 연산자 : is null			null 과 같다. 	   null 이다. (부등호를 쓰는 것이 아니라 is)
#			    is not null		null 과 같지 않다. null이 아니다.

# null 허용하는 컬럼들 확인하기
desc employees;
desc dept_manager; 
desc departments;
desc dept_emp;
desc salaries;
desc titles;

# [titles tables]
# emp_no 가 10001인 사원의 to_date 를 null 로 변경
update titles
set to_date = null
where emp_no = 10001; 

# 전체 조회, 10001인 사원의 to_date 를 null 로 변경된 거 확인됨
select * from titles;

# 10001인 사원 제외 모두 출력
select * from titles
where to_date is not null;