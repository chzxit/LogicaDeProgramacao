import java.util.Scanner;

public class Exercicio19 {
	public static void main(String[] args) {
		// TODO: Faça um algoritmo que leia o ano em que uma pessoa nasceu, imprima na
		// tela quantos anos, meses e dias essa pessoa ja viveu. Leve em
		// consideração o ano com 365 dias e o mês com 30 dias.

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Digite o ano em que voce nasceu: ");
		int anoNascimento = scan.nextInt();
		System.out.println("Digite o ano atual: ");
		int anoAtual = scan.nextInt();
		System.out.println("Digite o mes em que voce nasceu: ");
		int mesNascimento = scan.nextInt();
		System.out.println("Digite o mes atual ");
		int mesAtual = scan.nextInt();
		System.out.println("Digite o dia em que voce nasceu: ");
		int diaNascimento = scan.nextInt();
		System.out.println("Digite o dia atual: ");
		int diaAtual = scan.nextInt();

		int ano = anoAtual - anoNascimento;
		int mes = mesAtual - mesNascimento;
		int dia = diaAtual - diaNascimento;

		System.out.println(nome + " tem " + ano + " anos " +  mes + " meses " + dia + " dias ");

	}

}
