package noMoreTrafficTickets;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double r = n / 0.62137;

		System.out.printf("%.2f\n", (double) r);

		sc.close();
	}
}
