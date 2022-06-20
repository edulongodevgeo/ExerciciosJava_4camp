//3. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. 
//Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida. 

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer senha = 1234;
		Integer input = 0;
		
		System.out.println("Digite a senha: ");
		input = teclado.nextInt();
		
		if(input.equals(senha)) {
			System.out.println("Senha correta!");
		} else {
			System.out.println("senha incorreta. Tente novamente!");
		}
		
		teclado.close();
	}
}
