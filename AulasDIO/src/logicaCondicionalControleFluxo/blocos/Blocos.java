package logicaCondicionalControleFluxo.blocos;

public class Blocos {

	public static void main(String[] args) {
		// if (autorizado){
		// Carregar Perfil
		// DirecionarPáginaPrincipal
		// } // Bloco com 2 linhas.
		
		/*Quando o bloco tem somente 1 linha, não necessita de chaves, apesar de ser ideal.
		 * 
		 * 
		 */
		
		if(true && true == true) {
			System.out.println("True");
		}
		
		boolean teste = true ^ false;
		
		System.out.println(teste);

	}

}
