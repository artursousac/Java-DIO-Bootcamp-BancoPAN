package collectionsJava.lists.exerciciosLists.exerciciosPropostos.ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Faça um programa que receba a temperatura média dos 6 primeiros
 * meses do ano e armazene-as em uma lista.
 * Após isto, calcule a média semestral das temperaturas e mostre
 * todas as temperaturas acima desta média, e em que mês ela ocorreram
 * (mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro...)
 */
public class Main {

	public static void main(String[] args) {
		
		List<Double> temperatura = new ArrayList<>();
		Scanner scan = new Scanner(System.in);	
		int i = 0;
		double soma = 0;
		double media = 0;
		
		while (i < 6) {
			System.out.println("Digite a temperatura média do "+(i+1)+"° mês: ");
			if (scan.hasNextDouble()) {
				temperatura.add(scan.nextDouble());
				i++;
				System.out.println("Temperatura adicionada com sucesso.");
			}
			else {
				System.out.println("Digite um valor numérico válido para temperatura!!!");
				scan.next();
			}
		}
		//Podia realizar a soma no momento da leitura dos dados, entretanto quis utilizar o for each para treinar.
		for(double t : temperatura) {
			soma+=t;
		}
		media = soma/6;
		System.out.println("\n\nTemperatura Média: "+media+"\nMeses acima da temperatura média:");
		for(double t : temperatura) {
			if(t > media) {
				System.out.print("\n-> "+(temperatura.indexOf(t)+1)+" -");
				switch(temperatura.indexOf(t)+1) {
				case 1:
					System.out.print(" Janeiro");
					break;
				case 2:
					System.out.print(" Fevereiro");
					break;
				case 3:
					System.out.print(" Março");
					break;
				case 4:
					System.out.print(" Abril");
					break;
				case 5:
					System.out.print(" Maio");
					break;
				case 6:
					System.out.print(" Junho");
					break;
				}
			}
		}
		
	}

}
