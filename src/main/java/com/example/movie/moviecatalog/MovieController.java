/**
 * 
 */
package com.example.movie.moviecatalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abdare
 *
 */


@RestController
public class MovieController {

	
	@GetMapping("/getMovie/")
	public String getMovieName(@PathVariable String name) {
		return name + " Hello World!";
		
	}
}
