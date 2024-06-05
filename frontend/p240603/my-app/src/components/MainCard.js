/* component */
const MainCard = ({ img, handlerHeartClick, heartCounter }) => {
    return (
      <div className="main-card">
        <img
          src={img}
          alt="올리브 오일"
          width="400"
        />
        <button onClick={handlerHeartClick}>
          🤍{heartCounter > 0 && heartCounter}
        </button>
      </div>
    );
  }
  
  export default MainCard;