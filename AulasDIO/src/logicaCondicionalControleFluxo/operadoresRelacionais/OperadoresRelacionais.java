package logicaCondicionalControleFluxo.operadoresRelacionais;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		/* São símbolos especiais capazes de realizar comparações
		 * entre determinados operandos e, em seguida, retornar um resultado
		 * Podendo ser: Similaridade (igual e diferente) e
		 * Tamanho (maior, maior igual, menor, menor igual)
		 * 
		 * Vale destacar que para estes relacionais sempre será necessário, ao menos,
		 * dois operandos.
		 * 
		 * Igualdade (==) determina se um operando é igual ao outro.
		 * Diferença (!=) determina se um não é igual ao outro.
		 * 
		 * Maior (>) determina se um é maior que o outro.
		 * Maior igual (>=) determina se um é maior ou igual ao outro.
		 * O mesmo vale para o Menor (<) e Menor igual (<=)
		 * 
		 * Não é possível comparar um booleano com casos relacionais de maior ou menor.
		 */
		
		int i1 = 10;
		int i2 = 20;
		float f1 = 4.5f;
		float f2 = 3.5f;
		double d1 = 59.6d;
		char c1 = 'x';
		char c2 = 'y';
		String s1 = "Fulano";
		String s2 = "Fulano";
		String s3 = "Cicrano";
		boolean b1 = true;
		boolean b2 = false;
		long l1 = 1597L;
		long l2 = 8997L;
		byte y1 = 1;
		short h1 = 25;

		System.out.println("i1 == i2 "+ (i1 == i2));
		System.out.println("i1 != i2 "+ (i1 != i2));
		System.out.println("i1 > i2 "+ (i1 > i2));
		System.out.println("i1 <= i2 "+ (i1 <= i2));
		
		System.out.println("f1 == i2 "+ (f1 == f2));
		System.out.println("f1 != i2 "+ (f1 != f2));
		System.out.println("f1 >= i2 "+ (f1 >= f2));
		System.out.println("f1 < i2 "+ (f1 < f2));
		
		System.out.println("c1 == c2 "+ (c1 == c2));
		System.out.println("c1 != c2 "+ (c1 != c2));
		System.out.println("c1 > c2 "+ (c1 > c2));
		System.out.println("c1 <= c2 "+ (c1 <= c2));
		
		System.out.println("s1 == s2 "+ (s1 == s2));
		System.out.println("s1 == s3 "+ (s1 == s3));
		System.out.println("s1 != s2 "+ (s1 != s2));
		//System.out.println("s1 >= s2 "+ (s1 >= s2)); ERROR BOOLEAN
		//System.out.println("s1 < s2 "+ (s1 < s2)); ERROR BOOLEAN
		
		System.out.println("b1 == b2 "+ (b1 == b2));
		System.out.println("b1 != b2 "+ (b1 != b2));
		//System.out.println("b1 > b2 "+ (b1 > b2));
		//System.out.println("b1 <= b2 "+ (b1 <= b2));
		
		System.out.println("i2 == f1 "+ (i2 == f1));
		System.out.println("d1 != h1 "+ (d1 != h1));
		//System.out.println("s2 != c1 "+ (s2 != c1));
		//System.out.println("s3 < i1 "+ (s3 < i1));
		
		System.out.println("l1 == i2 " + (l1 == i2));
		System.out.println("l2 >= i1 " + (l2 >= i1));
		System.out.println("y1 != h1 " + (y1 != h1));
		
		
	}

}
