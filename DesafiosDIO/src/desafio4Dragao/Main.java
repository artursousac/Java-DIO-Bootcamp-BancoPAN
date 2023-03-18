package desafio4Dragao;

import java.util.Scanner;

/*
 * Daenerys é a khaleesi dos Dothraki. Juntamente com Drogon, eles vão atrás do Tyrion, para tentar dominar Westeros. 
 * Ela possui, além do seu dragãozinho, um rastreador que mede o nível de energia de qualquer ser vivo. 
 * Todos os seres com o nível menor ou igual a 8000, ela considera como se fosse um inseto. Quando passa deste valor, que foi o caso do Drogon, 
 * ela se espanta e grita “Mais de 8000”. Baseado nisso, utilize a mesma tecnologia e analise o nível de energia dos seres vivos.
 */

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int c = scan.nextInt();
		
		for (int i = 0; i < c; i++) {
			int numeroTeste = scan.nextInt();
			if (numeroTeste > 8000) {
				System.out.println("Mais de 8000!");
			}
			else {
				System.out.println("Inseto!");
			}
		}
	}

}
