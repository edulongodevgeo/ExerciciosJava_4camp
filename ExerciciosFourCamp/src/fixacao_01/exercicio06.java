package fixacao_01;

//6. Escreva um programa para determinar a quantidade de cavalos necess�rios 
//para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos. 
//Considere cavalos = (m * h / t) / 745,6999.

public class exercicio06 {

	public static void main(String[] args) {
		double m, h, t, cavalos;
        m = 21;
        h = 2.2;
        t = 1.4;

        cavalos = (m * h / t) / 745.6999;

        System.out.println("A quantidade de cavalos necess�rios � " + cavalos);
    }

}
