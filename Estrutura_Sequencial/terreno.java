import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    // Fazer um programa para ler as medidas de largura e comprimento de um terreno retangular com uma casa decimal
    //bem como o valor do metro quadrado do terreno com duas casas decimais.Em seguida, o programa deve mostrar
    //o valor da área d terreno,bem como o valor do preço do terreno,ambos com duas casas decimais.

    double largura, comprimento, metquadrado, area, preco;

System.out.print("Digite a largura do terreno: ");
  largura = sc.nextDouble();

System.out.print("Digite o comprimento do terreno: ");
  comrpimento = sc.nextDouble();

System.out.print("Digite o valor do metro quadrado: ");
  metquadrado = sc.nextDouble();

area = largura * comprimento;
preco = area * metquadrado;

System.out.println("Area do terreno = " + String.format("%.2f",area));
 System.out.print("Preco do terreno = " + String.format("%.2f", preco));

 sc.close();







        
    }
    
}
 