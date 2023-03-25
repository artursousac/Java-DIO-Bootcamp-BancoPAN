package collectionsJava.streamAPI.exercicios.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

	public static void main(String[] args) {
		
		List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
		
		System.out.println("Imprima todos os elementos dessa lista de String: ");
		
		//numerosAleatorios.stream().forEach(new Consumer<String>() {
			//@Override
			//public void accept(String t) {
				//System.out.println(t);
			//}
		//});
		
		//numerosAleatorios.stream().forEach(s -> System.out.println(s));
		
		numerosAleatorios.forEach(System.out::println); //List possui o forEach sem precisar de Stream;
		
		System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
		
		numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);
		
		System.out.println("Transforme esta lista de String em uma lista de números inteiros.");
		
		//numerosAleatorios.stream().map(s -> Integer.parseInt(s));
		List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList()); //Utilizando method reference
		//Para transformar em uma outra lista nós adicionamos o List<>...
		//Caso quisesse mostrar no console, utilizariamos o .foreach(s -> system.out.println) ou .forEach(System.out::println);
		
		//map ele transforma o tipo em um outro e utilizamos o collect(Collectors.toList()), por exemplo, para transformar para List.
		System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista: ");
		//List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(new Predicate<Integer>(){
			//@Override
			//public boolean test(Integer i) {
				//if(i % 2 == 0 && i > 2) return true;
				//return false;
			//}
		//}).collect(Collectors.toList());
		//System.out.println(listParesMaioresQue2);
		
		List<Integer> listParesMaioresQue2 = numerosAleatorios.stream().map(Integer::parseInt).filter(i -> (i%2 == 0 && i>2)).collect(Collectors.toList());
		System.out.println(listParesMaioresQue2);
		
		System.out.println("Mostre a média dos números: ");
		numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);
		//mapToInt tem o método average incluso, já o map não tem;
		
		System.out.println("Remova os valores impares: ");
		
		List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
		
		numerosAleatoriosInteger.removeIf(i -> (i % 2 != 0));
		System.out.println(numerosAleatoriosInteger);
		
	}

}
