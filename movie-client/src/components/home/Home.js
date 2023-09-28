import { Carousel } from "bootstrap";
import Hero from "../hero/Hero";
import Header from "../header/Header";

const Home = ({movies}) => {
 return (
    <div>
        <Hero movies={movies} />
    </div>
 )
}

export default Home;