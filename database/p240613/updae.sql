/* 
[SQL]
# DDL : create(생성), alter(변경), drop(삭제)
# DML : select(조회), update(수정), insert(추가), delete(삭제)
# DCL : grant(부여), revoke(회수), commit(완료), rollback(취소)


[update] 수정
[문법]
update 테이블명
set 컬럼명 = 변경할 값
where 조건; # 옵션
* set   의 '=' : 대입
* where 의 '=' : 비교
-> 해당하는 테이블명을 찾아가서 where 절에 있는 조건을 보고 값 변경
-> 특정한 row 를 조건을 걸지 않았다면(where절 x) 전체 row 변경 
*/

# DB 선택
use test;

# [변경 전] t1 테이블 데이터 조회
select * from t1;

# co1 컬럼의 값이 3 인 row의 co2 컬럼의 값을 '삼' 으로 변경
# 업데이트할 t1 테이블로 찾아가 co1 컬럼의 값이 3 인 row co2 를 찾아가 '삼' 으로 값 변경
# Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column.  To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.
# MySQL 워크벤치에서 error : 다운 받을 때 공부용? 으로 다운 받아서 그럼
# cmd 에서는 실행이 됨
# Edit - SQL Editor - Other - [체크] Safe Update -> [체크해제] Safe Update
update t1
set co2 = '삼삼'
where co1 = 3;

# [문제] co1 컬럼의 값이 7인 row 의 co3 컬럼의 값을 null 로 변경
update t1
set co3 = null
where co1 = 7;

# [문제] co1 의 값이 9 ~ 12인 row 의 co3 를 0.1 로 변경
# in 연산자보다는 between 연산자 사용하는 것이 좋음
update t1
set co3 = 0.1
where co1 between 9 and 12;

# [문제] co1 의 값이 2인 row 의 co2 를 two, co3 를 0.2 로 변경
update t1
set co2 = 'two', co3 = 0.2
where co1 = 2;

# [where 절이 없는 경우]
update t1
set co3 = 0.9;

# [변경 후] t1 테이블 데이터 조회
select * from t1;












