//1.	Escreva um algoritmo que solicite ao usuário a entrada de 5 números, e que exiba o somatório desses números na tela.
//Após exibir a soma, o programa deve mostrar também os números que o usuário digitou, um por linha.


package vetores_04;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Integer[] soma = new Integer[5];
		Integer somatorio = 0, valor;
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < soma.length; i++) {
			System.out.println("Digite algum valor: ");
			valor = sc.nextInt();
			somatorio += valor;
			soma[i] = valor;
		}
		
		System.out.println("Somatorio: " + somatorio);
		for (Integer integer : soma) {
			System.out.println(integer);
		}
		
		sc.close();
	}
}
