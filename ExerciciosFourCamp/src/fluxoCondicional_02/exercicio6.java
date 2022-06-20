//6. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1 :feminino, 2: masculino, 
//construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas: 
//- para homens: (72.7 * Altura) – 58 - para mulheres: (62.1 * Altura) – 44.7 

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double altura;
		Integer genero;
		
		System.out.println("Informe o sexo: \nDigite 1 - Masculino  \nOu \nDigite2 - Feminino");
		genero = teclado.nextInt();
		System.out.println("Digite a altura para o cálculo \n(utilize virgula apos informar o metro. Ex.: 1,80). \nDIGITE: ");
		altura = teclado.nextDouble();
		
		if(genero.equals(1)) {
			Double result = 0.0;
			result = (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é de %.2f", result);
		} else if (genero.equals(2)) {
			Double result = 0.0;
			result = (62.1 * altura) - 44.7;
			System.out.printf("seu peso ideal é de %.2f", result);
		} else {
			System.out.println("Você digitou algo errado. Tente novamente!");
		}
		
		teclado.close();
	}
}
