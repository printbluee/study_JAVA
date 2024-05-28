// [방법 3]
const emoji = document.querySelector('.emoji');
const remove = document.querySelector('.remove');
const h1 = document.querySelector('h1');

// [이벤트 리스너]
// : 이벤트가 발생했을 때, 그 처리를 담당하는 함수
// : 이벤트 핸들러(event handler) - 이벤트 감지 후, 실행하는 함수
// <문법>
// element.addEventListener('이벤트', 이벤트핸들러);
// => 이벤트 핸들러를 이벤트 리스너(addEventListener)에 등록한다 라고 말함

// [이벤트 핸들러]
// [함수 선언식]
function emojiHandler(event) {
  console.log(event);
  console.log('🎀');
}

// 이벤트 핸들러 해제
// [화살표 함수]
const removeHandler = () => {
  console.log('이모지 출력 이벤트 해제 /(ㄒoㄒ)/~~');
  emoji.removeEventListener('click', emojiHandler); // 이벤트 핸들러 해제
}

const mouseoverChange = function() {
  console.log('마우스 쥐나가요 ~ ㅋ');
}
const clickChange = function() {
  h1.innerText = '쪼은 하루 ㅋ';
  h1.style.backgroundColor = 'pink';
}

// 이벤트 핸들러를 이벤트 리스너에 등록
// 콜백함수로 넣을 것
// [공부] 화살표 함수로 바꾸기
// emoji.addEventListener('click', emojiHandler);  
emoji.addEventListener('click', (event) => {
  console.log(event);
  console.log('🎀');
}); 
// remove.addEventListener('click', removeHandler); 
remove.addEventListener('click', (event) => {
  console.log('이모지 출력 이벤트 해제 /(ㄒoㄒ)/~~');
  emoji.removeEventListener('click', emojiHandler);
});

// [공부] 함수 표현식으로 바꾸기
// h1.addEventListener('mouseover', () => console.log('마우스 쥐나가요 ~ ㅋ'));
h1.addEventListener('mouseover', mouseoverChange);
// h1.addEventListener('click', () => {
//   h1.innerText = '쪼은 하루 ㅋ';
//   h1.style.backgroundColor = 'pink';
// });
h1.addEventListener('click', clickChange);