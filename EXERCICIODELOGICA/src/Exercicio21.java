import java.util.Random;

public class Exercicio21 {
	public static void main(String[] args) {
		//TODO:Faça um algoritmo que mostre um valor aleatório entre 0 e 100.
		Random random = new Random();
		
		int numero = random.nextInt(100);
		
		System.out.println(numero);
	}

}
