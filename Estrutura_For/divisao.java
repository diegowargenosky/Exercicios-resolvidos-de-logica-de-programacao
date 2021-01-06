import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        // Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo segundo.
        // Caso não for possível mostre a mensagem "DIVISÃO IMPOSSÍVEL".
        // Usar a estrutura For para fazer mais de uma divisão.

        System.out.print("Quantos casos você vai digitar? ");
		  int N = sc.nextInt();

		for (int i = 0; i < N; i ++) {
			sc.nextLine();

		System.out.print("Entre com o numerador: ");
		 double numerador = sc.nextDouble();

		System.out.print("Entre com o denominador: ");
		  double denominador = sc.nextDouble();

		if (denominador == 0) {
		System.out.println("DIVISAO IMPOSSIVEL");
		 }

		else{
			double divisao = numerador / denominador;
			System.out.println("DIVISAO = " + String.format("%.2f", divisao));
        }
          

        
    }
    sc.close();
    
}
 } 
