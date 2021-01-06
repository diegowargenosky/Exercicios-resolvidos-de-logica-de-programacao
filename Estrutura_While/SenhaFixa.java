import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cadastre a sua senha com números: ");
        int senhaCadastrada = sc.nextInt();

     System.out.print("Digite a senha: ");
     int senhaDigitada = sc.nextInt();

     while (senhaDigitada != senhaCadastrada) {

      System.out.print("Senha invalida! Tente novamente: ");
      senhaDigitada = sc.nextInt();
 }

     sc.close();
   
        
    }
    
}
