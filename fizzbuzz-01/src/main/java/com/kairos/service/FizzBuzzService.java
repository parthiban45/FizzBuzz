package com.kairos.service;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

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
