import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // Fazer um programa para ler três medidas: A, B e C. Em seguida,calcular e mostrar(Com quatro casas decimais):
    // a) a área do quadrado que tem lado A 
    // b) a área do triângulo retângulo que tem base A e altura B
    // c) a área do trapézio que tem bases A e B, e altura C.

        double A, B, C, quadrado,triangulo,trapezio;

System.out.print("Digite a medida A: ");
  A = sc.nextDouble();

System.out.print("Digite a medida B: ");
  B = sc.nextDouble();

System.out.print("Digite a medida C: ");
  C = sc.nextDouble();

quadrado = A * A;
triangulo = (A * B) / 2;
trapezio =  (A + B) / 2 * C;

System.out.println("AREA DO QUADRADO = " + String.format("%.4f", quadrado));
System.out.println("AREA DO TRIANGULO = " + String.format("%.4f", triangulo));
System.out.println("AREA DO TRAPÉZIO = " + String.format("%.4f", trapezio));

 sc.close();
    }
    
}
