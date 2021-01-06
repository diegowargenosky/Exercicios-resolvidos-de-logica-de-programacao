import java.util.Scanner;

public class MedidaGlicose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e depois mostrar na tela
        // a classificação desta glicose de acordo com a referência abaixo: 
        
        // CLASSIFICAÇÃO    GLICOSE
        //   Normal         Até 100
        //   Elevado        Maior que 100 até 140
        //   Diabetes       Maior que 140
        

System.out.print("Digite a medida da glicose: ");
 double medidaGlicose = sc.nextDouble();

if (medidaGlicose <= 100) {
 
System.out.print("Classificação: normal");
  }

else if (medidaGlicose <= 140) {

System.out.print("Classificação: elevado");
  }

if (medidaGlicose > 140) {

System.out.print("Classificação: diabetes");
  }

    }
    
}
