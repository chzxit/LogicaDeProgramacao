import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		// TODO: Faça um algoritmo que leia três valores que representam os três lados
		// de um triângulo e verifique se são válidos, determine se o triângulo é
		// equilátero, isósceles ou escaleno.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int ladoUm = scan.nextInt();
		System.out.println("Digite um valor: ");
		int ladoDois = scan.nextInt();
		System.out.println("Digite um valor: ");
		int ladoTres = scan.nextInt();
		
		
		
		if(ladoUm == ladoDois && ladoDois == ladoTres ) {
			System.out.println("È um triângulo equilátero ");
			
			// o || significa "or".
		}else if(ladoUm == ladoDois || ladoUm == ladoTres || ladoDois == ladoTres) {
			System.out.println("È um triângulo isósceles ");
			
		}else {
			System.out.println("È um triângulo escaleno");
		}
		
		
	}

}
