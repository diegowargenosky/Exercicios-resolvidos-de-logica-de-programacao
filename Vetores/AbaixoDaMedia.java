import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        // Fazer um programa para ler um número inteiro N e depois um vetor de N números reais.
        // Em seguida, mostrar na tela a média aritmética de todos os elementos com três casas decimais.
        // Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

        System.out.print("Quantos elementos vai ter o vetor?: ");
  int N = sc.nextInt();

double [] vet = new double [N];

for (int i = 0; i < N; i ++) {

System.out.print("Digite um numero: ");
   vet[i] = sc.nextDouble();
   
  }

System.out.println();

double somaVetor = 0;
for (int i = 0; i < N; i ++) {

somaVetor = vet[i] + somaVetor;

 }

double mediaVetor = somaVetor / N;
System.out.println("MEDIA DO VETOR = " + String.format("%.3f", mediaVetor));

System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

for(int i = 0; i < N; i ++) {

if(vet[i] < mediaVetor) {

System.out.println(String.format("%.1f", vet[i]));
 
 }
   }

     sc.close();

    }
    
}
