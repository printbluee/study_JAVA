import FoodItem from "./FoodItem";

/* component */
const Favorites = ({ favorites }) => {
  return (
    <ul className="favorites">
      {favorites.map((food, index) => (<FoodItem img={food} key={index} />))}
    </ul>
  );
}

export default Favorites;