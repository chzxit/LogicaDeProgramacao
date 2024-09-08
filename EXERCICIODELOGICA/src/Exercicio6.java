import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		//TODO:Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua nota: ");
		double primeiraNota = scan.nextDouble();
		System.out.println("Digite a sua nota:");
		double segundaNota = scan.nextDouble();
		System.out.println("Digite a sua nota:");
		double terceiraNota = scan.nextDouble();
		 
		double media = (primeiraNota + segundaNota + terceiraNota) / 3 ;
		
		System.out.println("A media das suas notas é de: " + media );
		
		
	}
	

}
