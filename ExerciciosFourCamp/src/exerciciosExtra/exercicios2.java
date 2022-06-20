//2.	Imagine uma brincadeira entre dois colegas, na qual um pensa um número e o outro deve fazer chutes até acertar o número imaginado. 
//Como dica, a cada tentativa é dito se o chute foi alto ou baixo. Elabore um algoritmo dentro deste contexto, que leia o número digitado 
//pelo usuário e os chutes, ao final mostre quantas tentativas foram necessárias para descobrir o número.
//Exemplo:
//Número: 85
//Chute número 1: 50
//*** CHUTOU BAIXO ***
//Chute número 2: 62
//*** CHUTOU BAIXO ***
//Chute número 3: 89
//*** CHUTOU ALTO ***
//Chute número 4: 80
//*** CHUTOU BAIXO ***
//Chute número 5: 85
//*** ACERTOU! PARABÉNS! VOCÊ PRECISOU DE 5 CHANCES ***


package exerciciosExtra;

import java.util.Random;
import java.util.Scanner;

public class exercicios2 {

		public static void main(String[] args) {
			Integer numeroAleatorio = new Random().nextInt(10) + 1;
			Integer chutes = 0;
			Integer palpite = -1;
			Scanner teclado = new Scanner(System.in);

			while (numeroAleatorio != palpite) {
				System.out.println("Chute um numero entre 1 e 10");
				palpite = teclado.nextInt();
				chutes++;
				
				if (palpite.equals(numeroAleatorio)) {
					System.out.println("Parabéns!!!");
					System.out.println("Voce chutou " + palpite);
					System.out.println("Voce precisou de " + chutes + " chutes!");
				} else if (palpite < numeroAleatorio) {
					System.out.println("Numero: " + palpite);
					System.out.println("Quantidade de chutes " + chutes);
					System.out.println("*** CHUTOU BAIXO ***");

				} else {
					System.out.println("Numero: " + palpite);
					System.out.println("Quantidade de chutes " + chutes);
					System.out.println("*** CHUTOU ALTO ***");
				}
			}

			teclado.close();
		}
	}
