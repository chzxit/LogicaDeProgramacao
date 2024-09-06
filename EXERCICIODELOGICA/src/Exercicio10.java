import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		// TODO:Faça um algoritmo que leia o valor de um produto e determine o valor que
		// deve ser pago, conforme a escolha da forma de pagamento
		// pelo comprador e imprima na tela o valor final do produto a ser pago.

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do produto: ");
		double valorProduto = scan.nextDouble();
		System.out.println("Digite 1 para pagamento á vista em dinheiro ou em pix " + "\n");
		System.out.println("Digite 2 para pagamento á vista no cartão de crédito " + "\n");
		System.out.println("Digite 3 para pagamento parcelado de 2 vezes sem juros " + "\n");
		System.out.println("Digite 4 para pagamento parcelado em 3 vezez ou mais com juros ");
		int pagamento = scan.nextInt();
		switch (pagamento) {
		// 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
		case 1:
			double dinheiroPix = valorProduto * 0.15;
			double novoValorDinheiro = valorProduto - dinheiroPix;

			System.out.println("Valor final a ser pago: " + novoValorDinheiro);

			break;
		// 2 - À Vista no cartão de crédito, recebe 10% de desconto
		case 2:
			double cartaoAvista = valorProduto * 0.10;
			double novoValorAvistaCartao = valorProduto - cartaoAvista;

			System.out.println("Valor final a ser pago: " + novoValorAvistaCartao);

			break;
		// 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
		case 3:
			double parceladoCartao = valorProduto / 2;
			System.out.println("Valor final a ser pago: " + parceladoCartao);
			break;
		// 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais
		// juros de 10%
		case 4:
			double parceladoCartaocmJuros = valorProduto * 0.10;
			double novoValorParceladoJuros = valorProduto + parceladoCartaocmJuros;
			System.out.println("Valor final a ser pago: " + novoValorParceladoJuros);

			break;

		default:
			break;
		}

	}

}