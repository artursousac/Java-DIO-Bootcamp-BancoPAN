package metodos.metodosJava.exercicio;

import java.util.Scanner;


/*
 * Crie uma aplicação que resolva as seguintes situações:
 * - Calcule as 4 operações básicas: soma, subtração, multiplicação
 * e divisão. Sempre 2 valores devem ser passados.
 * - A partir da hora do dia, informe a mensagem adequada: Bom dia,
 * Boa tarde e Boa noite.
 * - Calcule o valor final de um empréstimo, a partir do valor solicitado.
 * Taxas e parcelas influenciam. Defina arbitrariamente as faixas que
 * influenciam nos valores.
 * 
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double num1;
		double num2;
		String operacao;
		System.out.println("PROGRAMAS\n[1] - Calculadora Básica\n[2] - Calculadora de Empréstimo\nQual opção você deseja verificar?: ");
		String opcao = scan.nextLine();
		
		if(opcao.equals("1")) {
			System.out.println("Digite o primeiro número: ");
			num1 = scan.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = scan.nextDouble();
			CalculadoraBasica calculadora = new CalculadoraBasica(num1, num2);
		
			while(true) {
				System.out.println("Escolha a operação:\n[1] - Soma\n[2] - Subtração\n[3] - Multiplicação\n[4] - Divisão\n[Qualquer outro caractere] - Sair");
				operacao = scan.next();
				if (operacao.equals("1")){
					calculadora.adicao(num1, num2);
					System.out.println("------------------------------------------------------\nSOMA DE DOIS NÚMEROS");
					System.out.println(num1+" + "+num2+" = "+calculadora.getAdicao());
					System.out.println("------------------------------------------------------\n");
				}
				else if (operacao.equals("2")){
					calculadora.subtracao(num1, num2);
					System.out.println("------------------------------------------------------\nSUBTRAÇÃO DE DOIS NÚMEROS");
					System.out.println(num1+" - "+num2+" = "+calculadora.getSubtracao());
					System.out.println("------------------------------------------------------\n");
				}
				else if (operacao.equals("3")){
					calculadora.multiplicacao(num1, num2);
					System.out.println("------------------------------------------------------\nMULTIPLICAÇÃO DE DOIS NÚMEROS");
					System.out.println(num1+" * "+num2+" = "+calculadora.getMultiplicacao());
					System.out.println("------------------------------------------------------\n");
				}
				else if (operacao.equals("4")){
					calculadora.divisao(num1, num2);
					System.out.println("------------------------------------------------------\nDIVISÃO DE DOIS NÚMEROS");
					System.out.println(num1+" / "+num2+" = "+calculadora.getDivisao());
					System.out.println("------------------------------------------------------\n");
				}
				else {
					System.out.println("Obrigado por utilizar a calculadora.");
					break;
				}
			}
		}
		
		else if (opcao.equals("2")) {
			System.out.println("Digite o valor que você deseja: ");
			double valorEmprestimo = scan.nextDouble();
			System.out.println("Digite em quantas parcelas você deseja pagar: ");
			int quantidadeParcelas = scan.nextInt();
			
			Emprestimo simulacao = new Emprestimo(valorEmprestimo, quantidadeParcelas);
			System.out.printf("Valor a ser pago: R$ %.2f\n%d Parcelas de R$ %.2f", simulacao.getValorEmprestimoJuros(), quantidadeParcelas, simulacao.getValorEmprestimoJuros()/quantidadeParcelas);
			
		}
		
		

	}

}
