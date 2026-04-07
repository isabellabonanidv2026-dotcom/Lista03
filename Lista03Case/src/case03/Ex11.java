package case03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner receba = new Scanner(System.in);
int option;

System.out.println("Qual das opções vc quer realizar?");
System.out.println("1-Ver saldo");
System.out.println("2-Depositar");
System.out.println("3-Sair");
option =  receba.next().charAt(0);

switch (option){

case '1':
	System.out.println("Seu saldo é: R$120,00");
break;
case '2':
	System.out.println("Qual o valor?");
	receba.next().charAt(0);
	System.out.println("Valor depositado");
break;
case '3':
	System.out.println("Saindo");

	break;
	default:
System.out.println("Opção invalida");
	
	}}}