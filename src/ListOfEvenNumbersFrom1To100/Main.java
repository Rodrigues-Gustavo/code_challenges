package ListOfEvenNumbersFrom1To100;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
