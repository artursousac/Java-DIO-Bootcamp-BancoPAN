package collectionsJava.streamAPI;

public class StreamAPI {
	
	/*
	 * Stream API auxilia no trabalho com as Collections;
	 * 
	 * Classe Anônima: Classe que não recebeu um nome e é declarado e instanciado em uma
	 * única instruçõa. Deve considerar o uso de uma classe anonima sempre que precisa para
	 * criar uma classe que será instanciado apenas uma vez.
	 * 
	 * meusGatos.sort(new Comparator<Gato>(){
	 * 		@Override
	 * 		public int compare (Gato g1, Gato g2){
	 * 			return Integer.compare(g1.getIdade(), g2.getIdade);
	 * 		}
	 * }
	 * 
	 * Sem a necessidade de criar uma classe comparator e etc...
	 * 
	 * Functional Interface: Qualquer interface com um SAM é uma interface funcional
	 * e sua implementação pode ser tratada como expressões lambda.
	 * Exemplo: Comparator, Consumer, Function e Predicate;
	 * 
	 * Lambda: Função lambda é uma função sem declaração, não necessário colocar um nome
	 * um tipo de retorno e modificar de acesso. A ideia é que o método seja declarado
	 * no mesmo lugar em que será usado. tem sintaxe como (argumento) -> (corpo).
	 * 
	 * meusGatos.sort(Comparator.comparing(new Function<Gato, String>(){
	 * 		@Override
	 * 		public String apply(Gato gato){
	 * 			return gato.getNome(); // Compara a classe Gato pelo nome;
	 * 		}
	 * }
	 * 
	 * Utilizando o Lambda:
	 * meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));
	 * 
	 * Reference Method: É um recurso que permite fazer referência a um método
	 * ou construtor de uma classe e indicar que ele deve ser utilizado num
	 * ponto específico do código, deixando-o mais simples e legível.
	 * Basta informar uma classe ou referência seguida do símbolo "::" e o nome do
	 * método sem os parênteses no final.
	 * 
	 * meusGatos.sort(Comparator.comparing((Gato gato) -> gato.getNome()));
	 * 
	 * meusGatos.sort(Comparator.comparing(Gato::getNome)); //Forma de simplificar o lambda.
	 * 
	 * Streams API: Nova opção para manipulação de coleções em Java seguindo os 
	 * principios da programação funcional.
	 * Source (Fonte) => Pipeline (Operações Intermediárias) => Terminal (Operação Final)
	 * 
	 * 
	 * 
	 * 
	 */

}
