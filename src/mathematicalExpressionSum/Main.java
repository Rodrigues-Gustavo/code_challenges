package mathematicalExpressionSum;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		double result = (double) ((a + b) * (c - d) * (e + f)) / 2.0;

		System.out.println("Eu sou FERA nas continhas e o resultado é " + result);
		sc.close();
	}
}
