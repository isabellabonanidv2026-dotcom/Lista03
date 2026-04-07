package case03;

import java.util.Scanner;


public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
 
		System.out.print("Digite um número inteiro: ");
		int numero = receba.nextInt();
		if (numero % 3  == 0)  {
			System.out.println("É multiplo por 3 e 5");
		} else if (numero % 3 == 0) {
			System.out.println("Apenas multiplo por 3");
		} else if (numero % 5 == 0) {
			System.out.println(" Apenas multiplo por 5");
		} else {
			System.out.println("Nenhum");
		}
 
		receba.close();
	}

 
	}

