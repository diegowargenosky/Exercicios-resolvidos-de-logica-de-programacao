import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
		  int N = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		  int M = sc.nextInt();
		  
		  int[][] A = new int[N][M];
		  int[][] B = new int[N][M];
		  int[][] C = new int[N][M];
		  
		  System.out.println("Digite os valores da matriz A:");
		  
		  for(int i = 0; i < N;i ++) {
			  for(int j = 0; j < M; j ++ ) {
				  
				  System.out.print("Elemento [" + i +","+ j +"]: ");
				    A[i][j] = sc.nextInt();
			  }
		  }
		  
		  System.out.println("Digite os valores da matriz B: ");  
		  
		  for(int i = 0; i < N;i ++) {
			  for(int j = 0; j < M; j ++ ) {
				  
				  System.out.print("Elemento [" + i +","+ j +"]: ");
				    B[i][j] = sc.nextInt();
			  }
		  
		  
		}
		  
		  System.out.println("MATRIZ SOMA:");
		  
		  for(int i = 0; i < N;i ++) {
			  for(int j = 0; j < M; j ++ ) {
				  
				  C[i][j] = A[i][j] + B[i][j];
			  }
		  
			  
		  }
		  
		  for(int i = 0; i < N;i ++) {
			  for(int j = 0; j < M; j ++ ) {
				  
				  System.out.println(C[i][j]); 	
			  }
			  
                  }
                  sc.close();
	
        
    }
    
}
