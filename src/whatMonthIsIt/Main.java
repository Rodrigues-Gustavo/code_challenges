package whatMonthIsIt;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		Integer numberOfMonth = sc.nextInt();

		String[] months = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		System.out.println((numberOfMonth >= 1 && numberOfMonth <= 12) 
				? months[numberOfMonth - 1]
				: "Número de mês não correspondente");

		sc.close();
	}
}
