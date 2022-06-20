//4.	Crie um programa que leia várias idades e calcule a média entre elas. Caso a maioria seja maior de 18 anos, o console deve mostrar “Aqui tem mais adultos”, se contrário, mostrar outra mensagem.



package lacosDeRepeticao_03;

import java.util.Scanner;

public class exercicio4 {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Integer idade = 0, contador = 0, opcao = -1, media;

			while (opcao != 0) {
				System.out.println("Digite uma idade: ");
				idade += teclado.nextInt();
				contador++;
				System.out.println("Digite 0 (zero) para sair. \nDigite qualquer nunero: ");
				opcao = teclado.nextInt();
			}

			media = idade / contador;

			if (media >= 18) {
				System.out.println("Adultos em maior quantidade.");
			} else {
				System.out.println("Jovens em maior quantidade.");
			}

			teclado.close();
		}
}
