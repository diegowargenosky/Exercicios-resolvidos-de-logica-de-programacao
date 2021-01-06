import java.util.Scanner;

public class experiencias_cobaias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
        // organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do anom
        // quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
        // Este laboratório utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações,
        // ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade
        // de cobaias utilizadas em cada experimento. Faça um programa que leia um valor N que indica os vários
        // casos de teste que vem a seguir. Cada caso de teste contém um inteiro que representa a quantidade de cobaias
        // utilizadas e uma letra('C','R' ou 'S'), indicando o tipo de cobaia(Rato,Sapo,Coelho).Apresente o total
        // de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas,
        // sendo que o percentual deve ser apresentado com dois dígitos após a vírgula.

        System.out.print("Quantos casos de teste serão digitados? ");
		  int N = sc.nextInt();

		int totalCobaias = 0;
		int totalRatos = 0;
		int totalSapos = 0;
		int totalCoelhos = 0;

		for (int i = 0; i < N; i++) {

		System.out.print("Quantidade de cobaias: ");
		 int qtdeCobaias = sc.nextInt();

		System.out.print("Tipo de cobaia: ");
		  char tipoCobaia = sc.next().charAt(0);

		if (tipoCobaia == 'R') {

		 totalRatos += qtdeCobaias;
		 }

		else if (tipoCobaia == 'S') {

		 totalSapos +=  qtdeCobaias;
		 }

		else {

		 totalCoelhos +=  qtdeCobaias;
		 } 

		totalCobaias = totalCobaias + qtdeCobaias;

}
		
		System.out.println("\n"+"RELATÓRIO FINAL:");
		
		System.out.println("Total: " + totalCobaias+" cobaias");
		  System.out.println("Total de coelhos: " + totalCoelhos);
	    System.out.println("Total de ratos: " + totalRatos);
		  System.out.println("Total de sapos: " + totalSapos);
		   
		 double percentualCoelhos =  (double) totalCoelhos * 100 / totalCobaias;
		 double percentualRatos =  (double) totalRatos * 100 / totalCobaias;
		double percentualSapos =  (double) totalSapos * 100 / totalCobaias;
		 
		 System.out.println("Percentual de coelhos: " + String.format("%.2f", percentualCoelhos)+" %");
		   System.out.println("Percentual de ratos: " + String.format("%.2f", percentualRatos)+" %");
		 System.out.println("Percentual de sapos: " + String.format("%.2f", percentualSapos)+" %");
		
		

        sc.close();
    }
    
}
