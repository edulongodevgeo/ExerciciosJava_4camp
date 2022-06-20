package fixacao_01;

//3. Criar um programa que calcule a média de salários de uma empresa, 
//pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

public class exercicio03 {
	public static void main(String[] args) {
        double n1, n2, n3, n4, media;
        
        //Para testar, vamos declarar estes dados. Mas a ideia é pedir por scanner!!
        n1 = 3453.21;
        n2 = 3498.43;
        n3 = 7902.09;
        n4 = 12932.00;

        //media salarial
        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média salarial da empresa é de R$ " + media);
    }
}
