import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fazer um programa para ler um inteiro N, e depois calcular e mostrar o fatorial de N. //

        System.out.print("Digite o valor de N: ");
	    int n = sc.nextInt();

	    int fatorial = 1;

            for ( int i = n; i > 0; i--) {
	        fatorial *= i;
	    }

        System.out.printf("FATORIAL = " + fatorial);
        sc.close();
        
    }

    
}
