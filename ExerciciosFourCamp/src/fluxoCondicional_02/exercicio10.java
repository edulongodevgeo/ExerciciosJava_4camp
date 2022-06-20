//10. Escreva um programa que leia as medidas dos lados de um triângulo e escreva se ele é Equilátero, Isósceles ou Escaleno. Sendo que: 
//− Triângulo Equilátero: possui os 3 lados iguais. 
//− Triângulo Isóscele: possui 2 lados iguais. 
//− Triângulo Escaleno: possui 3 lados diferentes. 


package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Integer ladoA, ladoB, ladoC;
		
		System.out.println("Digite a medida do lado A: ");
		ladoA = teclado.nextInt();
		System.out.println("Digite a medida do lado B: ");
		ladoB = teclado.nextInt();
		System.out.println("Digite a medida do lado C: ");
		ladoC = teclado.nextInt();
		
		if(ladoA.equals(ladoB) && ladoA.equals(ladoC)) {
			System.out.println("R: Triangulo Equilatero!");
		} else if (ladoA.equals(ladoB) || ladoA.equals(ladoC)) {
			System.out.println("R: Triangulo Isoceles!");
		} else {
			System.out.println("R: Triangulo Escaleno!");
		}
		
		teclado.close();
	}

}
