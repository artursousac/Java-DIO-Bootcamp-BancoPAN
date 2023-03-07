package estruturasRepeticaoArrays.exerciciosRepeticao;

/*
* Faça um programa que peça uma nota, entre zero e dez.
* Mostre uma mensagem caso o valor seja inválido
* e continue pedindo
* até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double nota = 0;
		
		while(true) {
			
			System.out.println("Digite uma nota entre zero e dez: ");
			if (scanner.hasNextDouble()) {
				nota = scanner.nextDouble();
				if (nota >= 0 && nota <= 10) {
					break;
				}
			}
			if(true){
				System.out.println("Nota inválida.");
				scanner.nextLine();
			}
			
		}
		
		System.out.println("Nota computada com sucesso. Nota armazenada: "+nota);

	}

}
