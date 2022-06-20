//2. Escreva um programa para ler o ano de nascimento de uma pessoa 
//e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Integer idade;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano que você nasceu: ");
		idade = scanner.nextInt();

		if (2022 - idade >= 16 && 2022 - idade < 18) {
			System.out.println("Voto facultativo!");
		} else if (2022 - idade > 65) {
			System.out.println("Voto facultativo!");
		} else if (2022 - idade >= 18 && 2022 - idade <= 65) {
			System.out.println("Cidadão com idade dentro do perfil de voto obrigatório!");
		} else {
			System.out.println("Voto não permitido/proibido!");
		}

		scanner.close();
	}
}
