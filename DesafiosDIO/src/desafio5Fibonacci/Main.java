package desafio5Fibonacci;

import java.util.Scanner;
/*
 * A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, 
 * é igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros números dessa série.
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int primeiro = 0;
		int fibonacciAnterior2 = primeiro;
		int segundo = 1;
		int fibonacciAnterior1 = segundo;
		int quantidadeSequencia = scan.nextInt();
		int fibonacci = 0;
		
		if (quantidadeSequencia == 1) {
			System.out.println(primeiro);
		}
		else if (quantidadeSequencia == 2) {
			System.out.println(primeiro+" "+segundo);
		}
		else {
			System.out.print("0 1 ");
			for (int i = 0; i < quantidadeSequencia-2; i++) {
				fibonacci = fibonacciAnterior1 + fibonacciAnterior2;
				if (i == quantidadeSequencia-3) {
					System.out.print(fibonacci);
				}else {
					System.out.print(fibonacci+" ");
				}
				fibonacciAnterior2 = fibonacciAnterior1;
				fibonacciAnterior1 = fibonacci;
			}		
		}		
		scan.close();
	}
}