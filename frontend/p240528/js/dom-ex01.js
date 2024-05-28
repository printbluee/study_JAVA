/*
1. 단일 element 추출(반환)
- 여러 개인 경우 첫 번째만 추출
1-1) document.getElementById('아이디')
1-2) document.querySelector('선택자')
     아이디 : #아이디
     클래스 : .클래스
     태그   : 태그

2. 복수 element 추출(반환)
2-1) document.getElementsByClassName('클래스명')
2-2) document.getElementsByTagName('태그')
2-3) document.querySelectorAll('선택자')
     document.querySelectorAll('선택자1, 선택자2') -> 선택자1 or 선택자2
*/

// 1. 단일 element 추출(반환)
// JS 프로그래밍 언어
// 복사본을 저장한 게 아니라, 속성을 담아둔 것
// script 태그를 body 닫힌 태그 바로 위에 둠
// 만약 head 태그 쪽에 두면 error 가 발생 
// -> 해당 element 에 접근이 안됨
// -> html 렌더링하면서 js 가 먼저 실행되고, 아직 body 태그를 읽지 못햇음
// head 에 오는 script 는 funtion 정의, 전역변수, 초기화 작업 등등이 있음
// Hello 에서 변경된 테스트로 변경된 이유 : 주기적으로 접근
const id_txt = document.getElementById('txt');
const id_greeting = document.querySelector('#greeting');

// 2. 복수 element 추출(반환)
const class_c_txt = document.getElementsByClassName('c_txt');
const div = document.getElementsByTagName('div');
// query 를 쓰면 타입이 HTMLCollection 가 아닌 NodeList 로 됨
const seletorAll = document.querySelectorAll('.c_txt');
const seletorAll2 = document.querySelectorAll('h1, .c_txt'); // 중복이 된다면 중복 제거

// 출력
console.log('id_txt >>', id_txt);
console.log('id_txt type >>', typeof id_txt);
id_txt.innerText = '변경된 텍스트 !';
console.log('id_txt.innerText >>', id_txt.innerText);
console.log('\n');

console.log('id_greeting >> ', id_greeting);
console.log('id_greeting type >>', typeof id_greeting);
console.log('\n');

console.log('class_c_txt', class_c_txt);
console.log('class_c_txt type >>', typeof class_c_txt);
console.log('class_c_txt[1].innerText >>', class_c_txt[1].innerText);
console.log('class_c_txt[1]["innerText"]) >>', class_c_txt[1]['innerText']);
console.log('class_c_txt.greeting.innerText >>', class_c_txt.greeting.innerText);
console.log('class_c_txt.greeting["innerText"] >>', class_c_txt.greeting['innerText']);
console.log('\n');

// HTMLCollection
console.log('div >> ', div);
console.log('div type >>', typeof div);
console.log('\n');

// NodeList
console.log('seletorAll >> ', seletorAll);
console.log('seletorAll type >>', typeof seletorAll);
console.log('seletorAll[1].innerText >> ', seletorAll[1].innerText);
// console.log('seletorAll[1].innerText >> ', seletorAll.greeting.innerText); // id 접근이 안됨
console.log('\n');

console.log('seletorAll2 >> ', seletorAll2);
console.log('seletorAll2 type >>', typeof seletorAll2);

// 아이디라서 쓸 수 있음
// console.log('txt.innerText >>', txt.innerText);
// txt.innerText = '뭐꼬 ㅠㅠ';
