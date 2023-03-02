package logicaCondicionalControleFluxo.operadoresLogicos;

public class OperadoresLógicos {

	public static void main(String[] args) {
		/*
		 * Conjunção só é verdadeira quando ambas as proposições forem verdadeiras.
		 * Disjunção só é falsa quando ambos os operandos forem falsos. Disjunção
		 * exclusiva (XOR) só é verdadeira quando um dos operandos for verdadeiro e será
		 * falso nos outros casos. Negação inverte o valor lógico de um operando ou
		 * expressão (utiliza-se "!").
		 * Conjunção é o (&&); Disjunção é o (||); Disjunção exclusiva será (^);
		 * 
		 */

		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		boolean b4 = false;

		boolean teste = b1 && b2;

		System.out.println(teste); // Como b1 * b2 está sendo true * false, temos que o retorno será false, uma vez
									// que só será true quando os dois operandos forem true.

	}

}
