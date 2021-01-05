import java.util.Scanner;

public class idades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar os nomes e a idade média
        // entre essas pessoas,com uma casa decimal.
        
        String nome1, nome2;
         int idade1, idade2;
         double media;

  System.out.println("Dados da primeira pessoa:");
   System.out.print("Nome: ");
  nome1 = sc.nextLine();
System.out.print("Idade: ");
  idade1 = sc.nextInt();

sc.nextLine();
System.out.println("Dados da segunda pessoa:");
System.out.print("Nome: ");
  nome2 = sc.nextLine();
System.out.print("Idade: ");
  idade2 = sc.nextInt();

media = (double) idade1 + idade2 / 2;

System.out.print("A idade media de " + nome1 +" e " + nome2 + " é de " + String.format("%.1f", media));

sc.close();


        
    }
    
}
