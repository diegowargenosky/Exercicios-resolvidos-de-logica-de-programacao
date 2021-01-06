import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um terceiro
        // vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B.
        // Imprima o vetor C gerado.

        System.out.print("Quantos valores vai ter cada vetor?: ");

int N = sc.nextInt();

int [] A = new int [N];
int [] B = new int [N];
int [] C = new int [N];

System.out.println("Digite os valores do vetor A:");

 for(int i = 0; i < N; i ++) {

A[i] = sc.nextInt();
  }

System.out.println("Digite os valores do vetor B:");

 for(int i = 0; i < N; i ++) {

B[i] = sc.nextInt();
  }


System.out.println("\n"+"VETOR RESULTANTE:");

 for(int i = 0; i < N; i ++) {

C[i] = A[i] + B[i];

System.out.println(C[i]);
 }



       sc.close(); 
    }
    
}
