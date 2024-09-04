import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
// TODO: Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores, 
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//imprimir seu valor na tela.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int A = scan.nextInt();
		System.out.println("Digite outro numero: ");
		int B = scan.nextInt();

		if (A == B) {
			int C = A + B;
			System.out.println( A + " + " + B + " é igual a " + C);

		} else {
			int C = A * B;
			System.out.println(A + " * " + B + " é igual a " + C);
		}

	}

}
