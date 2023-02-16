package operadores;

public class Operadores {

	public static void main(String[] args) {
		// - Para atribuir valor do tipo String, utiliza-se sempre as aspas.
		// - Utiliza-se ponto para representar a parte decimal de um valor.
		// - Em caracter (char) se utiliza a aspas simples
		// - Algumas classes representam tipos e precisa anteceder a palavra "new", a
		// classe e o parametro
		// - double soma = 10.5 + 15.7; (SOMA)
		// - int subtração = 113 - 25;
		// - multiplicação = 20 * 7;
		// - divisao = 15/3;
		// - int modulo = 18 % 3;
		// - double resultado = (10 * 7) + (20 / 4)
		// - Para ficar de olho: Ao utilizar o operador de adição em variáveis do tipo
		// texto ele
		// - irá realizar a concatenação das palavras. Exemplo: String nomeCompleto =
		// "LINGUAGEM" + "JAVA"; Neste caso ele vai imprimir LINGUAGEMJAVA
		//- 1+1+1+"1" = 31, pois ele soma os valores númericos e concatena com a String/char "1"
		//- Porém, quando temos "1" + 1 + 1 + 1 ele vai concatenar todos, pois a partir do primeiro 
		// "1", ele passa a tratar todos os outros como concatenando. Por outro lado, se usarmos
		// "1" + (1 + 1 + 1) ele irá printar 13.
		//- Para tornar um valor negativo em positivo precisamos multiplicar o valor por * -1.
		//- Outro tipo de operador é a incrementação, por exemplo: int numero = 5; numero = numero +1
		//porém, podemos utilizar numero ++; Outra opção é utilizar numero += 1 (neste caso podemos
		//trocar o 1 por 2, por 3 ou por outra incrementação desejada.
		//- boolean variavel = true; caso queiramos definir a variavel como false, utilizamos
		//variavel = !variavel;
		//- Podemos utilizar String resultado = ""; para definir que resultado é um valor vazio
		//-
		int a, b;
		
		a = 6;
		b = 6;
		
		String resultado = "";
		if (a == b) {
			resultado = "verdadeiro";
		}
		else {
			resultado = "falso";
		}

		System.out.print(resultado);
		
		//- Outra forma de utilizar esta condição é de int resultado = a == b ? "verdadeiro" : "falso"
		//- Se usarmos print(a == b), ele irá dar como resposta true ou false, neste caso é true.
		//- método equals compara conteúdo quando tiver utilizando objetos ou textos.
		//- Além dos ==, >, <, também temos os operadores && (que significa "e") e o || (que significa
		//"ou")
		//- 
	}

}
