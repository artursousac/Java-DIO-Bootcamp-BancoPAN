package estruturasRepeticaoArrays.exerciciosRepeticao;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeroTabuada;
		int c = 1;

		System.out.println("Digite o número que você deseja verificar a tabuada: ");
		while (true) {
			if (scan.hasNextInt()) {
				numeroTabuada = scan.nextInt();
				if (numeroTabuada > 0 && numeroTabuada <= 10) {
					break;
				}
				else {
					System.out.println("Digite um número válido de 1 a 10: ");
				}
			} 
			
			else {
				while (!scan.hasNextInt()) {
					System.out.println("Digite um número válido de 1 a 10: ");
				}
			}
		}
		
		while (c < 11) {
			System.out.println(numeroTabuada+" X "+c+" = "+(numeroTabuada*c));
			c++;
		}

	}

}
