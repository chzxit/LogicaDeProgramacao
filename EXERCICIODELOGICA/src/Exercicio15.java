
public class Exercicio15 {
	public static void main(String[] args) {
		// TODO:Faça um algoritmo que efetue o cálculo do salário líquido de um
		// professor. As informações fornecidas serão: valor da hora aula, número de
		// aulas lecionadas no mês e percentual de desconto do INSS. Imprima na tela o
		// salário líquido final.

		int valorHora = 40;
		int aulasDadas = 100;
		double salarioLiquido = valorHora * aulasDadas;

		if (salarioLiquido > 1 && salarioLiquido <= 1412) {
			double salarioFormatado = salarioLiquido * 0.075;
			System.out.println("Salário liquido final: " + (salarioLiquido - salarioFormatado));

		} else if (salarioLiquido > 1412.01 && salarioLiquido <= 2666.68) {
			double salarioFormatadoDois = salarioLiquido * 0.09;
			System.out.println("Salário liquido final: " + (salarioLiquido - salarioFormatadoDois));

		} else if (salarioLiquido > 2666.69 && salarioLiquido <= 4000.03) {
			double salarioFormatadoTres = salarioLiquido * 0.12;
			System.out.println("Salário liquido final: " + (salarioLiquido - salarioFormatadoTres));
		} else if (salarioLiquido > 4000.04 && salarioLiquido <= 7786.02) {
			double salarioFormatadoQuatro = salarioLiquido * 0.14;
			System.out.println("Salário liquido final: " + (salarioLiquido - salarioFormatadoQuatro));
		}

	}

}
