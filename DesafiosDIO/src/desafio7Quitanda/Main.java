package desafio7Quitanda;
/*
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar
 * R$ 25,00, receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo
 * para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas
 * e escreva o valor a ser pago pelo cliente.
 * 
 * ATÉ 5KG: Morango R$ 2,50/Kg e Maçã R$ 1,80/Kg
 * MAIS DE 5GK: Morango R$ 2,20/Kg e Maçã R$ 1,50/Kg
 */

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int quantidadeMorango = scan.nextInt();
		int quantidadeMaca = scan.nextInt();
		double valorMorango = 0.0;
		double valorMaca = 0.0;
		double valorTotal = 0.0;
		int quantidadeTotal = quantidadeMaca+quantidadeMorango;
		
		if(quantidadeMorango <= 5) {
			valorMorango = (quantidadeMorango * 2.50);
		}
		else {
			valorMorango = quantidadeMorango * 2.20;
		}
		if(quantidadeMaca <= 5) {
			valorMaca = quantidadeMaca * 1.80;
		}
		else {
			valorMaca = quantidadeMaca * 1.50;
		}
		
		valorTotal = valorMaca + valorMorango;
		
		if(quantidadeTotal > 8 || valorTotal > 25) {
			valorTotal = valorTotal * 0.9;
		}
		
		System.out.println(valorTotal);

	}

}
