/*
[SQL] =================================================================
DDL : create(생성), alter(변경), drop(삭제), truncate(모든 row 삭제)
DML : select(조회), update(수정), delete(삭제), insert(추가)
DCL : grant(부여), revoke(회수), commit(완료), rollback(취소, 복구)
=======================================================================

[DDL] truncate ========================================================
: 모든 로우 삭제
: rollback 안 됨 (복구 안됨) <-> delete
=======================================================================
delete는 ram에서 먼저 작업이 이뤄지기 때문에 rollback이 가능하나, truncate는 불가
*/

show tables;

# copy_employees 테이블 삭제
drop table copy_employees;

# copy_titles 데이터 조회
select * from copy_titles;

# truncate로 모든 row 삭제
truncate copy_titles;

# 작업 취소
rollback;

show tables;