
public class Exercicio16 {
	public static void main(String[] args) {
		// TODO: Faça um algoritmo que calcule a quantidade de litros de combustível
		// gastos em uma viagem, sabendo que o carro faz 12km com um litro. Deve-se
		// fornecer ao usuário o tempo que será gasto na viagem a sua velocidade média,
		// distância percorrida e a quantidade de litros utilizados para fazer a viagem.
		// Fórmula: distância = tempo x velocidade.
		// litros usados = distância / 12.

		int tempoViagem = 12;
		int velocidadeMedia = 120;
		int distancia = tempoViagem * velocidadeMedia;
		double litrosUsados = distancia / 12;

		System.out.println("O tempo que será gasto na viagem é de : " + tempoViagem + " Horas" + "\n");
		System.out.println("A distância pecorrida é de: " + distancia + "Km" + "\n");
		System.out.println("A quantidade de litros utilizados para fazer a viagem foi de: " + litrosUsados + " Litros");
	}

}
