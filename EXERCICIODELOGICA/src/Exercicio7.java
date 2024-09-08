import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		// TODO: Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a
		// média das nota obtidas, imprima na tela o nome do aluno e
		// se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado
		// sua média final deve ser maior ou igual a 7.

		Scanner scan = new Scanner(System.in);
		int media = 7;
		System.out.println("Digite o seu nome: ");
		String nome = scan.nextLine();
		System.out.println("Digite a sua nota: ");
		double notaUm = scan.nextDouble();
		System.out.println("Digite a sua nota: ");
		double notaDois = scan.nextDouble();
		System.out.println("Digite a sua nota: ");
		double notaTres = scan.nextDouble();
		System.out.println("Digite a sua nota: ");
		double notaQuatro = scan.nextDouble();

		double mediaAluno = (notaUm + notaDois + notaTres + notaQuatro) / 4;

		if (mediaAluno >= media) {
			System.out.println(nome + " está aprovado/a ");

		}else {
			 System.out.println(nome +" está reprovado/a ");
		}
	}

}
