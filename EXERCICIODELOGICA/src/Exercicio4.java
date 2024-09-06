import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		// TODO:Faça um algoritmo que leia um valor qualquer e imprima na tela com um
		// reajuste de 5%.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero ");
		int num = scan.nextInt();
		double reajuste = num * 0.05;
		double numeroReajustado = reajuste + num;

		System.out.println("O seu reajuste ficou: " + numeroReajustado);

	}
}
