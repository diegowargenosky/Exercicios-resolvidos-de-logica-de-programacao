import java.util.Scanner;

public class Comerciante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

     // Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto
     // mandou digitar um conjunto de N mercadorias, cada uma contendo nome,preço de compra e preço de venda das
     // mesmas.
     
     // Fazer um programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:

     // lucro < 10%
     // lucro entre 10% e 20%
     // lucro > 20%

		System.out.print("Serão digitados dados de quantos produtos?: ");
		  int N = sc.nextInt();
		   
		   String [] nomeProduto = new String[N];
		   double [] precoCompra = new double[N];
		   double [] precoVenda = new double [N];
		   
		   for(int i = 0;i < N; i ++) {
               
            sc.nextLine();
			   
			   System.out.println("Produto " + (i + 1) + ":");
			     System.out.print("Nome: ");
			   nomeProduto[i] = sc.nextLine();
			   
			   System.out.print("Preco de compra: ");
			     precoCompra[i] = sc.nextDouble();
			     
			     System.out.print("Preco de venda: ");
			       precoVenda[i] = sc.nextDouble();
		   }
		   
		   int abaixo = 0;
		  int entre =  0;
		   int acima =  0;
		   
		   for(int i = 0;i < N; i ++) {
			   
			  double lucro = precoVenda[i] - precoCompra[i];
			  double porcentagem = (lucro * 100 ) / precoCompra[i];
			   
			   if (porcentagem < 10) {
				   
				   abaixo += 1;
			   }
			   
			   else if (porcentagem > 10 && porcentagem < 20) {
				   
				   entre +=  1;
			   }
			   
			   else {
				   
				   acima += 1;
			   }
		   }
		   
		   System.out.println("\n"+"RELATORIO:");
		   
		   System.out.println("Lucro abaixo de 10%: " + abaixo);
		   System.out.println("Lucro entre 10% e 20%: " + entre);
		   System.out.println("Lucro acima de 20%: " + acima);
		   
		   
		
		   
		   double somaCompra = 0;
		   double somaVenda = 0;
		   
		   for( int i = 0;i < N; i ++) {
			   
			   somaCompra = precoCompra[i] + somaCompra;
			   somaVenda = precoVenda[i] + somaVenda;
		   }
		   
		   System.out.println("Valor total de compra: " + String.format("%.2f", somaCompra));
		   System.out.println("Valor total de venda: " + String.format("%.2f", somaVenda));
		   
		   double lucroTotal = somaVenda - somaCompra;
		   System.out.println("Lucro total: " + String.format("%.2f", lucroTotal));
		   
		   
		   sc.close();

		}

}

        
    
    

