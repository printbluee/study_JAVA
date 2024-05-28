// [방법 3]
const emoji = document.querySelector('.emoji');
const remove = document.querySelector('.remove');
const h1 = document.querySelector('h1');

// [함수 표현식으로 정의] ===========================================
// [이벤트 핸들러]
// const emojiHandler = function(event) { 
//   console.log(event);
//   console.log('🎀');
// }
// const removeHandler = function() {
//   console.log('이모지 출력 이벤트 해제 /(ㄒoㄒ)/~~');
//   emoji.removeEventListener('click', emojiHandler); // 이벤트 핸들러 해제
// }
// const mouseoverChange = function() {
//   console.log('마우스 쥐나가요 ~ ㅋ');
// }
// const clickChange = function() {
//   h1.innerText = '쪼은 하루 ㅋ';
//   h1.style.backgroundColor = 'pink';
// }

// 이벤트 핸들러를 이벤트 리스너에 등록
// emoji.addEventListener('click', emojiHandler);  
// remove.addEventListener('click', removeHandler); 
// h1.addEventListener('mouseover', mouseoverChange);
// h1.addEventListener('click', clickChange);

// [화살표 함수으로 정의 ] ==========================================
emoji.addEventListener('click', (event) => {
  console.log(event);
  console.log('🎀');
});  
remove.addEventListener('click', (event) => {
  console.log('이모지 출력 이벤트 해제 /(ㄒoㄒ)/~~');
  // 이벤트 핸들러 해제
}); 
h1.addEventListener('mouseover', () => console.log('마우스 쥐나가요 ~ ㅋ'));
h1.addEventListener('click', () => {
  h1.innerText = '쪼은 하루 ㅋ';
  h1.style.backgroundColor = 'pink';
});
h1.addEventListener('click', () => {
  h1.innerText = '쪼은 하루 ㅋ';
  h1.style.backgroundColor = 'pink';
});