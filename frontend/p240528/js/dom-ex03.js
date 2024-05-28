const element = document.getElementById('greeting');
const greetingInitialText = element.innerText;

// 함수 선언식
function textChange() {
  element.innerText = '오늘도 화이팅 ㅋ (｡･∀･)ﾉﾞ';
  element.style.background = '#ff0';
}

function textBefore() {
  element.innerText = greetingInitialText;
  element.style.background = 'initial'; // 초기화
}

// [방법 2]
// [jQuery]
// $(선택자); 달러 함수
// const greeting = $('#greeting');
// console.log(greeting);
$('#one').click(() => {
  $('#greeting').html('즐거운 오후 ㅋ(～ㅅ～)~zZ');
});
$('#two').click(() => {
  $('#greeting').html(greetingInitialText);
});
