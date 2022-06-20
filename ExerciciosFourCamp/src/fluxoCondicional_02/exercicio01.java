//1. Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles. 

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer a, b;

		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();

		if (a > b) {
			System.out.println("O valor de A = " + a + " é maior do que o valor de B = " + b);
		} else {
			System.out.println("O valor de B = " + b + " é maior do que o valor de A = " + a);
		}

		sc.close();

	}
}
