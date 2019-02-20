package pl.edu.agh.mwo.java3.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	FizzBuzz tester = new FizzBuzz();

	@Test
	void FizzBuzzMultiplesOfThreeAndFive() {
		tester.setI(15);
		assertEquals("FizzBuzz", tester.FizzBuzz());
		tester.setI(30);
		assertEquals("FizzBuzz", tester.FizzBuzz());
		tester.setI(45);
		assertEquals("FizzBuzz", tester.FizzBuzz());
		tester.setI(60);
		assertEquals("FizzBuzz", tester.FizzBuzz());
	}

	@Test
	void FizzBuzzMultiplesOfThree() {
		tester.setI(3);
		assertEquals("Fizz", tester.FizzBuzz());
		tester.setI(6);
		assertEquals("Fizz", tester.FizzBuzz());
		tester.setI(9);
		assertEquals("Fizz", tester.FizzBuzz());
		tester.setI(12);
		assertEquals("Fizz", tester.FizzBuzz());
	}

	@Test
	void FizzBuzzMultiplesOfFive() {
		tester.setI(5);
		assertEquals("Buzz", tester.FizzBuzz());
		tester.setI(10);
		assertEquals("Buzz", tester.FizzBuzz());
		tester.setI(20);
		assertEquals("Buzz", tester.FizzBuzz());
		tester.setI(25);
		assertEquals("Buzz", tester.FizzBuzz());
	}

	@Test
	void FizzBuzzNumber() {
		tester.setI(1);
		assertEquals("1", tester.FizzBuzz());
		tester.setI(2);
		assertEquals("2", tester.FizzBuzz());
		tester.setI(4);
		assertEquals("4", tester.FizzBuzz());
		tester.setI(7);
		assertEquals("7", tester.FizzBuzz());
	}

}
