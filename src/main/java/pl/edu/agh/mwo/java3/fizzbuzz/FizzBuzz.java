/*
 * Write a program that prints the numbers from 1 to 100. But for multiples of
 * three print “Fizz” instead of the number and for the multiples of five print
 * “Buzz”. For numbers which are multiples of both three and five print
 * “FizzBuzz”.
 */

package pl.edu.agh.mwo.java3.fizzbuzz;

public class FizzBuzz {

	private int i;
	private String fizzBuzz;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getFizzBuzz() {
		return fizzBuzz;
	}

	public void setFizzBuzz(String fizzBuzz) {
		this.fizzBuzz = fizzBuzz;
	}

	public String FizzBuzz() {

		if (i % 3 == 0 && i % 5 == 0) {
			setFizzBuzz("FizzBuzz");
			return getFizzBuzz();
		} else if (i % 3 == 0) {
			setFizzBuzz("Fizz");
			return getFizzBuzz();
		} else if (i % 5 == 0) {
			setFizzBuzz("Buzz");
			return getFizzBuzz();
		} else {
			setFizzBuzz(Integer.toString(getI()));
			return getFizzBuzz();
		}

	}

}
