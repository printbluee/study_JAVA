/* 
[SQL]
# DDL : create(생성), alter(변경), drop(삭제)
# DML : select(조회), update(수정), insert(추가), delete(삭제)
# DCL : grant(부여), revoke(회수), commit(완료), rollback(취소)


[insert] row 추가
[문법 1] 컬럼명 지정
insert into 테이블명(컬럼명1, 컬럼명2) valuse(값1, 값2);

[문법 2] 컬럼명 생략 : 모든 컬럼
insert into 테이블명 valuse(값1, 값2);

[문법 3] 서브쿼리 
# as 사용 x
insert into 테이블명(컬럼명1, 컬럼명2) 
select 컬럼명1, 컬럼명2
from 테이블명;

[문법 4] 한번에 여러 row 추가, 권장 x
insert into 테이블명(컬럼명1, 컬럼명2) 
valuse(값1, 값2), (값3, 값4), (값5, 값6); # 3개의 row 추가
*/

# 테이블 목록
show tables;

# t1 테이블 데이터 조회
select * from t1;
desc t1;

# t1 테이블 삭제
drop table t1;

# 테이블 목록 : t1 없음
show tables;

# t1 테이블 생성
create table t1(
	co1 int,
    co2 varchar(10),
    co3 float
);

show tables;
desc t1;


# 1
# [row 추가] 컬럼명 모두 표시
# [문법] insert into 테이블명(컬럼명1, 컬럼명2) valuse(값1, 값2);
insert into t1(co1, co2, co3) values(1, '하나', 1.1);
insert into t1(co3, co1, co2) values(2.2, 2, '둘');

# 2 
# [row 추가] 컬럼명 모두 생략 -> 모든 컬럼
# [문법] insert into 테이블명 valuse(값1, 값2);
insert into t1 values(3, '셋', 3.3);
insert into t1 values(4, '넷'); # Error Code: 1136. Column count doesn't match value count at row 1

# 3
# [row 추가] 일부 컬럼명 표시
insert into t1(co1, co2) values(5, '다섯');
insert into t1(co1, co2) values(5, '다섯', 5.5); # Error Code: 1136. Column count doesn't match value count at row 1

# 4
# [자료형] 확인
# co2 컬럼 자료형 varchar : 숫자 데이터 입력 ? -> 자동 형변환
# 넣어준 값은 정수지만, t1 에 추가될 땐 type 에 맞춰서 들어옴
insert into t1 values(6, 600, 6.6); 

# co1 컬럼 자료형 int : 문자 데이터 입력 ? -> 자동 형변환
# 넣어준 값은 문자열이지만, t1 에 추가될 땐 type 에 맞춰서 들어옴
insert into t1 values('7', '700', '7.7');

# Error Code: 1366. Incorrect integer value: '팔' for column 'co1' at row 1
insert into t1 values('팔', '팔', '8.8');

# co3 컬럼 자료형 float : 정수값 넣기 -> 자동 형변환
insert into t1 values(9, 9, 9);

# t1 테이블 데이터 조회
select * from t1;


# [서브쿼리를 이용한 row 추가]
# [문법 3] insert into 테이블명(컬럼명1, 컬럼명2) select 컬럼명1, 컬럼명2 from 테이블명;

# 테이블 목록 조회 및 temp1 테이블 데이터 조회
show tables;
select * from temp1;

# 1. 테이블 구조(key 포함) 복사
# temp1 테이블 복사한 copy_temp1 테이블 생성
create table copy_temp1 like temp1;

# 2. 테이블 목록 확인
show tables like 'copy%';

# 3. copy_temp1 테이블 구조 확인
desc copy_temp1;

# 4. copy_temp1 테이블 데이터 조회 : 데이터 없음 !
select * from copy_temp1;

# 5. temp1 테이블 조회 : 5 rows
select * from temp1;  

# 6. copy_temp1 에 row 추가 : temp1 row 추가
insert into copy_temp1 
select * from temp1;

# 7. copy_temp1 테이블 데이터 조회 : 5 rows 복붙 !
select * from copy_temp1;



# [문법 4] 한번에 여러 row 추가, 권장 x
select * from t1;

# 3 rows 추가
# 3 row(s) affected Records: 3  Duplicates: 0  Warnings: 0
insert into t1 
values
(10, 10, 10),
(11, 11, 11),
(12, 12, 12);

select * from t1;
