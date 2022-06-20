//7. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o seguinte: 
//− Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
//− Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
//− Se o número de lados for igual a 5 escrever PENTÁGONO. 


package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer qtdLados, lado, area;
		
		System.out.println("Digite a quantidade de lado de seu poligono: ");
		qtdLados = teclado.nextInt();
		System.out.println("Digite a medida do lado de seu polígono em centimetros: ");
		lado = teclado.nextInt();
		
		if(qtdLados.equals(3)) {
			area = lado * qtdLados;
			System.out.println("A área do polígono é: " + area + "cm.");
		} else if (qtdLados.equals(4)) {
			area = lado * qtdLados;
			System.out.println("A área do polígono é: " + area + "cm.");
		} else if (qtdLados.equals(5)) {
			area = lado * qtdLados;
			System.out.println("A área do polígono é: " + area + "cm.");
		} else if (qtdLados < 3){
			System.out.println("Talvez isto não seja um polígono! haha");
		} else {
			System.out.println("Erro. Não foi possível identificar... ");
		}
		
		teclado.close();
	}
}
