/* 
[모듈 다시 내보내기]
: 모듈의 보안 유지 가능
*/
console.log('*** secret.js 시작 ***');

// hide 모듈 읽고 바로 내보내기 
import Secret from './hide.js';

// login 모듈 읽고 바로 내보내기
import Login from './login.js';

// export default Secret, Login;
export { Secret, Login };

console.log('*** secret.js 종료 ***');