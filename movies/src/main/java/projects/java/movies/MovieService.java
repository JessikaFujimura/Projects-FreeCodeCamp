package projects.java.movies;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Movie singleMovie(String id) {
        Optional<Movie> movie =  movieRepository.findMovieByImdbId(id);
        try{
            if(movie.isPresent()){
                return movie.get();
            }
        }
        catch(Exception e){
            e.getMessage();
        }
        return null;
    }
}
