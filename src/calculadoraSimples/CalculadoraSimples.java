package calculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		double n1, n2;
		double soma, subtracao, multiplicacao, divisao;
		int op;
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("######SELECIONE UMA OPERAÇÃO######");
			System.out.println("[1] - SOMAR");
			System.out.println("[2] - SUBTRAIR");
			System.out.println("[3] - MULTIPLICAR");
			System.out.println("[4] - DIVIDIR");
			System.out.println(">>>>>>>>>Digite sua opção: ");
			op = entrada.nextInt();

			if (op == 0) {
				System.out.println("Programa finalizado");
				break;
			}

			System.out.println("Informe o primeiro valor: ");
			n1 = entrada.nextDouble();
			System.out.println("Informe o segundo valor: ");
			n2 = entrada.nextDouble();

			switch (op) {
			case 1:
				soma = n1 + n2;
				System.out.println("A soma é: " + soma);
				break;

			case 2:
				subtracao = n1 - n2;
				System.out.println("A subtração é: " + subtracao);
				break;

			case 3:
				multiplicacao = n1 * n2;
				System.out.println("A multiplicação é: " + multiplicacao);
				break;

			case 4:
				if (n1 < n2) {
					System.out.println("Impossivel realizar o calculo");
				} else {
					divisao = n1 / n2;
					System.out.println("A divisão é: " + divisao);
				}
				break;

			default:
				System.out.println("OPERAÇÃO INVÁLIDA!!!");
			}
			System.out.println("Digite 1 para continuar ou 0 para sair");
			op = entrada.nextInt();
			if (op == 0) {
				System.out.println("Programa finalizado");
			}
		} while (op != 0);
	}
}
