import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		// TODO:Faça um algoritmo que leia três valores inteiros diferentes e imprima na
		// tela os valores em ordem decrescente.
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valorUm = scan.nextInt();
		System.out.println("Digite outro valor: ");
		int valorDois = scan.nextInt();
		System.out.println("Digite mais um valor: ");
		int valorTres = scan.nextInt();

		int maior, medio, menor;
		if (valorUm > valorDois && valorUm > valorTres) {
			maior = valorUm;
			if (valorDois > valorTres) {
				medio = valorDois;
				menor = valorTres;
			} else {
				medio = valorTres;
				menor = valorDois;
			}
			System.out.println("Os valores em ordem decrescente são: " + maior + "," + medio + "," + menor);

		} else if (valorDois > valorUm && valorDois > valorTres) {
			maior = valorDois;
			if (valorUm > valorTres) {
				medio = valorUm;
				menor = valorTres;

			} else {
				medio = valorTres;
				menor = valorUm;
				System.out.println("Os valores em ordem decrescente são: " + maior + "," + medio + "," + menor);
			}
		} else if (valorTres > valorUm & valorTres > valorDois) {
			maior = valorTres;
			if (valorDois > valorUm) {
				medio = valorDois;
				menor = valorUm;

			} else {
				medio = valorUm;
				menor = valorDois;
			}
			System.out.println("Os valores em ordem decrescente são: " + maior + "," + medio + "," + menor);
		}

	}

}
