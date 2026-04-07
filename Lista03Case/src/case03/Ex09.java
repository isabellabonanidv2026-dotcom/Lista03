package case03;


		import java.util.Scanner;

		public class Ex09 {
		    public static void main(String[] args) {
		        Scanner receba = new Scanner(System.in);

		        
		        System.out.print("Digite um número: ");
		        int numero = receba.nextInt();

		        
		        String resultado = (numero >= 10 && numero <= 50) 
		                ? "Dentro do intervalo" 
		                : "Fora do intervalo";
		        System.out.println(resultado);

		        receba.close();
		    }
		}
	
