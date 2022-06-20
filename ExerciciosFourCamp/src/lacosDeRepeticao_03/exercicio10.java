//10.	Faça um programa que peça ao usuário um número entre 12 e 20. Se a pessoa digitar um número diferente, 
//mostrar a mensagem "entrada inválida" e solicitar o número novamente. Se digitar correto mostrar o número digitado.

package lacosDeRepeticao_03;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer input = 0;
		
		do {
			System.out.println("Informe um numero entre 12 e 20: ");
			input = sc.nextInt();
			
			if(input < 12 || input > 20) {
				System.err.println("Entrada invalida, tente novamente");
			}
			
			System.out.println("O numero digitado foi " + input);
			
		} while (input > 20 || input < 12);
		
		sc.close();
	}
}
