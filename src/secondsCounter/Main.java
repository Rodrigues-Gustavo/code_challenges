package secondsCounter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {

		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int h = time / 3600;
		int m = (time % 3600) / 60;
		int s = time % 60;

		String formattedTime = String.format("%dh %dm %ds", h, m, s);
		System.out.println(formattedTime);

		sc.close();
	}
}
