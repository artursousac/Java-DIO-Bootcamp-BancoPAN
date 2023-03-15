package estruturasDados.set;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Peugeot"));
		hashSetCarros.add(new Carro("Zip"));
		hashSetCarros.add(new Carro("Alfa Romeo"));
		
		System.out.println(hashSetCarros);

	}

}
