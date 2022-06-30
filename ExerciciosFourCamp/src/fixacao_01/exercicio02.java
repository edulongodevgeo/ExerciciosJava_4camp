package fixacao_01;
import java.util.Scanner;

//2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
//Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.

	import java.util.Scanner;

	public class exercicio02 {

	    public static void main(String[] args) {

	        Double[] altura = new Double[10];
	        String[] sexo = new String[10];
	        Integer mediaHomens = 0;

	        Scanner sc = new Scanner(System.in);

	        for (int i = 0; i < 10; i++) {
	            System.out.println("Digite a altura da " + (i + 1) + "ª pessoa: ");
	            altura[i] = sc.nextDouble();
	            System.out.println("Digite o sexo da " + (i + 1) + "ª pessoa (M ou F - maiúsculo): ");
	            sexo[i] = sc.next();
	        }

	        Double maiorAltura = 0.0;
	        Double menorAltura = 500.0;
	        for (int i = 0; i < 10; i++) {
	            if (altura[i] > maiorAltura) {
	                maiorAltura = altura[i];
	            } else if (altura[i] < menorAltura) {
	                menorAltura = altura[i];
	            }
	        }
	        System.out.println("Maior altura: " + maiorAltura);
	        System.out.println("Menor altura: " + menorAltura);

	        Double mediaAlturaHomens = 0.0;
	        for (int i = 0; i < 10; i++) {
	            if (sexo[i].equals("M")) {
	                mediaAlturaHomens += altura[i];
	            }
	            if (sexo[i].equals("M")) {
	                mediaHomens++;
	            }
	        }
	        System.out.println("Média de altura dos homens: " + mediaAlturaHomens / mediaHomens);

	        Integer quantidadeMulheres = 0;
	        for (int i = 0; i < 10; i++) {
	            if (sexo[i].equals("F")) {
	                quantidadeMulheres++;
	            }
	        }
	        System.out.println("Número de mulheres: " + quantidadeMulheres);
	    }
	}
