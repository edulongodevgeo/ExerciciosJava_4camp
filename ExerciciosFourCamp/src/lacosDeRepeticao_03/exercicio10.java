//10.	Fa�a um programa que pe�a ao usu�rio um n�mero entre 12 e 20. Se a pessoa digitar um n�mero diferente, 
//mostrar a mensagem "entrada inv�lida" e solicitar o n�mero novamente. Se digitar correto mostrar o n�mero digitado.

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
