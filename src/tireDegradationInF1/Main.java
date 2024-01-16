package tireDegradationInF1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {

		Scanner sc = new Scanner(System.in);

		char tireType = sc.next().charAt(0);
		float dS = sc.nextFloat();
		float dM = sc.nextFloat();
		float dH = sc.nextFloat();
		int r = 0;

		switch (tireType) {
		case 'S':
			r = (int) (80 / dS);
			break;
		case 'M':
			r = (int) (80 / dM);
			break;
		case 'H':
			r = (int) (80 / dH);
			break;
		}

		System.out.println(r);

		sc.close();
	}
}
