/* 
[정렬] order by
order by 컬럼명 asc, 컬럼명 desc

[ SELECT ]
select 컬럼명
from 테이블명
where 조건
order by 컬럼명 asc, 컬럼명 desc;

쓰는 이유 : 데이터를 출력할 때 개발자가 보기 편하게 하기 위해서 
*/ 

# 연봉을 오름차순, 업무 시작일을 내림차순으로 하여
# 사번, 연봉, 업무 시작일 조회
select emp_no, salary, from_date
from salaries
order by salary asc, from_date desc;

# 직책을 오름차순, 업무 시작일을 내림차순으로 하여
# 사번, 직책, 업무 시작일 조회
select emp_no, title, from_date
from titles
order by title asc, from_date desc;

# 컬럼 인덱스 확인 !
select emp_no, title, from_date
from titles
order by 2 asc, 3 desc;
order by 2 asc, 3 desc;