package collectionsJava.set.exerciciosSet;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		
		System.out.println("Crie um conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.1, 5.4, 7.0, 0.0, 3.6));
		//Também poderia fazer Set<Double> notas = new HashSet<>(); e dps usar notas.add;
		//Além de poder fazer Set<Double> notas = Set.of(...); em vez de usar o add.
		System.out.println(notas.toString()); //Ou somente sysout (notas);
		//Vale observar que a nota 7.0 só está aparecendo 1 vez, ou seja, não permite duplicação.
		
		System.out.println("Confira se a nota 5.0 está no conjunto: "+notas.contains(5.0));
		
		System.out.println("Exiba a menor nota: "+Collections.min(notas));
		
		System.out.println("Exiba a menor nota: "+Collections.max(notas));
		
		double soma = 0;
		for(Double n : notas) {
			soma = soma + n;
		}
		//Outra forma de fazer é utilizando o iterator.
		/*Iterador<Double> iterator = notas.iterator();
		 * 
		 * while(iterador.hasNext(){
		 * 		Double next = iterator.next();
		 * 		soma += next;
		 * }
		 */
		
		System.out.println("Exiba a soma dos valores: " + soma);
		
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		System.out.println("Remova a nota 0: ");
		notas.remove(0.0);
		System.out.println(notas);
		
		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		//for(Double n : notas) {
			//if(n < 7) {
			//	notas.remove(n);
		//	}
	//	}
		Iterator<Double> iterator = notas.iterator();
		while(iterator.hasNext()) {
			Double next = iterator.next();
			if(next < 7) {
				iterator.remove();
			}
		}
		System.out.println(notas);
		
		System.out.println("Exibta todas as notas na ordem em que foram informadas: ");
		Set<Double> notasOriginais = new HashSet<>();
		notasOriginais.add(7.0);
		notasOriginais.add(8.5);
		notasOriginais.add(9.3);
		notasOriginais.add(5.0);
		notasOriginais.add(0.0);
		notasOriginais.add(3.6);
		System.out.println(notasOriginais);
		
		System.out.println("Exiba todas as notas na ordem crescente: ");
		Set<Double> notasCrescentes = new TreeSet<>(notasOriginais);
		//Observa-se que utilizando o TreeSet, colocando como parametro alguma lista/set já existente
		//Ele organiza a nova lista formada em ordem crescente a partir de uma já existente.
		//Só é possível pq o "notasOriginais" possui o elemento comparable.
		System.out.println(notasCrescentes);
		
		System.out.println("Apague todo o conjunto: ");
		
		notas.clear();
		
		System.out.println("Conferindo se o conjunto ta vazio: " + notas.isEmpty());
		
		
	}

}
