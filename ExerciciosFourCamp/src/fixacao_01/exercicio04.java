package fixacao_01;

//4. Uma parede em formato retangular, cuja altura � hp (altura da parede) e a largura lp (largura da parede) 
//precisa ser coberta por azulejos tamb�m retangulares. O azulejo retangular tem dimens�es ha (altura do azulejo) 
// e la (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp, ha e la, 
//calcule e imprima quanto azulejos com as medidas dadas s�o necess�rios para cobrir a parede dada.

public class exercicio04 {
	public static void main(String[] args) {
        
		//Declarar as vari�veis como double, e sintetizar seus nomes. 
		double hp, lp, ha, la, qtd;
		
		// Criar valores das dimens�es hipot�ticas, mas depois seria legal colocar um scanner.
        hp = 3.5;
        lp = 1.5;
        ha = 0.25;
        la = 0.5;

        //Calculo para retornar a quantidade de azulejos.
        qtd = (hp * lp) / (ha * la);

        System.out.format("Quantidade de azulejos necess�rios para cobrir a parede: %.2f", qtd);     
    }
}
