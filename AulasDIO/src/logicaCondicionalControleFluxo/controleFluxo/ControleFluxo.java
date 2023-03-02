package logicaCondicionalControleFluxo.controleFluxo;

public class ControleFluxo {

	public static void main(String[] args) {
		/* São estruturas que tem a capacidade de direcionar o fluxo de execução do código.
		 * Decisão: if, if-else, if-else-if, switch e operador ternário.
		 * Repetição: for, while, do while.
		 * Interrupção: break, continue e return.
		 */
		
		/* Decisão: estrutura que avalia uma condição booleana ou variável para direcionar o fluxo de execução;
		 * if (condição) {
		 * }
		 * if (condição){
		 * } else{
		 * }
		 * if (condição){
		 * } else if(condição){
		 * }
		 * 
		 * Operador Ternário:
		 * condição ? true : false;
		 * condição ? true : null;
		 * ligado ? desligar : ligar;
		 * 
		 * 
		 * Switch:
		 * switch (variável){
		 * case 1:
		 * break;
		 * case ...:
		 * break;
		 * }
		 * 
		 * switch(olhos){
		 * case "AZUIS":
		 * break;
		 * case "VERDES":
		 * break;
		 * case "CASTANHOS":
		 * break;
		 * default:
		 * break;
		 * }
		 * 
		 * 
		 */
		
		String dia = "Terça";
		switch (dia) {
		case "Segunda":
			System.out.println(2);
			break;
		case "Terça":
			System.out.println(3);
			break;
		case "Quarta":
			System.out.println(4);
			break;
		}
		
		int numero = 3;
		switch (numero) {
		case 1:
		case 2:
		case 3:
			System.out.println("Certo");
			break;
		case 4:
			System.out.println("Errado");
			break;
		default:
			System.out.println("Valor Indefinido");
			break;
		}
	}

}
