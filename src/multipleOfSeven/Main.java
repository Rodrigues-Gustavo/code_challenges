package multipleOfSeven;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		Integer dividend = sc.nextInt();
		Integer divisor = 7;
		Integer remainder = dividend % divisor;

		String message = (remainder == 0) ? "É MULTIPLO DE 7" : "ESSE NÃO É";
		System.out.println(message);
		sc.close();
	}
}
