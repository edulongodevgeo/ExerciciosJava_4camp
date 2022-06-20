//6.	Utilizando a estrutura de repetição for, faça um programa que receba 10 números e conte quantos deles estão no intervalo [10, 20] e quantos deles estão fora do intervalo, escrevendo estas informações. (DESAFIO)



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
