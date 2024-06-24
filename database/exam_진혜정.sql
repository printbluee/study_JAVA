## [문항1] movie 데이터베이스를 생성하시오. 문자셋은 utf8mb4로 하시오. [5점]
create database movie character set utf8mb4;


## [문항2] 아래 ERD와 테이블 정보를 참고하여 movie 데이터베이스에 3개의 테이블 생성하시오. [15점]
## - 외래키 : 참조되는 테이블이 수정되면 같이 변경되도록 하시오.
use movie;

# film table
create table film(
	film_id smallint not null auto_increment,
    title varchar(255) not null,
    description text not null,
    release_year year not null,
    production_company varchar(100) not null,
    primary key(film_id)
);
desc film;

# actor table
create table actor(
	actor_id smallint not null auto_increment,
    name varchar(45) not null,
    birth_date date,
    primary key(actor_id)
);
desc actor;

# film_actor table
create table film_actor(
	actor_id smallint not null,
    film_id smallint not null,
    primary key(actor_id, film_id),
    foreign key(actor_id) references actor(actor_id) on update cascade,
    foreign key(film_id) references film(film_id) on update cascade
);
desc film_actor;


## [문항3] 아래 테이블 그림을 참고하여 테이블에 데이터를 추가하시오. [15점]
## ( 테이블 1개 5점 x 3개 = 총 15점 )

# actor table
insert into actor
values
(1, '송강호', '1967-01-17'),
(2, '한석규', '1964-11-03'),
(3, '문성근', '1953-05-28'),
(4, '심은하', '1972-09-23'),
(5, '전도연', '1973-02-11'),
(6, '이정재', '1981-10-30');

select * from actor;

# film table
insert into film
values
(1001, '초록물고기', '이창동감독의 데뷔작', 1997, '이스트필름'),
(1002, '접속', 'PC통신을 통해 신청자에게 접속하면서 생기는 로맨스', 1997, '명필름'),
(1003, '8월의크리스마스', '허진호감독의 데뷔자', 1998, '우노필름'),
(1004, '쉬리', '국내 첩보 액션 스릴러 영화', 1999, '(주)강제규필름'),
(1005, '텔미썸딩', '이승현 감독의 멜로 영화', 1999, '큐앤씨필름'),
(1006, '시월애', '이승현 감독의 멜로 영화', 2000, '싸이더스');

select * from film;

# film_actor table
insert into film_actor
values
(2, 1001),
(3, 1001),
(2, 1002),
(5, 1002),
(2, 1003),
(4, 1003),
(1, 1004),
(2, 1004),
(2, 1005),
(4, 1005),
(6, 1006);

select * from film_actor;


## [문항4] 1999년 이후에 제작된 영화 수를 조회하시오. [10점]
select count(release_year) '1999년 이후 제작된 영화 수' from film
where release_year >= '1999-01-01';


## [문항5] 1999년에 개봉된 영화를 조회하시오. [10점]
select title '1999년 개봉 영화' from film
where release_year = '1999';


## [문항6] 쉬리에 출연한 배우 이름을 조회하시오. 단, 조인과 서브 쿼리로 작성하시오. [15점]
/* select name '쉬리 출연 배우'
from actor a join (select actor_id, ac.film_id
						from film_actor ac, film f
						where ac.film_id = f.film_id and title like '쉬리') f
where a.actor_id = f.actor_id; */

select name '쉬리 출연 배우'
from actor a inner join film_actor ac on a.actor_id = ac.actor_id
where film_id = 1004; 


## [문항7] 한석규 배우가 출연한 영화 수를 조회하시오. [15점]
select concat(count(film_id), '편') '한석규 배우 영화수'
from actor a, film_actor f
where a.actor_id = f.actor_id and name like '한석규';


## [문항8] 1970년대에 태어난 배우 이름과 생년월일을 조회하시오. [10점]
select name '이름', birth_date '생년월일'
from actor
where birth_date between '1970-01-01' and '1979-12-31';


## [문항9] 사용자 hyun을 추가한 후, film 테이블을 조회하는 권한을 부여하시오. [5점]
## - 비밀번호 임의 설정
## - 내부접근 허용
create user 'hyun'@'localhost' identified by '1111'; # 비밀번호 '1111', 내부 접근 허용
grant select on movie.film to 'hyun'@'localhost'; # film 테이블 조회 권한 부여

show grants for 'hyun'@'localhost'; # 사용자 hyun 의 권한
