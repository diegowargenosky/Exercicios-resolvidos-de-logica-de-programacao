import java.util.Scanner;

public class par_impar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
        // Para cada valor lido, mostre uma mensagem dizendo se este valor é PAR ou IMPAR,e se é POSITIVO ou NEGATIVO.

        System.out.print("Quantos números você vai digitar?: ");
        int N = sc.nextInt();
      
      for ( int i = 0; i < N; i++) {
      
      
      
      System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero == 0){
            System.out.println("NULO");
        }
      
      else if (numero % 2 == 0 && numero > 0) {
      System.out.println("PAR POSITIVO");
       }
      
       if (numero % 2 == 0 && numero < 0) {
      System.out.println("PAR NEGATIVO");
       }
      
      else if (numero % 2 != 0 && numero > 0) {
      System.out.println("IMPAR POSITIVO");
       }
      
      if (numero % 2 != 0 && numero < 0) {
      System.out.println("IMPAR NEGATIVO");
       }
    
}
   sc.close();

 }
}
