# DB 선택
use myDB;
commit;

# 테이블 조회
select * from emp;
select * from dept;

# 테이블 구조 확인
desc emp;
desc dept;

# 로우
insert into emp values(1, '홍길동', '서울 강남구');

insert into dept values('d001', '홍보부', 1);
insert into dept values('d002', '개발부', 2); # error ! 외래키 제약조건 위배
insert into dept(did, dname) values('d003', '기획실');

# 테이블 조회
select * from emp;
select * from dept;

# =======================================================================
# 테이블 조회
select * from emp_copy1;
select * from dept_copy1;

# 테이블 구조 확인
desc emp_copy1;
desc dept_copy1;

# 로우
insert into emp_copy1 values(1, '홍길동', '서울 강남구');

insert into dept_copy1 values('d001', '홍보부', 1);
insert into dept_copy1 values('d002', '개발부', 2); # error ! 외래키 제약조건 위배
insert into dept_copy1(did, dname) values('d003', '기획실'); # Error Code: 1364. Field 'emp_copy1_emp_no' doesn't have a default value
