import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faça um programa que leia N números reais e armazene em um vetor. Em seguida, mostrar na tela o maior
        // número do vetor. Mostrar também a posição do maior elemento no vetor.

        System.out.print("Quantos numeros você vai digitar? ");
  int N = sc.nextInt();

double [] vet = new double [N];

for (int i = 0; i < N; i ++) {

System.out.print("Digite um numero: ");
  vet[i] = sc.nextDouble();
  }

double maiorValor = vet[0];
int posMaior = 0;

for (int i = 0; i < N; i ++) {

if ( vet[i] > maiorValor) {

maiorValor = vet[i];
posMaior = i;
 }
   }


System.out.println("\n"+"MAIOR VALOR = " + String.format("%.1f", maiorValor));
System.out.print("POSIÇÃO DO MAIOR VALOR = " + posMaior);


sc.close();

        
    }
    
}
