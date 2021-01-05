import java.util.Scanner;

public class notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
         double nota2 = sc.nextDouble();

       double notaFinal = nota1+nota2;

    System.out.print("NOTA FINAL = " + String.format("%.1f", notaFinal));

    if (notaFinal < 60.0) {

    System.out.print(" REPROVADO");
    }
    else{
        
        System.out.print(" APROVADO");
    }
    sc.close();
    
}
  }
