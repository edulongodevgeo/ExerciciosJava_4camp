//8.	Crie um programa para ler 3 notas inseridas por um aluno e mostrar a m�dia delas. Caso a m�dia seja menor que 6.0, o console dever� constar sua m�dia + a mensagem de reprovado. Se maior ou igual, conste sua m�dia + mensagem de aprova��o.



package lacosDeRepeticao_03;

import java.util.Scanner;

public class exercicio8 {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			Double valorA, valorB, valorC, media;
			
			System.out.println("Informe a primeira nota: ");
			valorA = teclado.nextDouble();
			System.out.println("Informe a segunda nota: ");
			valorB = teclado.nextDouble();
			System.out.println("Informe a terceira nota: ");
			valorC = teclado.nextDouble();
			
			media = (valorA + valorB + valorC) / 3;
			
			if(media < 6.0) {
				System.out.printf("A media foi de: %.2f", media);
				System.out.println(" Reprovado!");
			} else {
				System.out.printf("A media foi de: %.2f", media);
				System.out.println(" Aprovado!");
			}
			
			
			teclado.close();
		}
}
