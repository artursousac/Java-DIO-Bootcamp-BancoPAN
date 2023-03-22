package collectionsJava.lists.exerciciosLists.exerciciosPropostos.ex02;

import java.util.Scanner;

public abstract class Resposta {
	
	private String resposta;
	Scanner scan = new Scanner(System.in);
	private int contadorSuspeita = 0;
	
	public Resposta(String resposta) {
		this.resposta = resposta;
	}
	
	public Resposta() {
		this.contadorSuspeita = 0;
		this.resposta = null;
	}
	
	public boolean verificarResposta(String resposta) {
		while (!resposta.equals("sim") && !resposta.equals("s")
				&& !resposta.equals("nao") && !resposta.equals("n")
				&& !resposta.equals("não")) {
			System.out.println("Digite uma resposta válida!!! Somente 's', 'sim', 'n' ou 'nao'");
			resposta = scan.nextLine();
		}
		if (resposta.equals("sim") || resposta.equals("s")) {
			this.contadorSuspeita = this.contadorSuspeita + 1;
		}
		return true;
	}

	public int getContadorSuspeita() {
		return contadorSuspeita;
	}
	
	public void verificarSuspeito() {
		switch(this.contadorSuspeita) {
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
		default:
			System.out.println("Inocente");
			break;
		}
	}
	
	
	
}
