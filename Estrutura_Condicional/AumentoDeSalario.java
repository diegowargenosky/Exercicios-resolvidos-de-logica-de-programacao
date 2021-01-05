import java.util.Scanner;

public class AumentoDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Uma empresa vai conceder um aumento percentual de salário aos seus funcionários dependendo de quanto
        // cada pessoa ganha, conforme está abaixo. Fazer um programa para ler o salário de uma pessoa,daí mostrar
        // qual o novo salário desta pessoa depois do aumento,quanto foi o aumento e qual a porcentagem do aumento.

       // SALÁRIO ATUAL                        AUMENTO
      // Até R$ 1000.00                         20 %
     // Acima R$ 1000.00 até R$ 3000.00         15 %
    // Acima de R$ 3000.00 até R$ 8000.00       10 %
   // Acima de R$ 8000.00                       5%

        double salario, novoSalario, aumento;
        int porcentagem;
                

		System.out.print("Digite o salário da pessoa: ");
		  salario = sc.nextDouble();

		if ( salario <= 1000.00) {

		porcentagem = 20;
		aumento = salario * porcentagem / 100;
		novoSalario = salario + aumento;

		System.out.println("Novo salário = R$ " + String.format("%.2f", novoSalario));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.println("Porcentagem = "+ porcentagem + "%");
		 }

		else if ( salario > 1000.00 && salario <= 3000.00) {

		porcentagem = 15;
		aumento = salario * porcentagem / 100;
		novoSalario = salario + aumento;

		System.out.println("Novo salário = R$ " + String.format("%.2f", novoSalario));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.println("Porcentagem = " + porcentagem + "%");
		 }

		if ( salario > 3000.00 && salario <= 8000.00) {

		porcentagem = 10;
		aumento = salario * porcentagem / 100;
		novoSalario = salario + aumento;

		System.out.println("Novo salário = R$ " + String.format("%.2f", novoSalario));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.println("Porcentagem =  " + porcentagem + "%");
		}

		else if ( salario > 8000.00) {

		porcentagem = 5;
		aumento = salario * porcentagem / 100;
		novoSalario = salario + aumento;

		System.out.println("Novo salário = R$ " + String.format("%.2f", novoSalario));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
        System.out.println("Porcentagem =  " + porcentagem + "%");
        
        sc.close();
    }
    
      }
         }
 