package estruturasRepeticaoArrays.exerciciosArray;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		Random random = new Random();
		//Scanner scan = new Scanner(System.in);
		
		int[] numerosInteiros = new int[20];
		
		for (int c = 0; c < 20; c++) {
			numerosInteiros[c] = random.nextInt(101);
		}
		
		for (int numero : numerosInteiros) {
			System.out.print(numero+" ");
		}

	}

}
