/* 
==========================================
[모듈 내보내기]
- export 키워드 사용
==========================================
*/
console.log('*** item.js 시작 ***');

/* 
[1. named export]
: 이름이 정의된 내보내기 방식
: 함수, 변수 등 왼쪽에 export 키워드 사용
: 한 모듈 내 여러 개 내보내기 가능
*/

// 1-1) 방법 1 : exprort 키워드를 함수명 왼쪽에 사용
export function info() {
  console.log('등록된 상품이 없습니다.');
}

// 1-2) 방법 2 : export 키워드를 별도로 사용
function edit() {
  console.log('상품을 수정합니다.');
}

function del() {
  console.log('상품을 삭제합니다.');
}

// 여러 개 내보내기
export { edit, del };

/* 
[2. default export]
: 기본 내보내기 방식
: 한 모듈 내 하나만 default 지정
*/

// 2-1) 방법 1 : default 키워드를 함수에 바로 사용
// export default function add() {
//   console.log('상품이 등록되었습니다.');
// }

// 2-2) 방법 2 : default 키워드를 별도로 사용 
// 이런 형태가 많이 사용
// 함수 정의를 먼저 하고 나중에 export 하니까 편함
// function add() {
//   console.log('상품이 등록되었습니다.');
// }

// 한 파일 내에 default 내보내기는 1개만 가능
// export default function aaa () {}

// export default add;

// 2-3) 방법 3 : 익명 함수
// 가져올 때 이름을 변경할 수 있기 때문에 익명 함수도 많이 사용
// export default function () {
//   console.log('상품이 등록되었습니다.');
// }
export default () => console.log('상품이 등록되었습니다.');



console.log('*** item.js 종료 ***');