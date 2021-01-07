import java.util.Scanner;

public class MaiorElemento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
        // de cada linha. Suponha não haver empates.

        System.out.print("Qual a ordem da matriz? ");
		  int N = sc.nextInt();
		  
		int [][] mat = new int [N][N];
		int [] maiorLinha = new int [N];
		
		for(int i = 0; i < N; i ++) {
			for(int j = 0; j < N; j ++) {
				
				System.out.print("Elemento ["+i+","+j+"]: ");
		mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		
		for(int i = 0; i < N; i ++) {
			int maior = mat[i][0];
			
			for(int j = 1; j < N; j ++) {
				 if (maior < mat[i][j]) {
		                maior = mat[i][j];
		            }
			}
			maiorLinha[i] = maior;
		}
		
		for(int i = 0; i < N; i ++) {
			System.out.println(maiorLinha[i]);
		}
		
		sc.close();
        
    }
    
}
