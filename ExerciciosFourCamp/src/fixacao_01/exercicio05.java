package fixacao_01;

//5. Calcular e apresentar o valor do volume de uma lata de �leo, 
//utilizando f�rmula: V = 3.14159 * R * R * A, 
//em que as vari�veis: V, R e A representam respectivamente o volume, o raio e a altura.
//Vamos declarar as vari�veis V, R e A como double e definir um valor qualquer para as vari�veis de altura e de raio. 
//Agora vamos escrever a f�rmula, conforme dita no enunciado e, em seguida, exibir na tela uma mensagem 
//contendo o resultado do volume encontrado.


public class exercicio05 {

	public static void main(String[] args) {
		double V, R, A;
        R = 3.2;
        A = 4.9;

        V = 3.14159 * R * R * A;
        System.out.println("O volume da lata de �leo � de " + V + " m�");

	}

}
