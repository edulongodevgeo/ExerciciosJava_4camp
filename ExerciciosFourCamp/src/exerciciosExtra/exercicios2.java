//2.	Imagine uma brincadeira entre dois colegas, na qual um pensa um n�mero e o outro deve fazer chutes at� acertar o n�mero imaginado. 
//Como dica, a cada tentativa � dito se o chute foi alto ou baixo. Elabore um algoritmo dentro deste contexto, que leia o n�mero digitado 
//pelo usu�rio e os chutes, ao final mostre quantas tentativas foram necess�rias para descobrir o n�mero.
//Exemplo:
//N�mero: 85
//Chute n�mero 1: 50
//*** CHUTOU BAIXO ***
//Chute n�mero 2: 62
//*** CHUTOU BAIXO ***
//Chute n�mero 3: 89
//*** CHUTOU ALTO ***
//Chute n�mero 4: 80
//*** CHUTOU BAIXO ***
//Chute n�mero 5: 85
//*** ACERTOU! PARAB�NS! VOC� PRECISOU DE 5 CHANCES ***


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
					System.out.println("Parab�ns!!!");
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
