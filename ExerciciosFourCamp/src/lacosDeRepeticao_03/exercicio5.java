//5.	Faça um programa que leia 10 números inseridos pelo usuário e imprimir quantos deles são pares e quantos são ímpares.



package lacosDeRepeticao_03;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Integer[] valor = new Integer[10]; //Array criado
		Scanner teclado = new Scanner(System.in);
		Integer par = 0, impar = 0;

		for (int i = 0; i < valor.length; i++) {
			System.out.println("Digite um numero: ");
			valor[i] = teclado.nextInt();
		}

		for (int i = 0; i < valor.length; i++) {
			if (valor[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Quantidade par: " + par);
		System.out.println("Quantidade impar: " + impar);

		teclado.close();
	}
}
