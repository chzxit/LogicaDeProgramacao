import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		// TODO: Faça um algoritmo que leia dois valores booleanos (lógicos) e determine
		// se ambos são VERDADEIRO ou FALSO.
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite True or False : ");
		boolean valorUm = scan.nextBoolean();

		System.out.println("Digite True or False: ");
		boolean valorDois = scan.nextBoolean();

		if (valorUm && valorDois) {
			System.out.println("Ambos são verdadeiros");

		} else if (!valorUm && !valorDois) {
			System.out.println("Ambos são falsos ");

		} else {
			System.out.println("Os valores são diferentes. ");
		}
	}
}