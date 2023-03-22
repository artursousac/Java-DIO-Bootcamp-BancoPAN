package collectionsJava.lists.exerciciosLists.exerciciosPropostos.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para uma
 * pessoa sobre um crime. As perguntas são:
 * 1. "Telefonou para a vítima?"
 * 2. "Esteve no local do crime?"
 * 3. "Mora perto da vítima?"
 * 4. "Devia para a vítima?"
 * 5. "Já trabalhou com a vítima?"
 * 
 * Se a pessoa responder positivamente a 2 questões ela deve ser
 * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e
 * 5 como "Assassina". Caso contrário, ela será classificado como
 * "Inocente".
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aux = 0;
		int contadorSuspeita = 0;
		List<String> respostas = new ArrayList<>();

		if (aux == 0) {
			System.out.println("Telefonou para a vítima?");
			while (!scan.hasNext()) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
			}
			respostas.add(scan.nextLine().toLowerCase());
			while (!respostas.get(aux).equals("sim") && !respostas.get(aux).equals("s")
					&& !respostas.get(aux).equals("nao") && !respostas.get(aux).equals("n")
					&& !respostas.get(aux).equals("não")) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
				respostas.set(aux, scan.nextLine());
			}
			if (respostas.get(aux).equals("sim") || respostas.get(aux).equals("s")) {
				contadorSuspeita++;
			}
			aux++;
		}
		if (aux == 1) {
			System.out.println("Esteve no local do crime?");
			while (!scan.hasNext()) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
			}
			respostas.add(scan.nextLine().toLowerCase());
			while (!respostas.get(aux).equals("sim") && !respostas.get(aux).equals("s")
					&& !respostas.get(aux).equals("nao") && !respostas.get(aux).equals("n")
					&& !respostas.get(aux).equals("não")) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
				respostas.set(aux, scan.nextLine());
			}
			if (respostas.get(aux).equals("sim") || respostas.get(aux).equals("s")) {
				contadorSuspeita++;
			}
			aux++;
		}

		if (aux == 2) {
			System.out.println("Mora perto da vítima?");
			while (!scan.hasNext()) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
			}
			respostas.add(scan.nextLine().toLowerCase());
			while (!respostas.get(aux).equals("sim") && !respostas.get(aux).equals("s")
					&& !respostas.get(aux).equals("nao") && !respostas.get(aux).equals("n")
					&& !respostas.get(aux).equals("não")) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
				respostas.set(aux, scan.nextLine());
			}
			if (respostas.get(aux).equals("sim") || respostas.get(aux).equals("s")) {
				contadorSuspeita++;
			}
			aux++;
		}

		if (aux == 3) {
			System.out.println("Devia para a vítima?");
			while (!scan.hasNext()) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
			}
			respostas.add(scan.nextLine().toLowerCase());
			while (!respostas.get(aux).equals("sim") && !respostas.get(aux).equals("s")
					&& !respostas.get(aux).equals("nao") && !respostas.get(aux).equals("n")
					&& !respostas.get(aux).equals("não")) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
				respostas.set(aux, scan.nextLine());
			}
			if (respostas.get(aux).equals("sim") || respostas.get(aux).equals("s")) {
				contadorSuspeita++;
			}
			aux++;
		}

		if (aux == 4) {
			System.out.println("Já trabalhou com a vítima?");
			while (!scan.hasNext()) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
			}
			respostas.add(scan.nextLine().toLowerCase());
			while (!respostas.get(aux).equals("sim") && !respostas.get(aux).equals("s")
					&& !respostas.get(aux).equals("nao") && !respostas.get(aux).equals("n")
					&& !respostas.get(aux).equals("não")) {
				System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
				respostas.set(aux, scan.nextLine());
			}
			if (respostas.get(aux).equals("sim") || respostas.get(aux).equals("s")) {
				contadorSuspeita++;
			}
			aux++;
		}
		
		System.out.print("------------------------\nVERIFICAÇÃO DE RESPOSTAS\nVocê foi considerado (a): ");
		switch(contadorSuspeita) {
		case 0:
			System.out.println("Inocente");
			break;
		case 1:
			System.out.println("Inocente");
			break;
		case 2:
			System.out.println("Suspeito (a)");
			break;
		case 3:
			System.out.println("Cúmplice");
			break;
		case 4:
			System.out.println("Cúmplice");
			break;
		case 5:
			System.out.println("Assassino (a)");
			break;
		}

	}

}
