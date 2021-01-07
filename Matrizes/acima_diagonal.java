import java.util.Scanner;

public class acima_diagonal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Ler um inteiro N(máximo = 10) e uma matriz quadrada de de ordem N contendo números inteiros.
        // Mostrar a soma dos elementos acima da diagonal principal.

        
		System.out.print("Qual a ordem da matriz? ");
        int N = sc.nextInt();
        
       int [][] mat = new int [N][N];
       
       for(int i = 0; i < N; i ++) {
           for(int j = 0; j < N; j ++) {
               
               System.out.print("Elemento ["+i+","+j+"]: ");
          mat[i][j] = sc.nextInt();
           }
       }
       
      int soma = 0;
       
       for(int i = 0; i < N; i ++) {
          
// Para este exercício a variável j recebe o i + 1 pois é o número da linha + 1 //
// A coluna começa a ser varrida em uma posição maior do que a da linha //

           for(int j = i + 1; j < N; j ++) {
      
               soma = soma + mat[i][j];
           }
             }
       
       System.out.print("SOMA ACIMA DOS ELEMENTOS DA DIAGONAL PRINCIPAL = " + soma);
       sc.close();
  

    }
    
}
