import java.util.Scanner;

public class dentro_fora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    // Leia um valor inteiro N. Este valor será a quantidade e valores inteiros X que serão lidos em seguida.
    // Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora.

        System.out.print("Quantos números você vai digitar?: ");
        int N = sc.nextInt();

       int dentro = 0;
       int fora = 0;

     for (int i = 1; i <= N; i ++) {

System.out.print("Digite um número: ");
  int numero = sc.nextInt();

if ( numero < 10 || numero > 20) {

fora = fora + 1;
 }

else {

dentro = dentro + 1;
 }

     }
System.out.println(dentro + " DENTRO");
System.out.println(fora + " FORA");

sc.close();

    }
    
}
