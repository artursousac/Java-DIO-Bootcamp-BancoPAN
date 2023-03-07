package estruturasRepeticaoArrays.exerciciosRepeticao;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros = 0;
		int pares = 0;
		int impares = 0;
		int contador = 0;
		int numero = 0;
		
		while(true) {
			System.out.println("Digite a quantidade de números que deseja analisar: ");
			if(scan.hasNextInt()) {
				quantidadeNumeros = scan.nextInt();
				if(quantidadeNumeros > 0) {
					break;
				}
			}
			else {
				System.out.println("Digite um número válido!!!");
			}
		}
		
		while(contador < quantidadeNumeros) {
			System.out.println("Digite o "+(contador + 1)+"° número");
			if(scan.hasNextInt()) {
				numero = scan.nextInt();
				if (numero % 2 == 0) {
					pares++;
				}
				else {
					impares++;
				}
				contador++;
			}
		}
		
		System.out.println("Foram digitados "+pares+" números pares e "+impares+" números ímpares");
		
		
	}

}
