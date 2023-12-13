package theBestCalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws java.lang.Exception {

		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double r = 0.0;

		switch (c) {
		case '+':
			r = a + b;
			break;
		case '-':
			r = a - b;
			break;
		case '*':
			r = a * b;
			break;
		case '/':
			if (b != 0)
				r = a / b;
			break;
		default:
			System.out.println("This operation is invalid!");
			sc.close();
			return;
		}

		if (c == '/') {
			System.out.printf("%.1f\n", r);
		} else {
			System.out.println((int) r);
		}
		
		sc.close();
	}
}
