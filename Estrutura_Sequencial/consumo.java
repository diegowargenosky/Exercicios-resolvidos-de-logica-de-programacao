import java.util.Scanner;


public class consumo {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Fazer um programa para ler a distância total percorrida por um carro,bem como o total de combustível 
        //gasto por este carro ao percorrer tal distância.Mostrar o consumo médio do carro com três casas decimais.

 int distancia;
double combustivelGasto, consumoMedio;

System.out.print("Distância percorrida: ");
  distancia = sc.nextInt();


System.out.print("Combustível gasto: ");
  combustivelGasto = sc.nextDouble();

consumoMedio = (double) distancia / combustivelGasto;
System.out.print("Consumo medio = " + String.format("%.3f", consumoMedio));
          
 sc.close();

        
    }
}

    
