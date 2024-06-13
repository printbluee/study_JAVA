/* 
[SQL]
# DDL : create(생성), alter(변경), drop(삭제)
# DML : select(조회), update(수정), insert(추가), delete(삭제)
# DCL : grant(부여), revoke(회수), commit(완료), rollback(취소)


[문법] drop(변경)
drop table 테이블명;
drop database DB명;
*/

# t2 테이블 삭제
drop table t2;

# 테이블 목록 
show tables;
show tables like 't2';

# temp2 테이블 삭제
# Error Code: 3730. Cannot drop table 'temp2' referenced by a foreign key constraint 'temp6_ibfk_1' on table 'temp6'.
drop table temp2; # 외래키를 의해 참조 되고 있기 때문에 삭제 x
