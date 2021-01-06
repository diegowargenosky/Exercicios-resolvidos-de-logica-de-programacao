import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa.
        // Para conseguir, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala
        // vai ser informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala
        // com duas casas decimais.


        double F, C;
        System.out.print("Você vai digitar a temperatura em qual escala (C/F)?");
   char escala = sc.next().charAt(0); 

if ( escala == 'F') {

System.out.print("Digite a temperatura em Fahrenheit: ");
   F = sc.nextDouble();
    C = 5.0 / 9.0 * (F - 32.0);
System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", C));
 }

else {

System.out.print("Digite a temperatura em Celsius: ");
  C = sc.nextDouble();
F = 9.0 * C / 5.0 + 32.0;
 System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", F));




    }
    sc.close();
    
}
  }