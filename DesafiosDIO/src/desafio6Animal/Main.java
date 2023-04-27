package desafio6Animal;

import java.util.Scanner;

/*
 * Neste problema, você deverá ler 3 palavras que definem o tipo
 * de animal possível segundo o esquema abaixo, da esquerda para
 * a direita. Em seguida conclua qual dos animais seguintes foi 
 * escolhido, através das três palavras fornecidas.
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String c1, c2, c3;
		
		c1 = scan.nextLine();
		c2 = scan.nextLine();
		c3 = scan.nextLine();
		
		if(c1.equals("vertebrado")) {
			if(c2.equals("ave")) {
				if(c3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else if(c3.equals("onivoro")) {
					System.out.println("pomba");
				}
			}
			else if(c2.equals("mamifero")) {
				if (c3.equals("onivoro")){					
					System.out.println("homem");
				}
				else if(c3.equals("herbivoro")) {
					System.out.println("vaca");
				}
			}	
		}
		else if(c1.equals("invertebrado")) {
			if(c2.equals("inseto")) {
				if(c3.equals("hematofago")) {
					System.out.println("pulga");
				}
				else if(c3.equals("herbivoro")) {
					System.out.println("lagarta");
				}
			}
			else if(c2.equals("anelideo")) {
				if (c3.equals("hematofago")){					
					System.out.println("sanguessuga");
				}
				else if(c3.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}	
			
		}
		

	}
}