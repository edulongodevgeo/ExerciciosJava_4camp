//2.	Escreva um programa para encontrar todos os n�meros pares entre 1 e 100. Para saber se um n�mero � par, � necess�rio consultar se o resto da divis�o deste n�mero por 2 � igual � 0 (Operador Java para resto de divis�o: %).



package lacosDeRepeticao_03;

public class exercicio2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
