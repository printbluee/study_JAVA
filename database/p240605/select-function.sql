# [함수] 숫자 관련
# 절대값
# 실제 저장된 데이터가 아닌 임의의 데이터이기 때문에 from 생략
select abs(100), abs(-100);

# 소수점 이하 올림
# 소수점 첫째 자리가 반올림이 되든 안되든 무조건 올림
select ceil(10.4), ceil(10.5), ceil(10.6);

# 소수점 이하 내림
# floor 의미 : 바닥
select floor(10.432), floor(10.5), floor(10.6);

# 반올림
# . 기준으로 오른쪽을 반올림 결정
select round(10.432), round(10.5), round(10.6);

# 원래 이런 형태인데 위 코드는 생략된 것
# . 기준으로 오른쪽을 반올림
# 소수점이 왼쪽으로 이동
# -1 같은 경우 소수점 위치가 정수쪽으로 한 칸 옮겨졌기 때문에 170
select round(166.555, 0), round(166.555, 1), round(166.555, -1);

# 버림
# 0  : 소수점 기준으로 0자리부터 삭제
# 1  : 소수점 기준으로 1자리부터 삭제 (소수점이 왼쪽으로 이동)
# -1 : 소수점 기준으로 왼쪽으로 이동, 1의 자리는 버릴 수 없으니 0 처리
select truncate(166.555, 0), truncate(166.555, 1), truncate(166.555, -1);


# [함수] 문자 관련
# 문자열 이어주기
select concat('one', 'two', 'three');

# 함수를 통해서 가공한 것
# 이름에 '님' 붙여주기
select concat(first_name, '님') as '이름', concat('성별 : ', gender) as '성별'
from employees;

# 직원의 사번, 이름 조회
# 단, 이름은 first_name, last_name 을 한 컬럼으로 표시
select emp_no as '사번', concat(first_name, ' ', last_name) as '이름'
from employees;

# [문법] insert('문자', 시작 위치, 몇 개, '추가 문자')
# 특정 위치에 추가 (1) : 2번째 자리에서 1개를 wow 로 변경
select insert('abcdefg', 2, 1, 'wow'); # b 사라짐

# 특정 위치에 추가 (2) : 2번째 자리에서 0개를 wow 로 변경
select insert('abcdefg', 2, 0, 'wow'); # b 그대로 있음

# [문제] 'abcdefg' 에서 'bcd' 삭제
select insert('abcdefg', 2, 3, '');














