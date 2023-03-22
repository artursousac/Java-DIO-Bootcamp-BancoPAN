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
		List<String> respostas = new ArrayList<>();
		Resposta respostaUser = new Resposta() {
		};

		while (aux == 0) {
			System.out.println("Telefonou para a vítima?");
			String respostaPergunta = scan.nextLine().toLowerCase();
			if(respostaUser.verificarResposta(respostaPergunta) == true) {
				aux++;
				respostas.add(respostaPergunta);
			}
		}
		while (aux == 1) {
			System.out.println("Esteve no local do crime?");
			String respostaPergunta = scan.nextLine().toLowerCase();
			if(respostaUser.verificarResposta(respostaPergunta) == true) {
				aux++;
				respostas.add(respostaPergunta);
			}
		}

		while (aux == 2) {
			System.out.println("Mora perto da vítima?");
			String respostaPergunta = scan.nextLine().toLowerCase();
			if(respostaUser.verificarResposta(respostaPergunta) == true) {
				aux++;
				respostas.add(respostaPergunta);
			}
		}

		while (aux == 3) {
			System.out.println("Devia para a vítima?");
			String respostaPergunta = scan.nextLine().toLowerCase();
			if(respostaUser.verificarResposta(respostaPergunta) == true) {
				aux++;
				respostas.add(respostaPergunta);
			}
		}

		while (aux == 4) {
			System.out.println("Já trabalhou com a vítima?");
			String respostaPergunta = scan.nextLine().toLowerCase();
			if(respostaUser.verificarResposta(respostaPergunta) == true) {
				aux++;
				respostas.add(respostaPergunta);
			}
		}
		
		System.out.print("------------------------\nVERIFICAÇÃO DE RESPOSTAS\nVocê foi considerado (a): ");
		respostaUser.verificarSuspeito();
	}

}
