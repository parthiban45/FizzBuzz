package com.kairos.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.kairos.service.FizzBuzzService;

public class FizzBuzzServiceTest {

	@Autowired
	private FizzBuzzService fizzBuzzService;
	
	@Test
	public void Fizztest() {
		
		assertEquals(fizzBuzzService.FizzBuzz(3), "Fizz");
	}

	@Test
	public void Buzztest() {
		assertEquals(fizzBuzzService.FizzBuzz(5), "Buzz");
	}

	@Test
	public void FizzBuzztest() {
		assertEquals(fizzBuzzService.FizzBuzz(45), "FizzBuzz");
	}

	@Test
	public void Integertest() {
		assertEquals(fizzBuzzService.FizzBuzz(7), "7");
	}

	@Test
	public void NotNulltest() {
		assertNotNull(fizzBuzzService.FizzBuzz(7));
	}

	@Test
	public void NotEmptytest() {
		assertTrue(fizzBuzzService.FizzBuzz(7) != "");
	}

}
