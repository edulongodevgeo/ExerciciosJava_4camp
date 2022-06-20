//5. Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente. 

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer primeiroValor, segundoValor, terceiroValor;
		
		System.out.println("Informe seu primeiro valor: ");
		primeiroValor = teclado.nextInt();
		System.out.println("Informe seu segundo valor: ");
		segundoValor = teclado.nextInt();
		System.out.println("Informe seu terceiro valor: ");
		terceiroValor = teclado.nextInt();
		
		if(primeiroValor < segundoValor && primeiroValor < terceiroValor) {
			if(segundoValor < terceiroValor) {
				System.out.println("\nv1 = "+ primeiroValor + " \nv2 = " + segundoValor + " \nv3 = "+ terceiroValor);
			} else {
				System.out.println("\nv1 = "+ primeiroValor + " \nv3 = " + terceiroValor + " \nv2 = "+ segundoValor);
			}
		} else if (segundoValor < primeiroValor && segundoValor < terceiroValor) {
			if(primeiroValor < terceiroValor) {
				System.out.println("\nv2 = "+ segundoValor + " \nv1 = " + primeiroValor + "\nv3 = "+ terceiroValor);
			} else {
				System.out.println("\nv2 = "+ segundoValor + "\nv3 = " + terceiroValor + "\nv1 = "+ primeiroValor);
			}
		} else if (terceiroValor < primeiroValor && terceiroValor < segundoValor) {
			if(primeiroValor < segundoValor) {
				System.out.println("\nv3 = "+ terceiroValor + "\nv1 = " + primeiroValor + "\nv2 = "+ segundoValor);
			} else {
				System.out.println("\nv3 = "+ terceiroValor + "\nv2 = " + segundoValor + "\nv1 = "+ primeiroValor);
		}
		}
		
		
		
		teclado.close();
	}
}
