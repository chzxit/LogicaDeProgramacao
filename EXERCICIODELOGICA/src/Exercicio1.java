
public class Exercicio1 {
//TODO Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

	public static void main(String[] args) {
		int A = 2;
		int B = 7;
		int C = 6;

		int Soma = A + B;

		if (Soma < C) {
			System.out.println("A soma de A + B é igual a: " + Soma + " A soma de A + B é menor do que C.");

		} else {
			System.out.println("A soma de A + B é igual a: " + Soma + " A soma de A + B é maior do que C.");
		}

	}

}
