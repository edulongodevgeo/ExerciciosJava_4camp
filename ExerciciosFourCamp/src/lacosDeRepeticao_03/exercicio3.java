//3.	Faça um programa que leia um valor inteiro inserido pelo usuário e resulte na tabuada de 1 a 10 do valor lido. Aceitar somente valores entre 1 e 10.



package lacosDeRepeticao_03;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;

		System.out.println("Digite um numero de 1 a 10: ");
		numero = sc.nextInt();

		if (numero < 1 || numero > 10) {
			System.out.println("Erro! Tente novamente.");
		} else {
			for (int i = 1; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + (numero * i));
			}

		}

		sc.close();
	}
}
