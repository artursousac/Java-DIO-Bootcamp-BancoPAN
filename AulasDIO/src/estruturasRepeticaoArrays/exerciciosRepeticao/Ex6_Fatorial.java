package estruturasRepeticaoArrays.exerciciosRepeticao;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numeroFatorial;
		int fatorial = 1;;

		System.out.println("Digite um número que você deseja descobrir o fatorial: ");
		while (true) {
			if (scan.hasNextInt()) {
				numeroFatorial = scan.nextInt();
				if (numeroFatorial >= 0) {
					break;
				}
			}
			else {
				System.out.println("Digite um número válido maior que 0: ");
			}
		}
		
		int c = numeroFatorial;
		while (c > 0) {
			fatorial = fatorial * (c);
			c--;
		}
		
		System.out.println(numeroFatorial+"!= "+fatorial);

	}

}
