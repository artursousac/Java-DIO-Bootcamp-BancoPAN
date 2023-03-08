package estruturasRepeticaoArrays.exerciciosArray;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Ex2_Consoantes {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		String[] vetor = new String[6];
		int quantidadeConsoantes = 0;
		int quantidadeVogais = 0;
		String letra = "";
		
		int cont = 0;
		
		while (cont < 6) {
			System.out.println("Digite uma letra: ");
			while(true) {
				if (scan.hasNext()) {
					letra = scan.next().trim().toLowerCase();
					if (letra.length() > 1 | letra.matches(".*\\d.*") | !letra.matches("\\w*")) {
						System.out.println("Digite somente UMA letra!!!");
					}
					else {
						break;
					}
				}
			}
			
			switch(letra) {
			case "a":
				vetor[cont] = letra;
				quantidadeVogais++;
				break;
			case "e":
				vetor[cont] = letra;
				quantidadeVogais++;
				break;
			case "i":
				vetor[cont] = letra;
				quantidadeVogais++;
				break;
			case "o":
				vetor[cont] = letra;
				quantidadeVogais++;
				break;
			case "u":
				vetor[cont] = letra;
				quantidadeVogais++;
				break;
			default:
				vetor[cont] = letra;
				quantidadeConsoantes++;
				break;
			}
			
			cont++;
			
		}
		
		System.out.print("Consoantes: ");
		
		for (int c = 0; c < vetor.length; c++) {
			if (!vetor[c].equals("a") && !vetor[c].equals("e") && !vetor[c].equals("i") && !vetor[c].equals("o") && !vetor[c].equals("u")) {
				System.out.print(vetor[c]+" ");
			}
		}
		
		System.out.println("\nTotal de Vogais: "+quantidadeVogais+"\nTotal de Consoantes: "+quantidadeConsoantes);
		
		

	}

}
