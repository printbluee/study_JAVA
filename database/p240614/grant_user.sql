/*
[사용자 추가]
create user 'id'@'ip(host)'
create user '아이디'@'localhost' identified by '비밀번호'; # 내부 접근
create user '아이디'@'%' identified by '비밀번호'; 		   # 외부 접근

[사용자 삭제]
* 유저 관리를 할 땐 insert/delete 삭제하면 안됨 !!!!
drop user '아이디'@'localhost';
drop user '아이디'@'%';

[권한 부여] grant =======================================================
[문법]
grant 권한 on DB명.테이블명 to '유저명'@'아이피&호스트&와이들카드(%)';

권한 ex) select ...

<< 모든 권한 부여 >>
grant all privileges on *.* to '유저명'@'아이피&호스트&와이들카드(%)';

<< 특정 DB의 특정 테이블을 조회 권한 부여 >>
ex) kim 사용자에게 employees DB 의 salaries 테이블 조회 권한 부여
grant select on employees.salaries to 'kim'@'아이피&호스트&와이들카드(%)';

[권한 부여] grant =======================================================
[문법]
revoke 권한 DB명.테이블명 from '유저명'@'아이피&호스트&와이들카드(%)';

<< 모든 권한 회수 >>
revoke all privileges on *.* to '유저명'@'아이피&호스트&와이들카드(%)';

<< 특정 DB의 특정 테이블을 조회 권한 회수 >>
ex) kim 사용자에게 employees DB 의 salaries 테이블 조회 권한 회수
revoke select on employees.salaries from 'kim'@'아이피&호스트&와이들카드(%)';
*/

# DB 목록
show databases;
show databases like 'mysql';

# mysql DB 선택
use mysql;

# mysql 테이블 목록
show tables;

# user 테이블 구조
desc user;

# user 테이블 조회
select * from user;

# 사용자 추가 ================================================================
# 1
# 내부 접근이 허용된 kim 사용자 생성(추가), 비밀번호 1111
create user 'kim'@'localhost' identified by '1111';

# [사용자 추가 후] user 테이블 조회 : kim 추가 
# cmd 창에서 로그인 가능해짐
select host, user from user;

# 2
# 외부 접근이 허용된 kim 사용자 생성(추가), 비밀번호 1111
create user 'kim'@'%' identified by '1111';

# [사용자 추가 후] user 테이블 조회 : kim 추가 
# 'kim'@'localhost' 과 'kim'@'%' 은 아이피가 달라서 다르게 인식
select host, user from user;

# 사용자 삭제 ================================================================
drop user 'kim'@'%';

# [사용자 삭제 후] user 테이블 조회 : 'kim'@'%' 삭제 
select host, user from user;

# cmd 창에서 작업함
# 권한 보기
show grants;

# test DB 선택
use test;

# 테이블 목록
show tables;

# temp1 테이블 
select * from temp1;

# [권한 부여] =================================================
# 사용자 kim 에게 test DB 의 temp1 테이블 조회 권한 부여
grant select on test.temp1 to 'kim'@'localhost';

# 권한 확인
show grants; # 현재 사용자(root) 의 권한
show grants for 'kim'@'localhost';

# 현재 사용자 확인 : root
select user();

# test DB 의 테이블 목록
show tables;

# [권한 부여] =================================================
# 사용자 kim 에게 test DB 의 temp1 테이블에 수정 권한 부여
grant insert on test.temp1 to 'kim'@'localhost';

# 사용자 kim 권한 확인
# Error Code: 1141. There is no such grant defined for user 'kim' on host '%'
# @ 를 생략하면 % 로 됨, 아이피 지정해주기
show grants for 'kim'; 
show grants for 'kim'@'localhost';

# temp1 데이터 조회
select * from temp1; # cmd 에서 추가한 데이터 반영됨

# [권한 부여] =================================================
# 사용자 kim 에게 test DB 의 temp1 테이블에 수정,삭제 권한 부여
grant update, delete on test.temp1 to 'kim'@'localhost';

# 부여한 권한 확인
show grants for 'kim'@'localhost';

# [권한 회수] =================================================
# 사용자 kim 에게 test DB 의 temp1 테이블에 삭제 권한 회수
revoke delete on tsest.temp1 from 'kim'@'localhost';

# 사용자 kim 의 권한
show grants for kim@localhost;

# 사용자 kim 에게 test DB 의 temp1 테이블의 모든 권한 회수
revoke all privileges on test.temp1 from 'kim'@'localhost';

show grants for 'kim'@'localhost';


# [문제]
# 1. 내부 접근이 허용된 사용자 cho 생성 -----------------------------------
create user 'cho'@'localhost' identified by '1111';

-- 사용자 cho 생성 여부 확인
use mysql;
select host, user from user;

-- 사용자 cho 권한 확인
show grants for 'cho'@'localhost';

# 2. cmd 에서 사용자 cho 로 접속 --> DB 목록 ------------------------------
-- [cmd] 권한 확인
/*
C:\Users\hi>mysql -u cho -p
Enter password: ****
mysql> show grants;
+-----------------------------------------+
| Grants for cho@localhost                |
+-----------------------------------------+
| GRANT USAGE ON *.* TO `cho`@`localhost` |
+-----------------------------------------+
1 row in set (0.00 sec)
*/

# 3. 사용자 cho 에게 test DB 의 모든 테이블을 조회할 수 있는 권한 부여 -----
grant select on test.* to 'cho'@'localhost';

-- [cmd] 권한 확인
/*
mysql> show grants;
+-----------------------------------------------+
| Grants for cho@localhost                      |
+-----------------------------------------------+
| GRANT USAGE ON *.* TO `cho`@`localhost`       |
| GRANT SELECT ON `test`.* TO `cho`@`localhost` |
+-----------------------------------------------+
2 rows in set (0.00 sec)
*/

# 4. [cmd] copy_t1 데이터 조회 ---------------------------------------------
/*
mysql> use test;
Database changed
mysql> select * from copy_t1;
+------+------+------+
| co1  | co2  | co3  |
+------+------+------+
|  100 | 100  |  100 |
|    1 | 하나 |  1.1 |
|    2 | 둘   |  2.2 |
+------+------+------+
3 rows in set (0.00 sec)
*/

# 5. [cmd] copy_t1 로우 1개 추가 (내용 내 맘대로) --------------------------
# ERROR 1142 (42000): INSERT command denied to user 'cho'@'localhost' for table 'copuy_t1'

# 6. 사용자 cho 에게 test DB 의 copy_t1 테이블에 로우 추가 권한 부여 -------
grant insert on test.copy_t1 to 'cho'@'localhost';

# 7. [cmd] copy_t1 로우 1개 추가 -------------------------------------------
/*
mysql> insert into copy_t1 values(622, '622', 6.2);
Query OK, 1 row affected (0.00 sec)

mysql>  select * from copy_t1;
+------+------+------+
| co1  | co2  | co3  |
+------+------+------+
|  100 | 100  |  100 |
|    1 | 하나 |  1.1 |
|    2 | 둘   |  2.2 |
|  622 | 622  |  6.2 |
+------+------+------+
4 rows in set (0.00 sec)
*/

# 8. 사용자 cho 에게 부여된 모든 권한 회수 ---------------------------------
revoke all privileges on *.* from 'cho'@'localhost';
-- [cmd] 권한 확인
/*
+-----------------------------------------+
| Grants for cho@localhost                |
+-----------------------------------------+
| GRANT USAGE ON *.* TO `cho`@`localhost` |
+-----------------------------------------+
1 row in set (0.00 sec)
*/

# 9. 사용자 cho 삭제 -------------------------------------------------------
drop user 'cho'@'localhost';
/*
C:\Users\hi>mysql -u cho -p
Enter password: ****
ERROR 1045 (28000): Access denied for user 'cho'@'localhost' (using password: YES)
*/


# ===========================================================================
# 암호 변경 전 유저 정보 확인
select host, user, authentication_string, password_last_changed
from mysql.user;
/*
localhost	cho	*89C6B530AA78695E257E55D63C00A6EC9AD3E977	2024-06-14 16:09:37
*/

# 암호 변경
alter user 'cho'@'localhost' identified by '0000';

# 암호 변경 후 유저 정보 확인
select host, user, authentication_string, password_last_changed
from mysql.user;
/*
localhost	cho	*97E7471D816A37E38510728AEA47440F9C6E2585	2024-06-14 16:10:01
*/