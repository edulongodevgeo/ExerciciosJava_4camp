//1.	Escreva um algoritmo que solicite ao usu�rio a entrada de 5 n�meros, e que exiba o somat�rio desses n�meros na tela.
//Ap�s exibir a soma, o programa deve mostrar tamb�m os n�meros que o usu�rio digitou, um por linha.


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
