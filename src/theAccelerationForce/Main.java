package theAccelerationForce;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int space = sc.nextInt();
		int time = sc.nextInt();

		int v = space / time;
		System.out.println(v);

		sc.close();
	}
}
