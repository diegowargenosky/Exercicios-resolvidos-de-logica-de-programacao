import java.util.Scanner;

public class troco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     //Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia//

     double preco, dinheiroRecebido, troco;
     int qtdeComprada;

System.out.print("Preço unitário do produto: ");
  preco = sc.nextDouble();

System.out.print("Quantidade comprada: ");
  qtdeComprada = sc.nextInt();

System.out.print("Dinheiro recebido: ");
  dinheiroRecebido = sc.nextDouble();

troco = (double) dinheiroRecebido - (qtdeComprada * preco);
System.out.print("TROCO = " + String.format("%.2f", troco));

 sc.close();

        
    }
    
}
