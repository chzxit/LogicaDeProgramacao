import java.util.Scanner;

public class Exercicio12 {
	// TODO: Faça um algoritmo que receba um número inteiro e imprima na tela o seu
	// antecessor e o seu sucessor.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = scan.nextInt();
		
		 int sucessor = num + 1;
		 int antecessor = num - 1;
		
		System.out.println("O antecessor de "+ num +" é " + antecessor);
		System.out.println("O sucessor de  " + num + " é " + sucessor);
	}

}
