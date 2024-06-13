/* 
[SQL]
# DDL : create(생성), alter(변경), drop(삭제), truncate(모든 row 삭제) 추가 !
# DML : select(조회), update(수정), insert(추가), delete(삭제)
# DCL : grant(부여), revoke(회수), commit(완료), rollback(취소)


[delete] 삭제
: rollback(복구) 가능
[문법]
delete from 테이블명;
where 조건;

delete 와 truncate 차이점
: rollback 가능 여부
: 복구 여부에 따라 DB 설계

[조회]
select 컬럼명
from 테이블명
where 조건;

[수정]
update 테이블명
set 컬럼명 = 값
where 조건;

[추가]
# 다른 기능들은 where 절이 있는데 추가는 없음
# 이유 : 테이블에 없던 값을 추가하는 거니까 조건이 필요 x
insert into 테이블명
values (값);

[삭제]
delete from 테이블명
where 조건;






*/

# 현재 선택된(작업 중인) DB
select database();

# 테이블 목록
show tables;

# [변경 전] copy_departments 테이블 데이터 조회
desc copy_departments;
select * from copy_departments; # row 9개

# dept_no 가 d009 인 row 삭제
# row 8개
delete from copy_departments
where dept_no like 'd009';

# [delete] where 절 없음
# 모든 row 삭제
delete from copy_departments; 

# [변경 후] copy_departments 테이블 데이터 조회
select * from copy_departments; 









