//9.	Fa�a um programa que mostre a tabuada de um n�mero que seja inserido pelo usu�rio.



package lacosDeRepeticao_03;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer numero;

		System.out.println("Digite um numero: ");
		numero = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}

		sc.close();
	}
}
