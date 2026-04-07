package case03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Digite o valor unitário do produto: ");
        double valorUnitario = scanner.nextDouble();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o percentual de IPI (%): ");
        double ipi = scanner.nextDouble();

        
        double totalSemImposto = valorUnitario * quantidade;

       
        double valorIPI = totalSemImposto * (ipi / 100);

        
        double totalComImposto = totalSemImposto + valorIPI;

        
        System.out.println("Valor total sem imposto: R$ " + totalSemImposto);
        System.out.println("Valor do IPI: R$ " + valorIPI);
        System.out.println("Valor total com imposto: R$ " + totalComImposto);

        scanner.close();
    }
}