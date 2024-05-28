// 1. id 를 통해서 title 을 '제목' -> '변경된 제목'
title.innerText = '변경된 제목';

// 2. id 를 통해 append 에 content 로 h3 태그로 '추가된 제목' 넣어주기
// 자바스크립트를 통해 html 추가한 것은 동적 추가 라 불림
append.innerHTML = '<h3>추가된 제목</h3><div>추가 !</div>'

// 3-1. 첫 번째 단락에 접근
const selector = document.querySelector('.paragraph');
// console.log('첫 번째 단락 접근 >> ');
// console.log(selector);

// 3-2. 첫 번째 단락 innerText 변경 후폰트 색상 변경
selector.innerText = '첫 번째 단락만 변경';
selector.style.color = 'blue' // 자바스크립트를 통해 스타일 적용하는 것은 inline 스타일로 들어옴 (우선 순위가 높음)

// 3-3. [문제] 모든 단락의 텍스트를 가로 가운데 정렬하시오.
const paragraph = document.querySelectorAll('p.paragraph');

// [방법 1] for of 
// cf) for in : key 추출
// for(let para of paragraph) {
//   para.style.textAlign = 'center';
// }

// [방법 2] 함수 정의
// 함수 표현식
// const setTextAlign = function(args) {
//   args.style.textAlign = 'center';
// }
// for(let para of paragraph) {
//   setTextAlign(para);
// }

// 화살표 함수
// const setTextAlign = args => args.style.textAlign = 'center';
// for(let para of paragraph) {
//   setTextAlign(para);
// }

// [방법 3] 배열 함수 forEach
// paragraph.forEach(); // TypeError : ndefined is not a function at NodeList.forEach
const arr_paragraph = Array.from(paragraph); // NodeList -> Array
// console.log('arr_paragraph >> '); 
// console.log(arr_paragraph); 
console.log('arr_paragraph type >> ', typeof arr_paragraph);

arr_paragraph.forEach(element => element.style.textAlign = 'center');

