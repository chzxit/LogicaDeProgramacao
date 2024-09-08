import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
//TODO:Faça algoritmo que leia o nome e a idade de uma pessoa e imprima na tela o nome da pessoa e se ela é maior ou menor de idade. 

		Scanner scan = new Scanner(System.in);
		int maiordeIdade = 18;

		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();

		if (idade >= maiordeIdade) {
			System.out.println(nome + " é maior de idade ");

		}else {
			System.out.println(nome + " não é maior de idade ");
		}
	}

}
