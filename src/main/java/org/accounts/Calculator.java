package org.accounts;

public class Calculator {

	public int add(int a, int b) {

		  return a + b;
	}

	public int subtract(int a, int b) {

		return a - b;
	}

	public int multiplication(int a, int b) {

		return a * b;
	}

	public double division(int a, int b) {

		if (b != 0) {

			return a / b;
		} else
			return 0.0;
	}

}
