package sumAListOfNumbers;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		int tamanho = sc.nextInt();
		int soma = 0;
		int[] numeros = new int[tamanho];

		for (int i = 0; i < tamanho; i++) {
			numeros[i] = sc.nextInt();
		}

		for (int i = 0; i < tamanho; i++) {
			soma += numeros[i];
		}

		System.out.println(soma);
		
		sc.close();
	}
}
