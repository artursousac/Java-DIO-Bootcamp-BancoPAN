package collectionsJava.lists.exerciciosLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class ExemploList {
	public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		/*
		 * List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		 * notas.add(10d); System.out.println(notas);
		 * Não é possível adicionar/remover dentro dessa lista asList que foi criada.
		 */
		/*
		 * List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); notas.add(1d);
		 * notas.remove(5d); System.out.println(notas);
		 * Como no modo anterior, a lista é imutável.
		 */

		System.out.println("Crie uma lista e adicione as sete notas: ");

		List<Double> notas = new ArrayList<>();
		notas.add(7.0); //Como é do tipo double, necessita de um "d" no final ou 7.0.
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		System.out.println(notas.toString()); //Pode imprimir também com sysout(notas).

		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
		//Este método indexOf retorna a posição do objeto.
		//Index começa na posição 0.

		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8.0); // add(posição, elemento).
		System.out.println(notas);

		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0); //set recebe a posição e o elemento.
		// ou seja, utilizamos o indexOf para descobrir aonde está a posição de um elemento
		// desejado e depois escolhemos o valor que desejamos para entrar nesta posição.
		System.out.println(notas);

		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
		//Método contains verifica se algo contém na lista.
		/*
		 * System.out.println("Exiba todas as notas na ordem em que foram informados: "
		 * ); for (Double nota : notas) System.out.println(nota);
		 * Como utilizamos o list, sempre estão ordenados na ordem que foram adicionados.
		 */

		System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		System.out.println(notas.toString());
		//Método get retorna o valor da posição desejada.

		System.out.println("Exiba a menor nota: " + Collections.min(notas));

		System.out.println("Exiba a maior nota: " + Collections.max(notas));

		Iterator<Double> iterator = notas.iterator();
		Double soma = 0.0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println("Exiba a soma dos valores: " + soma);

		System.out.println("Exiba a média das notas: " + (soma / notas.size()));

		System.out.println("Remova a nota 0: ");
		notas.remove(0.0);
		//Pode passar tanto o objeto, como a posição para remover.
		System.out.println(notas);

		System.out.println("Remova a nota da posição 0");
		notas.remove(0);
		System.out.println(notas);

		System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		Iterator<Double> iterator1 = notas.iterator();
		while (iterator1.hasNext()) {
			Double next = iterator1.next();
			if (next < 7)
				iterator1.remove();
		}
		System.out.println(notas);

		/*
		 * System.out.println("Apague toda a lista"); notas.clear();
		 * System.out.println(notas);
		 */
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());


	}
}