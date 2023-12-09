package simpleSum;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {

		Scanner sc = new Scanner(System.in);
		Integer aNumber = sc.nextInt();
		Integer aNumberTwo = sc.nextInt();

		List<Integer> integers = Arrays.asList(aNumber, aNumberTwo);
		Integer sum = integers.stream().reduce(0, (a, b) -> a + b);

		System.out.println(sum);

		sc.close();
	}
}
