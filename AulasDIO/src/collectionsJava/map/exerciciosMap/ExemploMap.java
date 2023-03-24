package collectionsJava.map.exerciciosMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
 * modelo = gol - consumo = 14,4 km/L
 * modelo = uno - consumo = 15,6 km/L
 * modelo = mobi - consumo = 16,1 km/L
 * modelo = hb20 - consumo = 14,5 km/L
 * modelo = kwid - consumo = 15,6 km/L
 * 
 */

public class ExemploMap {

	public static void main(String[] args) {
		
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos");
		Map<String, Double> carrosPopulares = new HashMap<>() {{
			put("gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(carrosPopulares);
		//Como utiliza o HashMap, ele ordena em ordem aleatória;
		
		System.out.println("Substitua o consumo do gol por 15,2 km/L");
		carrosPopulares.put("gol", 15.2);
		//Como "Gol" já está adicionado, não é possível adicionar outro "Gol"
		//Desse modo, o que vemos é que utilizando o put, ele irá alterar somente
		//o valor da chave.
		System.out.println(carrosPopulares);
		
		System.out.println("Confira se o modelo tucson está no dicionário: "+ carrosPopulares.containsKey("tucson"));
		
		//Quando utilizamos "get", ele pede para darmos uma key e irá nos retornar
		//o value dessa key;
		System.out.println("Exiba o consumo do uno: "+ carrosPopulares.get("uno"));
		
		System.out.println("Exiba os modelos: ");
		Set<String> modelos = carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos dos carros: ");
		Collection<Double> consumos = carrosPopulares.values();
		System.out.println(consumos);
		
		System.out.println("Exiba o modelo mais econômico e seu consumo: ");
		Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
		//Entry permite analisar key e values separadamente;
		Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMaisEficiente = "";
		
		for(Map.Entry<String, Double> entry : entries) {
			if(entry.getValue().equals(consumoMaisEficiente)) {
				modeloMaisEficiente = entry.getKey();
				System.out.println("Modelo mais eficiente: "+ modeloMaisEficiente+" - "+consumoMaisEficiente+" km/L");
			}
		}
		
		System.out.println("Exiba o modelo menos econômico e seu consumo: ");
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		String modeloMenosEficiente = "";
		for(Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if(entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: "+ modeloMenosEficiente+" - "+consumoMenosEficiente);
			}
		}
		
		System.out.print("Exiba a soma dos consumos: ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0.0;
		while(iterator.hasNext()) {
			Double next = iterator.next();
			soma = soma + next;
		}
		System.out.println(soma+" km/L");
		
		System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));
		
		System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println(carrosPopulares);
		
		System.out.println("Exiba todos os carros na ordem em que foram informados: ");
		//LinkedHashMap ordena pela ordem de inserção.
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>();
		carrosPopulares1.put("gol", 14.4);
		carrosPopulares1.put("uno", 15.6);
		carrosPopulares1.put("mobi", 16.1);
		carrosPopulares1.put("hb20", 14.5);
		carrosPopulares1.put("kwid", 15.6);
		System.out.println(carrosPopulares1);
		
		System.out.println("Exiba o dicionário ordenado pelo modelo: ");
		//TreeMap ordena pelo modelo;
		Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
		System.out.println(carrosPopulares2);
		
		System.out.println("Apague o dicionário de carros: ");
		carrosPopulares.clear();
		
		System.out.println("Confira se o dicionário está vazio: "+carrosPopulares.isEmpty());
		
		
		
}
}
