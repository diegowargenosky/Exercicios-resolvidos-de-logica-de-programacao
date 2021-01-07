import java.util.Scanner;

public class MatrizGeral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    // Ler uma matriz de ordem N, contendo números reais. Em seguida, fazer as seguintes ações:
    
    // a) calcular e imprimir a soma de todos os elementos positivos da matriz.
    // b) fazer a leitura do índice de uma linha da matriz e,daí,imprimir todos os elementos desta linha.
    // c) fazer a leitura do índice de uma coluna da matriz,e daí, imprimir todos os elementos desta coluna.
    // d) imprimir os elementos da diagonal principal da matriz.
    // e) alterar a matriz elevando ao quadrado todos os números negativos da mesma.Em seguida imprimir a matriz alterada.

        System.out.print("Qual a ordem da matriz? ");
  int N = 	sc.nextInt();

double[][] mat = new double[N][N];

for(int i = 0; i < N; i++) {
  for(int j = 0; j < N; j ++) {

System.out.print("Elemento [" + i +"," + j +"]: ");
  mat[i][j] = sc.nextDouble();

}
  }


double somaPositivos = 0;

for(int i = 0; i < N; i++) {
  for(int j = 0; j < N; j ++) {

if(mat[i][j] > 0) {

somaPositivos = somaPositivos + mat[i][j];
 }

}
  }

System.out.print("\n"+"\n"+"Soma dos positivos: " + somaPositivos);


System.out.print("\n"+"\n"+"Escolha uma linha: ");
  int linha = sc.nextInt();

	System.out.print("LINHA ESCOLHIDA: ");

		  for(int i = 0; i < N; i++) {
                    System.out.print(mat[linha][i]+" ");
		      }



System.out.print("\n"+"\n"+"Escolha uma coluna: ");
  int coluna = sc.nextInt();

System.out.print("\n"+"\n"+"COLUNA ESCOLHIDA: ");

for(int i = 0; i < N; i ++) {
  System.out.print(mat[i][coluna]+" ");
   }


System.out.print("\n"+"\n"+"DIAGONAL PRINCIPAL: ");

for(int i = 0; i < N; i ++) {
  System.out.print(mat[i][i]+ " ");
   }





System.out.println("\n"+"\n"+"MATRIZ ALTERADA:");

for(int i = 0; i < N; i++) {
    System.out.println();
  for(int j = 0; j < N; j ++) {

if(mat[i][j] < 0) {

mat[i][j] = Math.pow(mat[i][j],2);
 }

System.out.print(mat[i][j]+" ");

}
  }
  sc.close();
      
  }
}
