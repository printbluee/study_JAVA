# 날짜 함수

# 현재 날짜와 시간
select now(); 		# 2024-06-10 11:33:06
select sysdate();	# 2024-06-10 11:33:11, 서버 기준

select now(), sysdate(); # 실행에 있어서 조금 차이는 있음, 시간은 같음

# now : 쿼리 실행 뒤 시간 리턴
select now(), sleep(5), now();		  # 쿼리가 끝난 시간이 2개 찍힘

# sysdate : 함수가 실행되는 시점의 시간 리턴
select sysdate(), sleep(5), sysdate();  # now 가 실행이 되고, sleep 5초가 끝나면 now 가 실행됨 !

# 현재 날짜
select current_date(), curdate();	# 2024-06-10, current_date 의 축약

# 현재 시간
select current_time(), curtime(); 	# 11:35:46, current_time 의 축약

/*
특정 날짜를 기준으로 더하거나 빼기한 값
[문법] date_add(날짜, interval 값 기준) : 날짜 또는 시간에서 interval 만큼 더한 날짜 반환
[문법] date_sub(날짜, interval 값 기준) : 날짜 또는 시간에서 interval 만큼 빼기한 날짜 반환
interval 기준 : year, month, day, hour, minute, second
*/
# 오늘 기준으로 1일 뒤
select now(), date_add(now(), interval 1 day);

# 오늘 기준으로 100일 뒤
select now(), date_add(now(), interval 100 day);

# 현재 시간 기준으로 1시간 뒤
select now(), date_add(now(), interval 1 hour);

# 오늘 기준으로 1일 전
select now(), date_sub(now(), interval 1 day);

# 오늘 기준으로 100일 전
select now(), date_sub(now(), interval 100 day);

# [문제] 사원들의 발령 7일 전 날짜 조회
select hire_date, date_sub(hire_date, interval 7 day) as '발령 7일 전'
from employees;

# [년, 월, 일, 시, 분, 초] 조회
select now(), year(now()) as '년', month(now()) as '월', day(now()) as '일';
select now(), hour(now()) as '시', minute(now()) as '분', second(now()) as '초';

# 월을 영어로 리턴
select now(), monthname(now()) as '월';

# 요일을 숫자로 리턴 
# 1) dayofweek(날짜);
# 일(1), 월(2), 화(3), 수(4), 목(5), 금(6), 토(7)
select now(), dayofweek(now()) as '요일';
select now(), dayofweek(now()) as '2024-06-10 요일', dayofweek('2024-06-11') as '2024-06-11 요일';

# 2) weekday(날짜)
# 월(0), 화(1), 수(2), 목(3), 금(4), 토(5), 일(6)
select now(), weekday(now()) as '요일';
select now(), weekday(now()) as '2024-06-10 요일', weekday('2024-06-11') as '2024-06-11 요일';

# 일년을 기준으로 일 수 : dayofyear(날짜);
select now(), dayofyear('2024-01-01') as '2024-01-01', dayofyear(now()) as '현재';

# 일년을 기준으로 몇 번째 주 : week(날짜);
select now(), week('2023-01-01') as '2023-01-01 주', week('2024-01-01') as '2024-01-01 주', week(now()) as '현재 주';

# cf) 날짜 시간에 덧셈, 뺄셈 연산 작업 가능
select now(), now() + 1, curdate() + 1, curtime() + 1, year(now()) + 1;

# 형식 지정
select now(), date_format(now(), '%Y') as '년 (4자리)'; 	# 2024
select now(), date_format(now(), '%y') as '년 (2자리)'; 	# 24
select now(), date_format(now(), '%Y %y %m %M %b'); 		# 2024 24 06 June Jun
select now(), date_format(now(), '%Y년 %m월 %d일 %H시 %i분 %s초') as '데이터 가공'; # 2024년 06월 10일