package desafio10ImpostoRenda;

import java.util.Scanner;

/*
 * Há um país denominado Lolipad, todos os habitantes ficam felizes em pagar seus
 * impostos, pois sabem que nele não existem políticos corruptos e os recursos arrecadados
 * são utilizados em benefício da população, sem qualquer desvio. A moeda deste país é o
 * Loli, cujo símbolo é o R$.
 * 
 * Você terá o desafio de ler um valor com duas casas decimais, equivalente ao salário
 * de uma pessoa de Loli. Em seguida, calcule e mostre o valor que esta pessoa deve
 * pagar de Imposto de Renda, segundo a tabela abaixo.
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double valor = scan.nextDouble();
		double imposto = 0.0;
		
		if(valor > 2000 && valor <= 3000) {
			imposto = valor*0.08;
			valor = valor + imposto;
			System.out.printf("R$ %.2f", imposto);
		}
		else if(valor > 3000 && valor <= 4500) {
			imposto = ((valor-3000)*0.18) + 80.00;
			valor = valor + imposto;
			System.out.printf("R$ %.2f", imposto);
		}
		else if(valor > 4500) {
			imposto = ((valor-4500)*0.28) + 350.00;
			valor = valor + imposto;
			System.out.printf("R$ %.2f", imposto);
		}
		else if(valor <= 2000) {
			System.out.println("Isento");
		}

	}

}
