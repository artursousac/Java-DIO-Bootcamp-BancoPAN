package estruturasRepeticaoArrays.exerciciosRepeticao;

/*
 * Faça um programa que leia conjuntos de dois valores, o primeiro representando o nome
 * do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome)
 */

import java.util.Scanner;

public class Ex1_NomeIdade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		int idade;
		
		while(true) {
		
		System.out.println("Nome: ");
		nome = scanner.next();
		if(nome.equals("0")) {
			break;
		}
		
		System.out.println("Idade: ");
		idade = scanner.nextInt();
		
		}

	}

}
