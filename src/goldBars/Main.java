package goldBars;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int result = 0;

		while (n != 0) {
			result += n;

			n = sc.nextInt();
		}

		System.out.println(result);
		sc.close();
	}
}
