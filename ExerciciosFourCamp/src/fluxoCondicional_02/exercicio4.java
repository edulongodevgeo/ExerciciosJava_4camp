//4. As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze. 
//Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra. 

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Double valorMaca;
		Integer qtdMaca;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de ma��s que voc� deseja:");
		qtdMaca = teclado.nextInt();
		
		if(qtdMaca >= 12) {
			valorMaca = 0.25;
			System.out.println("O valor total desta compra com desconto ser� de: R$ " + (valorMaca * qtdMaca) + " reais.");
		} else if (qtdMaca < 12) {
			valorMaca = 0.30;
			System.out.println("O valor sem desconto ser� de: R$  " + (valorMaca * qtdMaca) + " reais");
		}
		teclado.close();
	}
}
