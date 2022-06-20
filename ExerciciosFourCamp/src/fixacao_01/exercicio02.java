package fixacao_01;
import java.util.Scanner;

//2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
//Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. m�dia de altura dos homens;
//c. o n�mero de mulheres.


public class exercicio02 {
	public static void main(String[] args) {

	//criar o scanner
	Scanner entrada = new Scanner(System.in);

	//criar as vari�veis
	//P.s.: Em JAVA, h� vari�veis que devem ser criadas e INICIALIZADAS com um valor "inicial", por isso o " = 0".
	int sexo, qtMulheres = 0, qtHomens = 0;
    float altura, somaH = 0, mediaHomens, maior = 0, menor = 0;

    //l�gica implementada
    for (int i=0; i<2; i++) {
        System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
        sexo = entrada.nextInt();
        System.out.print("Digite a altura em cent�metros (exemplo, 180cm equivale a 1,80m): ");
        altura = entrada.nextFloat();
        if (sexo == 1) {
            qtMulheres++;
        } else if (sexo == 2) {
            qtHomens++;
            somaH = somaH + altura;
        } else {
            System.out.println("Op��o sexo inv�lido!");
        }
        if (altura > maior) {
             maior = altura;
        } else if (altura < menor){
            menor = altura;
        }
    }
    mediaHomens = somaH / qtHomens;

    System.out.println("A maior altura do grupo � de " + maior + " cm, e a menor � de " + menor + " cm.");
    System.out.format("A m�dia de altura dos homens � %.2f", mediaHomens);
    System.out.print(" cm.\n");
    System.out.println("O n�mero de mulheres � " + qtMulheres);

    entrada.close();
}
}
