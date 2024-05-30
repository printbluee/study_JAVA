/* 
==========================================
[모듈 가져오기]
- import 키워드 사용
==========================================
*/
console.log('*** index.js 시작 ***');

/* 
[1. '정의된 내보내기'를 가져오기] ----------------------
<<문법>>
import { 이름 } from '경로/파일명.확장자';
: 이름 변경 불가능
*/

// 1-1) 방법 1
import { info } from './item.js';
info();

// 1-2) 방법 2
import { edit, del } from './item.js';
edit();
del();

// 1-3) 방법 3
// as : alias (별명/별칭)
import * as obj from './item.js';
obj.info();
obj.edit();
obj.del();

/* 
[2. 'default 내보내기'를 가져오기] ----------------------
<<문법>>
import 이름 from '경로/파일명.확장자';
: {} 반드시 생략, {} 사용하면 error
: 이름 변경 가능
*/
import add from './item.js';
import Add from './item.js';
import zzz from './item.js';
add();
Add();
zzz();

// // 모듈만 실행 !
// // 변수에 저장안하고 파일/모듈 만 실행하겠다는 뜻
// import './hide.js';
// // 같은 모듈을 다른 형태로 import 해도 한번만 실행
// // import * as hide  from './hide.js';

// // default export 가져오기
// import show from './hide.js';
// import { default as showTwo } from './hide.js';
// show();
// showTwo();

// default export - 가져오기
// import Secret from './secret.js';
// Secret();

// named export - 가져오기
import { Secret, Login } from './secret.js';
Secret();
Login();


console.log('*** index.js 종료 ***');