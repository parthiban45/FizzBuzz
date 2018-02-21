package com.kairos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kairos.service.FizzBuzzService;

@RestController
public class FizzBuzzController {

	@Autowired
	private FizzBuzzService fizzBuzzService;

	public FizzBuzzController() {

	}

	@RequestMapping(value = "/word/{number}", method = RequestMethod.GET, produces = "application/json")
	public String getWord(@PathVariable(value="number") Integer i) {
		return fizzBuzzService.FizzBuzz(i);
	}

}
