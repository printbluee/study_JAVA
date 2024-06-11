/* 
[서브 쿼리] subquery
* 서브 쿼리 : 쿼리문 내 쿼리문
select 절, from 절, where 절에 들어올 수 있음
들어오는 위치에 따라 구분이 됨

* 스칼라 서브쿼리 (scalar subquery) 
: select 절, 단일행 / 단일컬럼 반환

* 인라인 뷰 (inline view) 	   
: from 절, 반드시 하나의 테이블 반환 

* 중첩 서브쿼리 (nested subquery)   
: where 절, 단일행 or 다중행 반환	  

// 가상의 테이블를 뷰라고 말함, 쿼리가 실행되면서 만들어지는 뷰
*/

# [중첩 서브 쿼리]
# d001 부서에 근무하고 있는 사원들의 사번과 이름 조회
# 1) 사번과 이름 조회
select emp_no, first_name
from employees;

# 2) d001 부서에 근무하는 사원의 사번, 부서번호
select emp_no, dept_no
from dept_emp
where dept_no like 'd005';

# 3) 서브쿼리 작성
select emp_no, first_name
from employees
where emp_no in (select emp_no from dept_emp where dept_no like 'd005');

# cf) 위 서브쿼리를 조인으로 변경
# 웬만하면 기본키에 설정되어 있는 테이블명을 명시하는 것이 좋음
# dept_emp 테이블에는 key 가 2개 즉, 복합키 !
# 속도 처리를 위해 employees 테이블에 있는 emp_no 지정해주기 ~
select em.emp_no, first_name
from employees em , dept_emp dp
where em.emp_no = dp.emp_no  # 조인 조건
	and dept_no like 'd005'; # 조건
    
/*
[인라인 뷰] 
: from 절에 위치한 서브 쿼리
: 테이블의 일부 데이터만 불러와 복합한 쿼리 단순화
: 쿼리 가독성 높이
: 결과는 반드시 하나의 테이블 리턴
: 인라인 뷰는 SQL 문이 실행될 때, 임시적으로 생성되는 동적인 뷰 (Dynamic View)
  <-> 정적인 뷰(Static View)
: 단점 : 액섹스 속도 저하 가능성
   실행이 되는 쿼리문안에 서브쿼리가 또 실행이 되기 때문에 join 을 하거나 값 비교 등등 이유
*/

# 매니저의 사번, 부서 번호, 부서명 조회
# 1) 매니저 사번, 부서번호 조회
select emp_no, dept_no
from dept_manager;

# 2) 부서번호, 부서명 조회
select dept_no, dept_name
from departments;

# 3) 인라인 뷰
# as 붙여줘야 함 !
select emp_no, dm.dept_no
from dept_manager dm, (select dept_no, dept_name from departments ) as d
where dm.dept_no = d.dept_no;

select emp_no, dm.dept_no
from dept_manager dm, (select dept_no, dept_name
						from departments 
                        where dept_no in ('d001', 'd002')) as d
where dm.dept_no = d.dept_no;

# d001 부서에 근무하고 있는 사원들의 사번과 이름 조회 
select em.emp_no, first_name
from employees em, (select emp_no, dept_no from dept_emp where dept_no like 'd001') as dp
where em.emp_no = dp.emp_no; # 조인 조건


/*
[스칼라 서브쿼리] 권장 x
: 반드시 단일 행, 단일 컬럼 반환
*/
# 매니저 사번, 부서번호, 부서명 조회
select dept_no, emp_no, (select dept_name from departments where dept_no = dept_manager.dept_no) as dept_name
from dept_manager;