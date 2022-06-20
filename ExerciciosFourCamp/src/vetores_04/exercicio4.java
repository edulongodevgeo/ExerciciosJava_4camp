//4.	Crie um programa que armazene 10 números digitados pelo usuário em dois vetores: um somente para números pares, e outro somente para números ímpares.
//Após, exiba os valores dos dois vetores na tela, em sequência.
//Obs.: As posições que não receberem valores exibirão o número zero. Não se preocupe com isso por enquanto.

package vetores_04;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Integer[] vetor = new Integer[10];
		Integer[] par = new Integer[10];
		Integer[] impar = new Integer[10];
		Integer valor = 0;
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite um valor: ");
			vetor[i] = sc.nextInt();
			
				if(vetor[i] % 2 == 0 && vetor[i] != null) {
					par[i] = vetor[i];
				} else if(vetor[i] % 2 != 0 && vetor[i] != null) {
					impar[i] = vetor[i];
				}
	 			
		}

		System.out.println("Array par: " + Arrays.toString(par));
		System.out.println("Array impar: " + Arrays.toString(impar));

		sc.close();
	}
}
