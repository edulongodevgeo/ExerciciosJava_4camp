//2.	Escreva um algoritmo que solicite ao usuário a entrada de 5 nomes, e que exiba a lista desses nomes na tela.
//Após exibir essa lista, o programa deve mostrar também os nomes na ordem inversa em que o usuário os digitou, um por linha.


package vetores_04;

import java.util.Scanner;

public class exercicio2 {

		public static void main(String[] args) {
			
			String[] nomes = new String[5];
			Scanner teclado = new Scanner(System.in);
			
			for(int i = 0; i < nomes.length; i++) {
				System.out.println("Digite um nome: ");
				nomes[i] = teclado.nextLine();
			}
			
			for (String nome : nomes) {
				System.out.println("Normal: " + nome);
				
				String reverse = new StringBuffer(nome).reverse().toString();
				System.out.println(reverse);
			}
			
//			for(int i = 4; i >= 0; i--) {
//				System.out.println("Reverso: " + nomes[i]);
//				String reverse = new StringBuffer(i).reverse().toString();
//				System.out.println(reverse);
//			}
			
			
			teclado.close();
			
		}
}
