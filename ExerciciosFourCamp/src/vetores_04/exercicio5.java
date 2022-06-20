//5.	Modifique o programa anterior para não aceitar a entrada do número zero, e requisitar a digitação de outro número neste caso.

package vetores_04;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio5 {

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
