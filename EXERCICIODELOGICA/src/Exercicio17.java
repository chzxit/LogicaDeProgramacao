
public class Exercicio17 {
	public static void main(String[] args) {
		// TODO:Francisco tem 1,50m e cresce 2 centímetros por ano, enquanto Sara tem
		// 1,10m e cresce 3 centímetros por ano. Faça um algoritmo que calcule e imprima
		// na tela em quantos anos serão necessários para que Sara seja maior que
		// Francisco.

		double Francisco = 1.50;
		double Sara = 1.10;
		int anos = 0;
		while (Francisco > Sara) {
			Francisco += 0.02;
			Sara += 0.03;
			anos += 1;
			System.out.println("Serão necessários " + anos + " anos" + " para que Sara seja maior que Francisco. ");
		}
	}

}
