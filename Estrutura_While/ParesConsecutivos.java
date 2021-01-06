import java.util.Scanner;

public class ParesConsecutivos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
 // O programa deve ler um valor inteiro X indefinidas vezes.(O programa irá parar quando o valor de X for igual a 0).
 // Para cada X lido,imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X se for par.

        System.out.print("Digite um numero inteiro: " );
  int X = sc.nextInt();

while (X != 0) {

if (X % 2 != 0) {



X += 1;
 } 

int soma = 5 * X + 20;
System.out.println("SOMA = " + soma);
System.out.print("Digite um numero inteiro: ");
  X = sc.nextInt();
   
}

sc.close();

    }
    
}
