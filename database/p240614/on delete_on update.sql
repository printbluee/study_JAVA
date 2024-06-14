/*
이 파일 혼자 실행하면서 보기 ...
[참조 설정]
참조되는 테이블 = 부모
* ON DELETE : 참조되는 테이블의 값이 삭제될 경우 동작 구분
* ON UPDATE : 참조되는 테이블의 값이 수정될 경우 동작 구분

* CASCADE   : 참조되는 테이블의 데이터를 삭제/수정하면,
			  참조하는 테이블에서 삭제/수정이 같이 이루어짐
* SET NULL  : 참조되는 테이블의 데이터를 삭제/수정하면,
			  참조하는 테이블의 데이터는 NULL 로 설정됨
* NO ACTION : [기본 설정]
			: 참조되는 테이블의 데이터를 삭제/수정하면,
			  참조하는 테이블의 데이터는 변경되지 않음
* RESTRICT  : MySQL 에서는 NO ACTION 과 같음
			: 참조하는 테이블에 데이터가 존재하면
              참조되는 테이블의 데이터는 삭제/수정할 수 없음

ex) A 회원이 글을 작성하고 탈퇴한 경우
CASCADE   : 글 삭제
SET NULL  : 글 NULL
NO ACTION : 글 그대로
RESTRICT  : 댓글이 달렸다면 삭제 되지 않음
*/

# 현재 DB 확인
select database(); # test

# 테이블 삭제
# 1. ON DELETE CASCADE ON UPDATE CASCADE
drop table customer; # Error Code: 3730. Cannot drop table 'customer' referenced by a foreign key constraint 'buy_ibfk_1' on table 'buy'.
drop table buy;
drop table customer;

# 2. on delete set null 여기 못함
drop table customer; 
drop table buy;
drop table customer;

# 3. on delete no action
drop table customer; 
drop table buy;

# 4. on delete RESTRICT


# 테이블 생성
create table customer(
	id int auto_increment not null,
    name char(30) not null,
    mobile char(13) not null,
    primary key(id)
);

create table buy(
	id int,
    price int not null,
    product_name char(50),
    foreign key(id) references customer(id)
    # ON DELETE CASCADE 
    # on delete set null
    # on delete no action
    on delete RESTRICT
	# ON UPDATE CASCADE
);

# 테이블 목록 확인
show tables like 'customer';
show tables like 'buy';

# 구조 확인
desc customer;
desc buy;

# 데이터 추가
insert into customer values(1000, '홍길동', '010-1111-1111');
insert into customer(name, mobile) values('이미자', '010-2222-2222'), ('삼성동', '010-3333-3333');

insert into buy 
values
(1000, 20000, '동원 돈까스'),
(1000, 1000, '머리빗'),
(1002, 990, '구이구이');

# [변경 전] 데이터 조회
select * from customer;
select * from buy;

# [on delete no action]
# Error code : 1451. Cannot delete or update a parent row.
set FOREIGN_KEY_CHECKS = 0;
set FOREIGN_KEY_CHECKS = 1;

# 삼성동 고객님 삭제
delete from customer 
where id = 1002;

# 홍길동 고객님 아이디 변경
update customer
set id = 2000
where id = 1000;

# 이미자 고객님 아이디 변경
update customer
set id = 3000
where id = 1001;

# [변경 후] 데이터 조회
select * from customer;
select * from buy;

