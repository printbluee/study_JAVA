/*
[SQL] =================================================================
DDL : create(생성), alter(변경), drop(삭제), truncate(모든 row 삭제)
DML : select(조회), update(수정), delete(삭제), insert(추가)
DCL : grant(부여), revoke(회수), commit(완료), rollback(취소, 복구)
=======================================================================

DDL : 즉시 commit

[commit & rollback]
★ commit 과 rollback 은 논리적인 작업의 단위 (트랜잭션, transaction) 와 관련 있음
# commit : 작업 완료
DML ram 에서 작업이 된다 !
ram 에서 이루어졌던 작업을 commit 완료했다 라고 생각하면 됨
하드 디스크, ram 에서 작업한 것을 반영하겠다 -> 작업 내림 

논리적인 작업의 단위 (트랜잭션, transaction)
ex) 출금 시스템
출금을 하기 위해 단계를 걸침(카드 투입 -> 출금 선택 -> 금액 선택 ...)
첫 단계부터 끝 단계까지 수행이 되어야 하는데 
중간에 멈춘다면 처음 상태로 돌아감 -> 원자성


*/
# DB 선택
use test;
show tables;
select * from t1;

# << 첫 번째 시나리오 >> ==========================
# 1) t1 테이블을 복사한 copy_t1 테이블 생성
# 2) [copy_t1] 로우 삭제 :co2 가 two 인 로우 삭제
# 3) [copy_t1] 작업 취소 : rollback
# 4) [copy_t1] 조회
# ================================================== 

# 1) t1 테이블을 복사한 copy_t1 테이블 생성
create table copy_t1
as 
select * from t1;

show tables;

select * from copy_t1;

# 2) [copy_t1] 로우 삭제 :co2 가 two 인 로우 삭제
delete from copy_t1
where co2 like 'two';

select * from copy_t1; # 삭제 완료 

# 3) [copy_t1] 작업 취소 : rollback
rollback; # 0 row(s) affected

# 4) [copy_t1] 조회
# -> rollback 안됨
# -> 원인 : MySQL 설정 auto commit
# -> MySQL auto commit 해제 : 
#    SQL Editor - Preferences - SQL Exrcution - [체크] New connetions use auti coomit mode
# -> 설정 변경 후, 재연결
select * from copy_t1;


# << 두 번째 시나리오 >> ===========================
# 1) [copy_t1] delete 작업 : 테이블 모든 로우 삭제
# 2) [copy_t1] rollback    : 데이터 복구
# ================================================== 

# [변경 전] copy_t1 테이블 데이터 조회
select * from copy_t1; # row 9개
 
# 1) [copy_t1] delete 작업 : 테이블 모든 로우 삭제
delete from copy_t1;

# [delete 후] copy_t1 테이블 데이터 조회
select * from copy_t1; # row 0개

# 2) [copy_t1] rollback    : 데이터 복구
rollback;

# [rollback 후] copy_t1 테이블 데이터 조회
select * from copy_t1; # row 9개

/* 
조회 - select
변경 - insert / update / delete
변경 작업 전 이루어지는 것은 조회 작업

rollback 이 이루어지는 시점은 ?
: 마지막 commit 이후에 시작이 되는 시점
: 워크벤치가 실행되는 시점
*/

# << 세 번째 시나리오 >> ===========================
# 1) [copy_t1] delete	: 모든 로우 삭제
# 2) [copy_t1] insert 	: 로우 2개 추가
# 3) [copy_t1] update 	: 로우 1개 수정
# 4) [copy_t1] rollback : 이전 상태
# ================================================== 

# copy_t1 테이블 데이터 조회 : 9 rows
select * from copy_t1;

# 1) [copy_t1] delete	: 모든 로우 삭제
delete from  copy_t1;

# [delete 후] copy_t1 테이블 데이터 조회 : 0 row
select * from copy_t1;
desc copy_t1;

# 2) [copy_t1] insert : 로우 2개 추가
insert into copy_t1
values
(100, '백', 0.1),
(200, '이백', 0.2);

# [insert 후] copy_t1 테이블 데이터 조회 : 2 row
select * from copy_t1;

# 3) [copy_t1] update : 로우 1개 수정
update copy_t1
set co3 = 200.2
where co1 = 200;

# [update 후] copy_t1 테이블 데이터 조회 : 2 row
select * from copy_t1;

# 4) [copy_t1] rollback : 이전 상태
rollback;

# [rollback 후] copy_t1 테이블 데이터 조회 : 9 row
select * from copy_t1;


# << 네 번째 시나리오 >> ===========================
# 1) [copy_t1 ] delete	: 모든 로우 삭제
# 2) [ commit ] 작업 완료
# 3) [copy_t1 ] insert 	: 로우 2개 추가
# 4) [copy_t1 ] update 	: 로우 1개 수정
# 5) [rollback] 작업 취소
# ================================================== 

# copy_t1 테이블 데이터 조회 : 9 rows
select * from copy_t1;

# 1) [copy_t1] delete : 모든 로우 삭제
delete from  copy_t1;

# [delete 후] copy_t1 테이블 데이터 조회 : 0 row
select * from copy_t1;
desc copy_t1;

# 2) [ commit ] 작업 완료
commit;

# [commit 후] copy_t1 테이블 데이터 조회 : 2 row
select * from copy_t1;

# 3) [copy_t1] insert : 로우 2개 추가
insert into copy_t1
values
(100, '백', 0.1),
(200, '이백', 0.2);

# [insert 후] copy_t1 테이블 데이터 조회 : 2 row
select * from copy_t1;

# 4) [copy_t1] update : 로우 1개 수정
update copy_t1
set co3 = 200.2
where co1 = 200;

# [update 후] copy_t1 테이블 데이터 조회 : 2 row
select * from copy_t1;

# 5) [copy_t1] rollback : 이전 상태
rollback;

# [rollback 후] copy_t1 테이블 데이터 조회 : 0 row
# 마지막 commit 이후 시점
select * from copy_t1;


# << 다섯 번째 시나리오 >> =========================
# 특정 위치(쿼리) 작업 취소 : savepoint
# savepoint 이름;
# 이렇게 작업할 일 없음

# 1) savepoint 이름1; # rollback 할 위치 지정
# 2) [copy_t1 ] insert : t1 테이블의 모든 로우 copy_t1 테이블에 복사
# 3) savepoint 이름2; # rollback 할 위치 지정
# 4) [copy_t1 ] delete : 로우 1개 삭제
# 5) [rollback] 작업 취소
# ================================================== 

# copy_t1 테이블 데이터 조회 : 0 row
select * from copy_t1;

insert into copy_t1
values(100, 100, 100);

# 1) savepoint 이름1; # rollback 할 위치 지정
# 새로운 작업 시작, 트랜잭션 시작 위치 
# ex) 출금 서비스 이용 중 비밀번호 틀리면 다시 첫 단계로 돌아가는게 아니라 다시 비밀번호 입력
savepoint before_insert;

# 2) [copy_t1 ] insert : t1 테이블의 모든 로우 copy_t1 테이블에 복사
insert into copy_t1
select * from t1;

# [insert 후] copy_t1 테이블 데이터 조회 : 10 row
select * from copy_t1;

# 3) savepoint 이름2; # rollback 할 위치 지정
savepoint before_delete;

# 4) [copy_t1 ] delete : 로우 1개 삭제
delete from copy_t1
where co1 = 2;

# [delete 후] copy_t1 테이블 데이터 조회 : 10 row
select * from copy_t1;

# 5) [rollback] 작업 취소
rollback; # 트랜젝션 시작 지점 : 0 row
rollback to before_delete; # 삭제 이전 지점으로 돌아가기 : 10 rows
rollback to before_insert; # 추가 이전 지점으로 돌아가기 :  0 row

select * from copy_t1; 


# << 여섯 번째 시나리오 >> =========================
# 1) [copy_t1] insert : 로우 추가
# 2) [new_t1 ] create : 테이블 생성
# 3) [copy_t1] delete : 로우 1개 삭제
# 4) [rollback] 작업 취소
# ================================================== 

select * from copy_t1; # 1 row

# 1) [copy_t1] insert : 로우 추가
insert into copy_t1
values
(1, '하나', 1.1),
(2, '둘', 2.2);

# [insert 후] copy_t1 테이블 데이터 조회 : 3 row
select * from copy_t1;

# 2) [new_t1 ] create : 테이블 생성
create table new_t1
select * from t1;

# [create 후] 테이블 조회 : new_t1 생성
show tables;

# 3) [copy_t1] delete : 로우 1개 삭제
delete from copy_t1
where co1 = 100;

# [delete 후] copy_t1 테이블 데이터 조회 : 2 row
select * from copy_t1;

# 4) [rollback] 작업 취소
rollback; # 시점 : insert(DDL) 실행이 되면 즉시 commit

select * from copy_t1;