//4. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. 
//Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra. 

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Double valorMaca;
		Integer qtdMaca;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de maçãs que você deseja:");
		qtdMaca = teclado.nextInt();
		
		if(qtdMaca >= 12) {
			valorMaca = 0.25;
			System.out.println("O valor total desta compra com desconto será de: R$ " + (valorMaca * qtdMaca) + " reais.");
		} else if (qtdMaca < 12) {
			valorMaca = 0.30;
			System.out.println("O valor sem desconto será de: R$  " + (valorMaca * qtdMaca) + " reais");
		}
		teclado.close();
	}
}
