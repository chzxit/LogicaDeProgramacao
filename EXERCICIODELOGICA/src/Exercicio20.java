import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		// TODO:Faça um algoritmo que leia dois valores inteiros A e B, imprima na tela
		// o quociente e o resto da divisão inteira entre eles.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int valorA = scan.nextInt();
		System.out.println("Digite outro valor: ");
		int valorB = scan.nextInt();
		
		int quociente = valorA / valorB;
		// % retorna o resto de uma divisão entre dois números inteiros
		int resto = valorA % valorB;
		
		System.out.println("O seu quociente é " + quociente + "\n" + "resto da divisão " + resto);
	}

}
