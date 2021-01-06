import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uma operadora de telefonia cobra R$ 50,00 por um plano básico que dá direito a 100 minutos de telefone.
        // Cada minuto que exceder a franquia de 100 minutos custa R$ 2,00. Fazer um programa para ler a quantidade
        // de minutos que uma pessoa consumiu e mostrar o valor a ser pago.

        int qtdeMins;
        double valoraPagar, valoraMais;


System.out.print("Digite a quantidade de minutos: ");
  qtdeMins = sc.nextInt();

if (qtdeMins <= 100) {

valoraPagar = 50.00;
System.out.print("Valor a pagar = R$ " + String.format(" %.2f", valoraPagar));
  }

else {
 
valoraMais = (qtdeMins - 100) * 2 + 50;
System.out.print("Valor a pagar = R$ " + String.format(" %.2f", valoraMais));
  }

  sc.close();
     
    }
    
}
