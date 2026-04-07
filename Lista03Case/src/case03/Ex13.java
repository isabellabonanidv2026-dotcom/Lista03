package case03;
import java.util.Scanner;



	import java.util.Scanner;

	public class Ex13 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Digite o primeiro lado: ");
	        double lado1 = scanner.nextDouble();

	        System.out.print("Digite o segundo lado: ");
	        double lado2 = scanner.nextDouble();

	        System.out.print("Digite o terceiro lado: ");
	        double lado3 = scanner.nextDouble();

	        
	        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
	            
	            
	            if (lado1 == lado2 && lado2 == lado3) {
	                System.out.println("Triângulo Equilátero");
	            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
	                System.out.println("Triângulo Isósceles");
	            } else {
	                System.out.println("Triângulo Escaleno");
	            }

	        } else {
	            System.out.println("Os valores não formam um triângulo.");
	        }

	        scanner.close();
	    }
	}