import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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
