//6.	Modifique novamente o programa anterior, de modo a não exibir na saída os números zero que são mostrados para todas as posições que não receberam nenhum valor durante a atribuição (e portanto estão vazias).

package vetores_04;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[10];
		Integer[] par = new Integer[10];
		Integer[] impar = new Integer[10];
		//Integer valor = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor diferente de 0: ");
			vetor[i] = sc.nextInt();
			
			if (vetor[i] != 0) {
				if (vetor[i] % 2 == 0) {
					par[i] = vetor[i];
				} else if (vetor[i] % 2 != 0) {
					impar[i] = vetor[i];
				}
			} else {
				System.out.println("Você não pode digitar 0. Tente novamente! ");
			}

		}

		System.out.println("Array par: " + Arrays.toString(par));
		System.out.println("Array impar: " + Arrays.toString(impar));

		sc.close();
	}
}
