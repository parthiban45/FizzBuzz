package com.kairos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kairos.service.FizzBuzzService;

/* FizzBuzz Rest Controller, Calls underlying business service 
to get the response */
@RestController
public class FizzBuzzController {

	@Autowired
	private FizzBuzzService fizzBuzzService;

	/* Default constructor */
	public FizzBuzzController() {
	}

	/* Method to return a word based on the following constraints
	- Input number divisible by 15, return "FizzBuzz"
	- Input number divisible by 3, return "Fizz"
	- Input number divisible by 5, return "Buzz"
	- Input number not divisible by either of them above, return the input integer
	- By calling the underlying FizzBuzzService
	*/
	@RequestMapping(value = "/word/{number}", method = RequestMethod.GET, produces = "application/json")
	public String getWord(@PathVariable(value="number") Integer i) {
		return fizzBuzzService.FizzBuzz(i);
	}

}
