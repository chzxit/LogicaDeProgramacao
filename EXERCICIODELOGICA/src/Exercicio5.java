import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		// TODO: Faça um algoritmo que leia o valor do salário mínimo e o valor do
		// salário de um usuário, calcule quantos salários mínimos esse
		// usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$
		// 1.293,20).
		
		Scanner scan = new Scanner(System.in);
		double salarioMinimo = 1293.20;
		
		System.out.println("Digite seu sálario: ");
		double salario = scan.nextDouble();
		double calc = salario / salarioMinimo;
		
		System.out.println("A quantidade de salario que voce ganha é de: " + calc + " salarios");

	}

}
