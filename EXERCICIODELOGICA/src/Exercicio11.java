import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		// TODO:Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma
		// pessoa, leia o seu peso e sua altura e imprima na tela sua condição

		// de acordo com a tabela abaixo:

		// Fórmula do IMC = peso / (altura) ²

		// Tabela Condições IMC

		// //Abaixo de 18,5 | Abaixo do peso

		// Entre 18,6 e 24,9 | Peso ideal (parabéns)

		// Entre 25,0 e 29,9 | Levemente acima do peso

		// Entre 30,0 e 34,9 | Obesidade grau I

		// Entre 35,0 e 39,9 | Obesidade grau II (severa)

		// Maior ou igual a 40 | Obesidade grau III (mórbida)

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();

		System.out.println("Digite o seu peso corporal: ");
		double peso = scan.nextDouble();

		double imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Abaixo do peso " + imc);

		} else if (imc >= 18.6 && imc <= 24.9) {
			System.out.println("Peso ideal, parabéns! " + imc);

		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Levemente acima do peso " + imc);

		} else if (imc > 30 && imc <= 34.9) {
			System.out.println("Obesidade grau I " + imc);

		} else if (imc > 35 && imc <= 39.9) {
			System.out.println("Obesidade grau II (severa) " + imc);

		} else if (imc >= 40) {
			System.out.println("Obesidade grau III (mórbida) " + imc);

		}

	}

}
