package desafio1FabricaCarros;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.*;

public class Main{

	public static void main(String[] args) {

	    Scanner scan = new Scanner(System.in);
	    int custoFabrica = scan.nextInt();
	    int porcentagemDistribuidor = scan.nextInt();
	    int percentualImpostos = scan.nextInt();

        int custoConsumidor;
        int distribuidor;
        int valorImpostos;

     distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
     valorImpostos = (custoFabrica * percentualImpostos) / 100;
     
     custoConsumidor = custoFabrica + distribuidor + valorImpostos;
   

     System.out.println(custoConsumidor);
	}
}