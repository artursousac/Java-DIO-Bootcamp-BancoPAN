package desafio9EspacosVogais;

import java.util.Scanner;

/*
 * Jorginho é professor do primário de uma determinada escola.
 * Ele tem 100000 alunos e precisa criar um programa que verifica quantos espaços
 * em branco e quantas vogais existem em uma determinada string de entrada que os
 * alunos entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que
 * o tempo para entrega-la no fim do semestre acabe!
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String frase = scan.nextLine().toLowerCase();
		String fraseSplit[] = frase.split(" ");
		int quantidadeEspaco = fraseSplit.length - 1;
		int quantidadeVogal = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' ||
					frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
				quantidadeVogal = quantidadeVogal + 1;
			
			}
		}
		
		System.out.println("Espacos em branco: " + quantidadeEspaco + " Vogais: " + quantidadeVogal);
		

	}

}
