package com.udit.ratingsdataservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.udit.ratingsdataservice.models.Rating;
import com.udit.ratingsdataservice.models.UserRating;

@RestController
public class RatingsResource {

	@GetMapping("/ratings/{movieId}")
	public List<Rating> getRatings(@PathVariable("movieId") String movieId) {
		return Arrays.asList(new Rating("123", 4), new Rating("456", 3));
	}

	@GetMapping("/userratings/{userId}")
	public UserRating getUserRatings(@PathVariable("userId") String userId) {
		UserRating ur = new UserRating();
		ur.setUserId(userId);
		ur.setRatings(Arrays.asList(new Rating("123", 4), new Rating("456", 3)));
		return ur;
	}
}
