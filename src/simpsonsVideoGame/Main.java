package simpsonsVideoGame;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		Double x = sc.nextDouble();
		Double y = sc.nextDouble();
		Double r = x + y;

		System.out.printf("%.2f\n", r);
		sc.close();
	}
}
