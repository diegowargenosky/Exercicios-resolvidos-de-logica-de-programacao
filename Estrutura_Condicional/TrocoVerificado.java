import java.util.Scanner;

public class TrocoVerificado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precoUnitario, qtdeComprada, dinheiroRecebido, troco, faltante;


System.out.print("Preço unitário do produto: ");
  precoUnitario = sc.nextDouble();

System.out.print("Quantidade comprada: ");
  qtdeComprada = sc.nextDouble();

System.out.print("Dinheiro recebido: ");
  dinheiroRecebido = sc.nextDouble();

if (dinheiroRecebido > qtdeComprada * precoUnitario) {

troco = (dinheiroRecebido) - qtdeComprada * precoUnitario;
System.out.print("TROCO = " + String.format("%.2f", troco));
  }

else {

faltante = qtdeComprada * precoUnitario - dinheiroRecebido;
System.out.print("DINHEIRO INSUFICIENTE. FALTAM " + String.format("%.2f", faltante) + " REAIS");
  }
        
    sc.close();


        
    }
    
}
