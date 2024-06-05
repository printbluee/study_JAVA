import logo from './logo.svg';
import React from 'react';
import './App.css';

import H1 from './components/H1';
import Form from './components/Form';
import MainCard from './components/MainCard';
import Favorites from './components/Favorites';

const jsonLocalStorage = {
  setItem: (key, value) => {
    localStorage.setItem(key, JSON.stringify(value));
  },
  getItem: (key) => {
    return JSON.parse(localStorage.getItem(key));
  },
}

/* component : 상태 끌어올리기(lifting state up) */
const App = () => {
  const foodOne = "img/food-one.jpg";
  const foodTwo = "img/food-two.jpg";
  const foodTree = "img/food-three.jpg";

  // 보여지는 이미지 상태값
  const [favorites, setFavorites] = React.useState(() => {
    // 초기값 빈 배열로 설정
    return jsonLocalStorage.getItem('favorites') || [];
  });
  // 페이지수 상태값
  const [counter, setCounter] = React.useState(() => {
    return jsonLocalStorage.getItem('counter');
  }
  );
  // 좋아요 버튼 상태값
  const [heartCounter, setHeartCounter] = React.useState(0);

  function updateCounter() {
    setCounter((pre) => {
      const nextCounter = pre + 1;
      jsonLocalStorage.setItem('counter', nextCounter);
      return nextCounter;
    });
  }

  function handlerHeartClick() {
    setHeartCounter(heartCounter + 1);

    setFavorites((pre) => {
      const nextFavorites = [...pre, foodTree];
      jsonLocalStorage.setItem('favorites', nextFavorites);
      return nextFavorites;
    });
  }

  return (
    <div>
      <H1>{counter}</H1>
      <Form updateCounter={updateCounter} />
      <MainCard
        img="img/food-one.jpg"
        handlerHeartClick={handlerHeartClick}
        heartCounter={heartCounter}
      />
      <Favorites favorites={favorites} />
    </div>
  );
}

export default App;