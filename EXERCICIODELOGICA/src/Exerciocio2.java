import java.util.Scanner;

public class Exerciocio2 {
//TODO Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero qualquer: ");
		int num = scan.nextInt();
		
		
		
		if(num % 2 == 0) {
			System.out.println("O numero " + num + " é par");
			
		}else{
			System.out.println("O numero " + num  + " é impar ");
		}
		
		//verificação de positivo ou negativo:
		
		if(num > 0) {
			System.out.println("O numero " + num + " é positivo ");
			
			
		}else {
			System.out.println("O numero " + num + " é negativo ");
		}
	} 
}
