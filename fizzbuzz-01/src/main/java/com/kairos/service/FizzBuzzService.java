package com.kairos.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	/* Method to return a word based on the following constraints
	- Input number divisible by 15, return "FizzBuzz"
	- Input number divisible by 3, return "Fizz"
	- Input number divisible by 5, return "Buzz"
	- Input number not divisible by either of them above, return the input integer
	- i/p - Integer
	- o/p - String
	*/
	public String FizzBuzz(Integer i) {
		String result = "";

		if (i % 15 == 0) {
			result = "FizzBuzz";
		} else if (i % 3 == 0) {
			result = "Fizz";
		} else if (i % 5 == 0) {
			result = "Buzz";
		} else {
			result = String.valueOf(i);
		}
		
		return result;
	}

}
