package com.TSI.Movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
@RequestMapping("/films")
public class MovieApplication {
	@Autowired
	private MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

	@GetMapping("/moviedata")
	public Movie movieData() {
		Movie starWars3 = new Movie("Revenge of the Sith", 2005, 126, "Action");
		return starWars3;
	}

	@GetMapping("/all")
	public @ResponseBody
	Iterable<Movie> getAllUsers() {
		return movieRepository.findAll();
	}

	@PostMapping("/addMovie")
	public @ResponseBody
	String addAMovie(@RequestParam String title
			, @RequestParam int releaseYr, @RequestParam int length, @RequestParam String genre) {


		Movie savedMovie = new Movie(title, releaseYr, length, genre);
		movieRepository.save(savedMovie);
		return "Saved";

	}
}