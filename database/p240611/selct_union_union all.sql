# 수직 조인
# 합집합 : union - 중복 제거, union all - 중복 모두 표시

# 24 rows
select dept_no, emp_no
from dept_manager;

# 9 rows
select dept_no, dept_name
from departments;

# union
select dept_no, emp_no
from dept_manager
union
select dept_no, dept_name
from departments;

select dept_no
from dept_manager
union
select dept_no
from departments;

# 테이블 구조로 type 확인하기
desc dept_emp; 	
desc departments;

# union all
# DBMS 에서 중복이란 row 가 똑같은 데이터가 들어간 row 여야 함
select dept_no, emp_no
from dept_manager
union all
select dept_no, dept_name
from departments;

select dept_no
from dept_manager
union all
select dept_no
from departments;