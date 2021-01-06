import java.util.Scanner;

public class sequencia_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leia um valor inteiro N. Em seguida mostre os ímpares de 1 até N, um valor por linha,inclusive o N se for o caso //

        System.out.print("Digite o valor de N: ");
          int N = sc.nextInt();
          
          System.out.println("Sequência dos números ímpares:");
		  
		  for (int i = 1; i <= N; i ++) {
			if (i % 2 != 0) {
			  System.out.println(i);
		  }
		  
    }
    sc.close();
    
}
}
