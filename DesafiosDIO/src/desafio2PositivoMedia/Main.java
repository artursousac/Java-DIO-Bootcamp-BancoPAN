package desafio2PositivoMedia;

/*
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. 
 * Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor = new Scanner(System.in);
     
     double media = 0;
     double x;
     int contPositivos = 0;

     for(int i = 0; i < 6; i++) {
    	 x = leitor.nextDouble();
    	 if (x > 0) {
    		 contPositivos++;
    		 media += x;
    	 }
     }
     
     media = media/contPositivos;
        
        System.out.println(contPositivos + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
