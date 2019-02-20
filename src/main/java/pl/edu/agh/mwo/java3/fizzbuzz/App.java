package pl.edu.agh.mwo.java3.fizzbuzz;

public class App {

	public static void main(String[] args) {

		FizzBuzz result = new FizzBuzz();

		for (int i = 1; i < 101; i++) {
			result.setI(i);
			System.out.println(result.FizzBuzz());
		}

	}

}
