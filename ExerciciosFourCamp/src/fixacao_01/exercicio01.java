package fixacao_01;

import java.util.Scanner;

//1. Escreva um programa que, com base em uma temperatura em graus celsius, 
//a converta e exiba em Kelvin (K), R�aumur (Re), Rankine (Ra) e Fahrenheit (F), 
//seguindo as f�rmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

public class exercicio01 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit, Reaumur, Rankine, Kelvin; //
		
		//Convers�o de Celsius para Fahrenheit
		System.out.print("Conversor de temperatura: Graus Celsius -> Fahrenheit\n"); //Pronto, bem mais simples!
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;
		System.out.print("\n A medida convertida � " + Fahrenheit + "�F\n");
		
		System.out.println("\n --------------------------------------------- \n");
		
		//Convers�o de Celsius para R�aumur
		System.out.print("\nConversor de temperatura: Graus Celsius -> Reaumur\n"); //Pronto, bem mais simples!
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();		
		Reaumur = Celsius * 0.8;
		System.out.print("\n A medida convertida � " + Reaumur + "�Re\n");
		
		System.out.println("\n --------------------------------------------- \n");
		
		//Convers�o de Celsius para Kelvin
		System.out.print("\nConversor de temperatura: Graus Celsius -> Kelvin\n"); //Pronto, bem mais simples!
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();		
		Kelvin = Celsius + 273.15;
		System.out.print("\n A medida convertida � " + Kelvin + "�K\n");
		
		System.out.println("\n --------------------------------------------- \n");
		
		//Convers�o de Celsius para Rankine
		System.out.print("\nConversor de temperatura: Graus Celsius -> Rankine\n"); //Pronto, bem mais simples!
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();		
		Rankine = Celsius * 1.8 + 32 + 459.67f;
		System.out.format("\n A medida convertida � %.2f", Rankine);
		System.out.print("�Ra\n");
		
	    entrada.close();

	}

}
