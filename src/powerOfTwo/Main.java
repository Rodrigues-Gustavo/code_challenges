package powerOfTwo;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 1;

		for (int i = 0; i < n; i++) {
			result *= 2;
		}
		System.out.println(result);
		sc.close();
	}
}
