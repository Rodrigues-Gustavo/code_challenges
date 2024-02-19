package helpingBart;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String x = sc.nextLine();

		for (int i = n; i >= 1; i--) {
			System.out.println(i + ". " + x);
		}

		sc.close();
	}
}
