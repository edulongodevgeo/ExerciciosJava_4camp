//3.	Crie um programa que solicite a entrada de 10 números pelo usuário, armazenando-os em um vetor, e então monte outro vetor com os valores do primeiro multiplicados por 5.
//Exiba os valores dos dois vetores na tela, simultaneamente, em duas colunas (um em cada coluna), uma posição por linha.


package vetores_04;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Integer[] posicaoElemento = new Integer[10];
		Integer[] posicaoElementox5 = new Integer[10];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < posicaoElemento.length; i++) {
			System.out.println("Digite um valor: ");
			posicaoElemento[i] = sc.nextInt();
			posicaoElementox5[i] = posicaoElemento[i] * 5;
		}

			System.out.println("O Array normal: " + Arrays.toString(posicaoElemento));
			System.out.println("O Array multiplicado por 5: " + Arrays.toString(posicaoElementox5));
		
		sc.close();

	}

}
