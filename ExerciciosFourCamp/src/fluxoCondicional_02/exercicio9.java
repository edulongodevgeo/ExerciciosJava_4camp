// 9. Escreva um programa para ler 3 valores inteiros e escrever o maior deles. Considere que o usu�rio n�o informar� valores iguais. 

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer a,b,c;
		
		System.out.println("Informe o valor de A: ");
		a = teclado.nextInt();
		System.out.println("Informe o valor de B: ");
		b = teclado.nextInt();
		System.out.println("Informe o valor de C: ");
		c = teclado.nextInt();
		
		if (a > b && a > c) {
			System.out.println("O maior valor � A: " + a);
		} else if (b > a && b > c) {
			System.out.println("O maior valor � B: " + b);
		} else {
			System.out.println("O maior valor � C: " + c);
		}
		
		
		teclado.close();
	}
}
