import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Faça um programa para ler um número indeterminado de dados,contendo cada um, a idade de um indivíduo.
        // O último dado, que não entrará nos cálculos, contém um valor de idade negativa.
        // Calcular e imprimir a idade média deste grupo de indivíduos.
        // Se for entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSÍVEL CALCULAR".

        System.out.println("Digite as idades:");
        int idade = sc.nextInt();

if (idade < 0) {

System.out.print("Impossivel calcular");
 }

else {
  

int soma = 0;
int cont = 0;

while (idade >= 0) {

soma += idade;
cont += 1;

idade = sc.nextInt();
 }


  double media = (double) soma / cont;
System.out.print("MEDIA = " + String.format("%.2f", +media));
 }

 sc.close();
     
    }
    
}
