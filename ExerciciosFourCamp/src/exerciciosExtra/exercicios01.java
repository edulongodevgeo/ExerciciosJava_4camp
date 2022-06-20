// 1.	Três candidatos concorreram a uma eleição (A, B, C). O usuário deve informar quantos votos cada candidato recebeu, 
//quantos foram os votos brancos e quantos foram os votos nulos. O algoritmo deve calcular e informar: o número total de eleitores, 
//o percentual de votos que cada candidato recebeu (em relação ao número total de eleitores), o percentual de brancos e o percentual de nulos.

package exerciciosExtra;

import java.util.Scanner;

public class exercicios01 {

	public static void main(String[] args) {
		Integer candidatoA, candidatoB, candidatoC, nulos, brancos, totalEleitores;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os votos do candidato A: ");
		candidatoA = sc.nextInt();
		System.out.println("Informe os votos do candidato B: ");
		candidatoB = sc.nextInt();
		System.out.println("Informe os votos do candidato C: ");
		candidatoC = sc.nextInt();
		System.out.println("Informe os votos nulos: ");
		nulos = sc.nextInt();
		System.out.println("Informe os votos em branco: ");
		brancos = sc.nextInt();
		
		totalEleitores = candidatoA + candidatoB + candidatoC + nulos + brancos;
		
		candidatoA = (100 * candidatoA) / totalEleitores;
		candidatoB = (100 * candidatoB) / totalEleitores;
		candidatoC = (100 * candidatoC) / totalEleitores;
		nulos = (100 * nulos) / totalEleitores;
		brancos = (100 * brancos) / totalEleitores;
		
		
		System.out.println("Na votação o total de eleitores foi " + totalEleitores);
		System.out.println("O candidato A recebeu " + candidatoA + "% dos votos.");
		System.out.println("O candidato B recebeu " + candidatoB + "% dos votos.");
		System.out.println("O candidato C recebeu " + candidatoC + "% dos votos.");
		System.out.println("Os votos nulos totalizaram " + nulos + "% dos votos.");
		System.out.println("Os votos em branco totalizaram " + brancos + "% dos votos.");
		
		
		sc.close();
	}
}
