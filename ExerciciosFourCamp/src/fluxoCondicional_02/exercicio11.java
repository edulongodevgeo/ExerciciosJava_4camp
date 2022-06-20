//11. Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo, Retângulo ou Obtusângulo. Sendo que: 
//− Triângulo Retângulo: possui um ângulo reto. (igual a 90º) 
//− Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º) 
//− Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)


package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Integer anguloA, anguloB, anguloC;
		
		System.out.println("Digite o angulo A: ");
		anguloA = teclado.nextInt();
		System.out.println("Digite o angulo B: ");
		anguloB = teclado.nextInt();
		System.out.println("Digite o angulo C: ");
		anguloC = teclado.nextInt();
		
		if(anguloA.equals(90) || anguloB.equals(90) || anguloC.equals(90)) {
			System.out.println("R: Triangulo reto.");
		} else if (anguloA > 90 || anguloB > 90 || anguloC > 90) {
			System.out.println("R; Triangulo Obtuso.");
		} else if (anguloA < 90 && anguloB < 90 && anguloC < 90) {
			System.out.println("R: Triangulo Acutangulo.");
		}
		
		
		
		teclado.close();
	}
}
