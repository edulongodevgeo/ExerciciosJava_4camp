package fixacao_01;

//3. Criar um programa que calcule a m�dia de sal�rios de uma empresa, 
//pedindo ao usu�rio a grade de funcion�rios e os sal�rios, e devolvendo a m�dia salarial.

public class exercicio03 {
	public static void main(String[] args) {
        double n1, n2, n3, n4, media;
        
        //Para testar, vamos declarar estes dados. Mas a ideia � pedir por scanner!!
        n1 = 3453.21;
        n2 = 3498.43;
        n3 = 7902.09;
        n4 = 12932.00;

        //media salarial
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A m�dia salarial da empresa � de R$ " + media);
    }
}
