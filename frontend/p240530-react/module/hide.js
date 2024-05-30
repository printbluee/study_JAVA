console.log('*** hide.js 시작 ***');

function show() {
  console.log('>> show() 실행 ')
}

// export default show;
export { show as default }; // 요즘은 잘 사용 x

console.log('*** hide.js 시작 ***');