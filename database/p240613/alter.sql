/* 
[SQL]
# DDL : create(생성), alter(변경), drop(삭제)
# DML : select(조회), update(수정), insert(추가), delete(삭제)
# DCL : grant(부여), revoke(회수), commit(완료), rollback(취소)


[문법] alter(변경)
alter table 테이블명 modify 컬럼명 자료형;              # 데이터 DB 구조를 잘못 짤 경우라 잘 안씀
alter table 테이블명 change 기존컬럼명 새컬럼명 자료형	
alter table 테이블명 add    컬럼명 자료형;
alter table 테이블명 drop 	컬럼명;

alter table 테이블명 rename 새테이블명;
rename table 기존_테이블명 to 새_테이블명;

이 외에도 많음
*/

# DB 선택
use test;

# [변경 전] t2 테이블 구조 확인 및 데이터 조회
desc t2;
select * from t2;

# 1
# [컬럼 자료형 변경] t2 테이블의 co1 컬럼 자료형을 char(10)로 변경
# [문법] alter table 테이블명 modify 컬럼명 자료형;
alter table t2 modify co1 char(10); 

# 2
# t2 테이블의 co2 컬럼명을 num 으로 변경
# [문법] alter table 테이블명 change 기존컬럼명 새컬럼명 자료형	
# 자료형 안넣음 Error Code: 1064. You have an error in your SQL syntax; 
alter table t2 change co2 num float(5, 2); # 경고문 ! 버전업 되면서 float 자리수 표시 x

# 3
# [컬럼명 변경/타입 변경] t2 테이블의 co3 컬럼명 num3 변경, 타입 : float -> int
# [문법] alter table 테이블명 change 기존컬럼명 새컬럼명 자료형	
# 컬럼명을 바꾸면서 type 를 변경했는데 데이터도 변경됨
alter table t2 change co3 num3 int;

# 4
# [컬럼 추가]t2 테이블에 자료형 int 인 co7 컬럼 추가
# [문법] alter table 테이블명 add 컬럼명 자료형;
# 데이터 값은 null 로 들어옴
alter table t2 add co7 int; 

# 5
# [컬럼 추가/기본값 설정] t2 테이블에 자료형 int 인 co8 컬럼 추가(기본값 0)
# [문법] alter table 테이블명 add 컬럼명 자료형;
# DB 설계에서 꼼꼼하게 했기 때문에 이렇게 추가할 일은 x
alter table t2 add co8 int default 0 not null;

# 6
# [컬럼 삭제] t2 테이블에 co4 컬럼 삭제
# [문법] alter table 테이블명 drop 컬럼명;
alter table t2 drop co4;

# 7
# [테이블명 변경] t2 테이블명을 copy_t2 로 변경
# [문법] alter table 테이블명 rename 새테이블명;
alter table t2 rename copy_t2;

# 8
# [테이블명 변경] copy_t2 를 다시 t2 로 변경
# [문법] rename table 기존_테이블명 to 새_테이블명;
rename table copy_t2 to t2;

# [변경 후] t2 테이블 구조 확인 및 데이터 조회
desc t2; 
desc copy_t2;
select * from copy_t2;







