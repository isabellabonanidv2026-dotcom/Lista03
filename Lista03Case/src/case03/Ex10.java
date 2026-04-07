package case03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner receba = new Scanner(System.in);
		 
        System.out.print("Digite o seu IMC: ");
        double imc = receba.nextDouble();

        String classificacao;

        if (imc < 18) {
            classificacao = "Magro";
        } else if (imc <= 25) {  
            classificacao = "Normal";
        } else {  
            classificacao = "Acima do peso";
        }

        System.out.println("Classificação: " + classificacao);

        receba.close();
    }
}

	