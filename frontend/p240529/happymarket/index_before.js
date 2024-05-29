// 변수명에 element 저장
// 1
const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');
const btn_modal = document.querySelector('#btn-modal');
const btn_close = document.querySelector('.btn-close');
const close_elements = [btn_close, overlay];
// 2
const form = document.querySelector('form');
const sign_up = document.querySelector('.sign-up');
const input = document.querySelector('input');
const inputData = document.querySelector("input[type='email']");
const ul = document.querySelector('ul');

// 1. 모달 띄우기 버튼 클릭 시 모달창 활성화, 모달창 닫기 버튼 클릭시 비활성화
/* 
[모달 : 활성화]
1-1. btn_modal(모달창 띄우기 버튼) 클릭 했을 때 이벤트 설정
classList.add    : 클래스 추가하는 속성,참조변수라 생각
classList.remove : 클래스 제거하는 속성
*/
btn_modal.addEventListener('click', () => { // 콜백함수 
  modal.classList.add('active');    // modal 에 active 클래스를 추가
  overlay.classList.add('active') ; // overlay 에 active 클래스를 추가

  console.log('inputData >> ', inputData);
  inputData.value = '';
  console.log('inputData 종료');
});  
/* 
[모달 : 비활성화]
1-2. btn_close(모달창 x 버튼) or overay(버튼 외) 클릭 했을 때 이벤트 설정
*/
close_elements.forEach(element => {
  element.addEventListener('click', () => { 
    modal.classList.remove('active');   // modal 에 active 클래스를 제거
    overlay.classList.remove('active'); // overlay 에 active 클래스를 제거
  })
});
// [과제] 1-3. 모달창에 텍스트(이메일) 입력 후 닫고 다시 열었을 때 텍스트 초기화

// 2. 상품명 입력 후 등록
// [구현 1] ====================================================================================
// text box(상품명 입력창)에 입력 후, 등록 버튼 클릭하면 항목(li) 추가 
/* 
form : text 입력 후 엔터를 치면 기본적으로 submit 이 됨
       form 태그에 action 을 설정하지 않아서 현재 페이지 요청이 됨
       하지만 server 에 요청하고 싶지 않기 때문에 자바스크립트 사용해서 요청하지 않을 것 !
preventDefault() : refresch(새로 고침) 방지, submit 기능 삭제
*/
// form.addEventListener('submit', (event) => { // submit : 엔터를 치면
//   // 1) refresch(새로 고침) 방지
//   event.preventDefault(); 
  
//   // 2-1) li element 생성
//   const li = document.createElement('li');
//   // 2-2) li element 에 content 추가
//   li.innerText = input.value;
//   // 2-3) ul 의 자식 li element 추가
//   ul.appendChild(li);
  
//   // 3) input(텍스트 박스)에 입력된 문자열 삭제
//   // input.value = '';
//   // input.value = null;
// });

// [구현 2] refactoring =============================================================================
// 위 코드 분리 : listener, handler, li 기능 분리
// 명확한 기능이 있는 경우 따로 빼주는 것이 좋음
// [함수] li 추가 기능
// const addLi = (content) => {
//   const li = document.createElement('li');
//   li.innerText = content;
//   ul.appendChild(li);
// }
// // [handler]
// // 보통 무슨 handler 인지 지정해주면 좋지만, 하나만 있어서 그냥 handler 라 지정 !
// const handler = (event) => { 
//   event.preventDefault(); 
//   if (input.value !== '') { // type 비교까지 하기 위해 사용
//     addLi(input.value);
//   }
//   input.value = '';
// }
// // [listener]
// // form.addEventListener('submit', handler);
// sign_up.addEventListener('click', handler);

/* 
[구현 3] 기능 추가 ====================================================================================
1) 삭제 버튼
  1-1) li element 가 추가되면, 삭제 버튼도 같이 추가
  1-2) 삭제 버튼을 클릭하면, li 엘리먼트 삭제
2) local storage
  2-1) li content 를 web local storage 에 저장
    -> 웹 브라우저는 Application 에 web local storage 에 정보가 남아있는데, 여기서 가져올 것 ! 가져오는 함수가 있음 !
    -> 단점 : 다른 웹 브라우저 사용시 보여지지 않음
  2-2) 삭제 버튼 클릭하면, web browser 에 저장된 데이터 삭제
3) 새로 고침해도 local storage 에 있는 값들 보여지게 하기
*/

// 삭제 기능
const deleteLi = (event) => {
  console.log('삭제 버튼 클릭됨 !');

  const target = event.target.parentElement; // 삭제하고자 하는 element 만 삭제

  // 삭제 버튼 클릭된 element id 확인
  console.log(target.id);

  // 삭제 버튼 클릭된 element 제외한 나머지 추출
  li_items = li_items.filter((item) => {
    // console.log('item >> ', item);
    // console.log('item.id > > ', item.id);
    // console.log('item.id type> > ', typeof item.id);
    // console.log('target.id >>', target.id);
    // console.log('target.id type> >> ', typeof target.id);
    // console.log('item.id != target.id >> ', item.id != target.id);
    return item.id != target.id;
  });
  console.log('삭제 후 li_items >> ', li_items);
  target.remove();

  // local storage 에 저장
  storage_save();
}
// [함수] li 추가 기능
const addLi = (li_item) => {
  const li = document.createElement('li'); 
  ul.appendChild(li);
  
  // span element 생성 후 추가
  const span_content = document.createElement('span');
  span_content.innerText = li_item.content;

  // 삭제 버튼 생성 후 추가
  const btn_cross = document.createElement('button');

  // 삭제 버튼 : listener 에 handler 등록
  btn_cross.addEventListener('click', deleteLi); // li button 클릭하면 이 코드 실행

  // li 자식으로 span, button 한 번에 추가
  li.append(span_content, btn_cross); // 순서대로 들어옴

  // local storage 에 저장된 요소 삭제할 때
  // 기준으로 사용될 id 지정
  li.id = li_item.id;
  console.log('매개변수 li_item >>', li_item);
}

// [handler]
let li_items = [];

// local storage 에 저장하는 함수
const storage_save = () => {
  localStorage.setItem('li_items', JSON.stringify(li_items)); // 배열안에 객체가 들어가 있고, 직렬화 해주기
};

const handler = (event) => { 
  event.preventDefault(); 
  if (input.value !== '') { // type 비교까지 하기 위해 사용
    const li_item = { // li content 를 web local storage 에 저장
      id : Date.now(),
      content : input.value,
    };

    li_items.push(li_item);
    // addLi(input.value);
    addLi(li_item);
    storage_save(); 
  }
  input.value = '';
}
// [listener]
sign_up.addEventListener('click', handler);






/* 
///////////////////////////////////////////////////////////////////////////////////////
//////////////////////////// web browser local storage ////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////

[저장하기 / 가져오기]
<문법>
localStorage.setItem(key, value);
localStorage.setItem('문자열', '문자열');
localStorage.getItem(key);
localStorage.getItem('문자열');
*/

// 1-1. 저장하기
// localStorage.setItem('name', '홍길동');
// // 1-2. 가져오기
// const value = localStorage.getItem('name');
// console.log('[key] name >> ', value);
// localStorage.setItem('name', '박보검');

// 2-1. 객체 저장하기
obj = {
  name : '이미자',
  age : 55,
}

// [객체를 JSON(문자열)로 변환] =====================
// 자바스크립트로 만든 객체를 json 형태로 만들것
// 문자열 형태로 만들어 통일화 하여 직렬화로 만들 것
// : object type -> JSON
// : 직렬화
// : JSON.stringify(객체)
// ==================================================
// localStorage.setItem('obj', obj);
// obj_string = JSON.stringify(obj);
// console.log('obj_string type >> ', typeof obj_string);
// console.log(obj_string);
// localStorage.setItem('obj', obj_string);

// 2-1. 객체 가져오기
// obj_value = localStorage.getItem('obj');
// console.log(obj_value);
// console.log(typeof obj_value);

// [JSON(문자열)을 객체로 변환] =====================
// : JSON -> object type
// : 역직렬화
// ==================================================
// obj_value = JSON.parse(localStorage.getItem('obj'))
// console.log(typeof obj_value);
// console.log(obj_value);
// console.log(obj_value.name);

// [key] Date.now() =================================
// UTC 기준으로 1970년 1월 1일 0시 0분 0초부터
// 현재까지 경과된 밀리초를 반환
// 현재 프로젝트는 key 값을 쓸만한게 없어서 사용한 것
// ==================================================
// console.log(Date.now());


///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////// 초기화 작업 /////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
/* 
- 페이지가 로드될 때, local storage 에 저장된 데이터 가져오기
- 초기화 작업이 아래에 있는 이유 : 현재 프로젝트에서 호출되는 건 init(),
  위에 필요한 코드를 처리 후에 코드 실행하기 위해서 사용한 것
*/
const init = () => {
  const local_storage_data = JSON.parse(localStorage.getItem('li_items'));
  // console.log('local_storage_data >> ', local_storage_data);

  if(local_storage_data) {
    // console.log('[전] li_items >> ', li_items);
    // console.log('[전] li_items type >> ', typeof li_items);
    li_items = local_storage_data 
    // console.log('[후] li_items >> ', li_items);
    // console.log('[후] li_items type >> ', typeof li_items);
  
    // li 추가
    li_items.forEach(value => addLi(value));
  }
};

init();

// console.log('<< 논리값 >>');
// console.log('null : ', Boolean(null));
// console.log('0 : ', Boolean(0));
// console.log('-5 : ', Boolean(-5));
// console.log('빈 배열 [] : ', Boolean([]));
// console.log('빈 객체 [] : ', Boolean({}));