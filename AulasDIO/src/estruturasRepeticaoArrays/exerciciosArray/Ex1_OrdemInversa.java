package estruturasRepeticaoArrays.exerciciosArray;


/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/


public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		int [] vetor = {1, 2, 3, 4, 5, 6};
		
		System.out.print("Vetor [] = ");
		
		for (int c = (vetor.length - 1);c >= 0; c--) {
			System.out.print(vetor[c]+" ");
		}

	}

}
