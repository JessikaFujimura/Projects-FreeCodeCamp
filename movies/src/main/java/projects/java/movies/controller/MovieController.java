package projects.java.movies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projects.java.movies.entity.Movie;
import projects.java.movies.service.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;
    
    @GetMapping
    public ResponseEntity<List<Movie>>allMovies(){
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), null, HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Movie> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Movie>(movieService.singleMovie(imdbId), null, HttpStatus.OK);
    }

}
