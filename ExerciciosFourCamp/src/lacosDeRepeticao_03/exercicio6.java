//6.	Utilizando a estrutura de repeti��o for, fa�a um programa que receba 10 n�meros e conte quantos deles est�o no intervalo [10, 20] e quantos deles est�o fora do intervalo, escrevendo estas informa��es. (DESAFIO)



package lacosDeRepeticao_03;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Integer[] valor = new Integer[10];
		Scanner sc = new Scanner(System.in);
		Integer dentro = 0, fora = 0;

		for (int i = 0; i < valor.length; i++) {
			System.out.println("Digite um numero: ");
			valor[i] = sc.nextInt();
		}

		for (int i = 0; i < valor.length; i++) {
			if (valor[i] >= 10 && valor[i] <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println("Entre 10 e 20 :" + dentro);
		System.out.println("Fora do intevalo :" + fora);
		
		sc.close();
	}
}
