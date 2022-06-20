package fixacao_01;

import java.util.Scanner;

//1. Escreva um programa que, com base em uma temperatura em graus celsius, 
//a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), 
//seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

public class exercicio01 {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit, Reaumur, Rankine, Kelvin; //
		
		//Conversão de Celsius para Fahrenheit
		System.out.print("Conversor de temperatura: Graus Celsius -> Fahrenheit\n"); //Pronto, bem mais simples!
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();		
		Fahrenheit = ( 9 * Celsius + 160 ) / 5;
		System.out.print("\n A medida convertida é " + Fahrenheit + "ºF\n");
		
		System.out.println("\n --------------------------------------------- \n");
		
		//Conversão de Celsius para Réaumur
		System.out.print("\nConversor de temperatura: Graus Celsius -> Reaumur\n"); //Pronto, bem mais simples!
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();		
		Reaumur = Celsius * 0.8;
		System.out.print("\n A medida convertida é " + Reaumur + "ºRe\n");
		
		System.out.println("\n --------------------------------------------- \n");
		
		//Conversão de Celsius para Kelvin
		System.out.print("\nConversor de temperatura: Graus Celsius -> Kelvin\n"); //Pronto, bem mais simples!
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();		
		Kelvin = Celsius + 273.15;
		System.out.print("\n A medida convertida é " + Kelvin + "ºK\n");
		
		System.out.println("\n --------------------------------------------- \n");
		
		//Conversão de Celsius para Rankine
		System.out.print("\nConversor de temperatura: Graus Celsius -> Rankine\n"); //Pronto, bem mais simples!
		System.out.print("Digite a temperatura em Celsius: ");
		Celsius = entrada.nextDouble();		
		Rankine = Celsius * 1.8 + 32 + 459.67f;
		System.out.format("\n A medida convertida é %.2f", Rankine);
		System.out.print("ºRa\n");
		
	    entrada.close();

	}

}
