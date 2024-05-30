const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');
const btn_modal = document.querySelector('#btn-modal');
const btn_close = document.querySelector('.btn-close');
const close_elements = [btn_close, overlay];
const form = document.querySelector('form');
const sign_up = document.querySelector('.sign-up');
const input = document.querySelector('input');
// const inputData = document.querySelector("input[type='email']");
const modal_input = document.querySelector('.modal input');
const ul = document.querySelector('ul');

// 1
// [모달창 활성화]
btn_modal.addEventListener('click', () => { 
  modal.classList.add('active'); 
  overlay.classList.add('active') ; 
  modal_input.value = ''; // 모달창 입력값 비우기
});  
// [모달창 비활성화]
close_elements.forEach(element => {
  element.addEventListener('click', () => { 
    modal.classList.remove('active');   
    overlay.classList.remove('active'); 
  })
});

// 2
// [삭제 기능]
const deleteLi = (event) => {
  const target = event.target.parentElement;

  li_items = li_items.filter((item) => {
    return item.id != target.id;
  });
  target.remove();
  storage_save(); 
}
// [li 추가 기능]
const addLi = (li_item) => {
  const li = document.createElement('li'); 
  ul.appendChild(li);
  
  const span_content = document.createElement('span');
  span_content.innerText = li_item.content;

  const btn_cross = document.createElement('button');
  btn_cross.addEventListener('click', deleteLi); 

  li.append(span_content, btn_cross); 
  li.id = li_item.id;
}

let li_items = []; // [li 요소 배열에 저장]

// [local storage 저장 기능]
const storage_save = () => {
  localStorage.setItem('li_items', JSON.stringify(li_items)); 
};
// [handler]
const handler = (event) => { 
  event.preventDefault(); 
  
  if (input.value !== '') {
    const li_item = { 
      id : Date.now(),
      content : input.value,
    };
    li_items.push(li_item);
    addLi(li_item);
    storage_save(); 
  }
  input.value = '';
}
// [listener]
sign_up.addEventListener('click', handler);

// 3
// [초기화 작업]
const init = () => {
  const local_storage_data = JSON.parse(localStorage.getItem('li_items'));

  if(local_storage_data) {
    li_items = local_storage_data 
    li_items.forEach(value => addLi(value));
  }
};

init();