//8. Acrescente as seguintes mensagens à solução do exercício anterior conforme o caso. 
//− Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
//− Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO. 
//

package fluxoCondicional_02;

import java.util.Scanner;

public class exercicio8 {

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
