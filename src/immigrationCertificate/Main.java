package immigrationCertificate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();

		if (p >= 0 && p % 42 == 0) {
			System.out.printf("Sim");
		} else {
			System.out.printf("Nao");
		}
		
		sc.close();
	}
}
