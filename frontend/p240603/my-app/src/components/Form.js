import React from 'react';

/* component */
const Form = ({ updateCounter }) => {
  const [value, setValue] = React.useState('');
  const [errorMsg, setErrorMsg] = React.useState('');

  const hangul = (text) => /[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]/.test(text);

  function handlerInputChange(data) {
    const userValue = data.target.value;
    setValue(userValue.toUpperCase());

    if (hangul(userValue)) {
      setErrorMsg('한글은 입력할 수 없습니다.');
    } else {
      setErrorMsg('');
    }
  }

  function handlerFormSubmit(event) {
    event.preventDefault();
    if (value === '') {
      setErrorMsg('빈 값은 추가 할 수 없습니다.');
      return;
    }
    updateCounter();
  }

  return (
    <form action="" onSubmit={handlerFormSubmit}>
      <input
        type="text"
        name="name"
        placeholder="상품명을 입력하세요"
        onChange={handlerInputChange}
        value={value}
      />
      <button type="submit">추가</button>
      <p style={{ color: '#f00' }}>{errorMsg}</p>
    </form>
  );
}

export default Form;