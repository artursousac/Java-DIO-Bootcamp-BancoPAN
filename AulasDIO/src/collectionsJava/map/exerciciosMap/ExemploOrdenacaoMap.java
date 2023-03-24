package collectionsJava.map.exerciciosMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Comparator;

/*
 * Dados as seguintes informações sobre meus livros favoritos e seus autores, crie
 * um dicionário e ordene este dicionário:
 * Exibindo (Nome Autor - Nome Livro);
 * 
 * Autor = Hawking, Stephen - Livro = Uma Breve História do Tempo. páginas: 256
 * Autor = Duhigg, Charles - Livro = O Poder do Hábito. páginas: 408
 * Autor = Harari, Yuval Noah - Livro = 21 Lições para o Século 21. páginas: 432
 * 
 */

public class ExemploOrdenacaoMap {

	public static void main(String[] args) {

		System.out.println("--Ordem Aleatória--");
		// Ordem Aleatória é HashMap.
		Map<String, Livro> meusLivros = new HashMap<>();
		meusLivros.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
		meusLivros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
		meusLivros.put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n--Ordem de Inserção--");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>();
		meusLivros1.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
		meusLivros1.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
		meusLivros1.put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
		for(Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n--Ordem alfabética dos autores--");
		Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
		for(Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n--Ordem alfabética dos nomes dos livros--");
		//Usa-se TreeSet para utilizar o comparator;
		Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
		meusLivros3.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro : meusLivros3) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		
		System.out.println("\n--Ordem númerica das paginas dos livros--");
		Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
		meusLivros4.addAll(meusLivros.entrySet());
		for(Map.Entry<String, Livro> livro : meusLivros4) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getPaginas());
		}
		
		
		
	}

}
