# DB 선택
use employees;

# [문자열 함수]
# [문법] replace(컬럼명, 기존문자, 새문자);
select replace('abcdefg', 'cd', 'one');   # aboneefg
select replace('abcdefgcd', 'cd', 'one'); # aboneefgone

# [문제] cd 를 삭제해라
select replace('abcdefg', 'cd', '');      # abefg

########################################################################

# 위치 : 왼쪽 기준으로 위치는 1부터 시작, 없으면 0 반환
# [문법] instr(컬럼명, 찾고자하는문자);
select instr('abcdefg', 'b');  	# 2 반환 --> 왼쪽 기준
select instr('abcdefgb', 'b'); 	# 2 반환 --> 첫번째로 찾은 위치 반환
select instr('abcdefgb', 'cde');	# 3 반환 --> 시작하는 문자 위치 반환

# [문제] k 를 찾아라
select instr('abcdefg', 'k'); # 0 반환 --> 없다

########################################################################

/* 
문자 반환
[문법]
left(컬럼명, 개수);
right(컬럼명, 개수);
mid(컬럼명, 시작 위치, 개수);
*/ 
select 'abcdefg', 
	left('abcdefg', 3),  	# abc
    right('abcdefg', 3), 	# efg
	mid('abcdefg', 3, 2);	# cd

# [문제] mid 를 이용하여 c부터 끝까지 추출
select mid('abcdefg', 3);	# cdefg 

select first_name, mid(first_name, 3)
from employees;

########################################################################

# [문법] substring(컬럼명, 시작위치, 개수);
# substring﻿ 과 mid 둘다 써도 됨
# substringm, substr, mid 음수 사용 가능
select substring('abcdefg', 3, 2); 	# cd
select substring('abcdefg', 3); 		# cdefg
select substring('abcdefg', -3); 		# efg

select substring('abcdefg', -3, 2);	# ef
select substr('abcdefg', -3, 2);		# ef

########################################################################

# [문법] substring_index(컬럼명, '구분자', 구분자 번호);
# ex) 전화번호
select substring_index('ab-cd-efg', '-', 1); # ab
select substring_index('ab-cd-efg', '-', 2); # ab-cd
select substring_index('ab-cd-efg', '-', 3); # ab-cd-efg

# 오른쪽 기준으로 출력
select substring_index('ab-cd-efg', '-', -1); # efg
select substring_index('ab-cd-efg', '-', -2); # cd-efg
select substring_index('ab-cd-efg', '-', -3); # ab-cd-efg

########################################################################

/* 
공백 제거
[문법]
ltrim(컬럼명) 	: 왼  쪽 공백 제거
rtrim(컬럼명) 	: 오른쪽 공백 제거
trim(컬럼명) 	: 양  쪽 공백 제거
*/
select 'abc', '   abc    ', concat('|', '   abc    ', '|');
select concat('|', ltrim('   abc    '), '|');
select concat('|', rtrim('   abc    '), '|');
select concat('|', trim('   abc    '), '|');

# 문자 사이 공백 제거
select replace('   a   bc    ', 'a   bc', 'abc');

########################################################################

/* 
대/소문자 변경
[문법]
ucase(컬럼명);
lcase(컬럼명);
*/
select ucase('aBcDe'), lcase('aBcDe'); # ABCDE, abcde

########################################################################

# 역순
select reverse('aBcDe');	# eDcBa

########################################################################

# 문자 길이(문자 수)
select length('aBcDefg');   # 7
select length('aBcDe  fg'); # 9 (공백 포함)

# [문제 1] 부서명 길이 구하기
select dept_name, length(dept_name) as '부서명 길이' from departments;

########################################################################
