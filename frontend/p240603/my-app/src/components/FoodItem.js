/* component */
const FoodItem = ({ img }) => {
    return (
      <li>
        <img
          src={img}
          alt="음식"
          style={{ width: '150px', height: '100px', backgroundSize: 'contain' }}
        />
      </li>
    );
  }
  
  export default FoodItem;
  