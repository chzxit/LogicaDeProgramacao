
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		// TODO: Faça um algoritmo que receba um valor inteiro e imprima na tela a sua
		// tabuada.
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int valor = scan.nextInt();

		int[] tabuada = { valor * 1, valor * 2, valor * 3, valor * 4, valor * 5, valor * 6, valor * 7, valor * 8,
				valor * 9, valor * 10 };
		
		System.out.println("A tabuada do "+ valor + " é " + "\n");
		System.out.println(Arrays.toString(tabuada));

	}

}
