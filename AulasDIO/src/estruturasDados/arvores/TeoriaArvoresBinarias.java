package estruturasDados.arvores;

public class TeoriaArvoresBinarias {

	public static void main(String[] args) {
		// Existem diversos tipos de árvores, como AVL, ordenada,
		// rubro-negra, 2-3, 2-4, B, B+, Hiperbólica.
		// a principal é a binária, que tem as posições do nós,
		// sendo as maiores à direita e as menores à esquerda.
		// No Nó teremos onde guardar o conteudo e depois duas referências
		// sendo uma à esquerda e outra à direita.
		// A folha da árvore sempre aponta para "null".
		// Utiliza-se a Interface Comparable para comparar Strings
		// Esta interface obriga o objeto a utilizar o método compareTo
		// A interface retorna "1" caso o valor comparado seja maior e "0"
		// se for menor.
		// Em uma inserção, sempre tem que comparar o valor inserido com o da raíz.
		// Após comparar com a raíz, vai sempre comparando e indo para a esquerda ou para a direita,
		// dependendo se é maior ou menor.
		// Em uma exclusão, a gente pega o maior elemento da esquerda do nó excluído e substitui.
		// 

	}

}
