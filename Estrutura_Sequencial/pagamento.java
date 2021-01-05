import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fazer um programa que leia o nome de um funcionário, o valor que ele recebe por hora
        // e a quantidade de horas trabalhadas por ele. Ao final, mostrar o valor do pagamento do funcionário 
        // junto do nome.

        String nome;
        int horasTrabalhadas;
        double valorHora, pagamento;

System.out.print("Nome: ");
  nome = sc.nextLine();

System.out.print("Valor por hora: ");
  valorHora = sc.nextDouble();
 
System.out.print("Horas trabalhadas: ");
  horasTrabalhadas = sc.nextInt();

pagamento = valorHora * horasTrabalhadas;
 
System.out.print("\n"+"O pagamento para " + nome + " deve ser " + String.format("%.2f", pagamento)+ " R$.");

sc.close();
        
    }
    
}
