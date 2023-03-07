package estruturasRepeticaoArrays.exerciciosRepeticao;

import java.util.ArrayList;
import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/



public class Ex3_MaiorEMedia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double numero;
		double maior = 0;
		double media;
		double soma = 0;
		
		
		for (int c = 0; c < 5;) {
			System.out.println("Digite o "+(c+1)+"° número: ");
			if(scan.hasNextDouble()) {
				numero = scan.nextDouble();
				double numero2 = scan.nextDouble();
				c++;
				if (numero > maior) {
					maior = numero;
				}
				soma += numero;
			}
			else {
				System.out.println("Número inválido!!!");
				scan.next();
			}
			
		}
		
		media = soma / 5;
		
		System.out.println("O maior número digitado foi "+maior+" e a média dos números digitados é "+media);
		System.out.println(scan.nextDouble());
		
		scan.close();
	}

}
