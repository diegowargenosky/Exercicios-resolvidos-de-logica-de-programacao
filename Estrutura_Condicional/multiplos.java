import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite dois numeros inteiros: ");
  int x = sc.nextInt();
  int y = sc.nextInt();

if ( x % y == 0 || y % x == 0) {
 
 System.out.print("São mútiplos");
  }

else {

System.out.print("Não são múltiplos");
  }
  sc.close();

    }
    
}
