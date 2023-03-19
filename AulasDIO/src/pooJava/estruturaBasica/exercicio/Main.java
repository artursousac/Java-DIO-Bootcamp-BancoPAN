package pooJava.estruturaBasica.exercicio;

public class Main {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		
		carro1.setCor("Azul");
		carro1.setMarca("BMW");
		carro1.setCapacidadeTanque(59);
		
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getCor());
		System.out.println(carro1.valorEncherTanque(5.37));
		
		Carro carro2 = new Carro(66, "Cinza", "Mercedes");
		
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getCor());
		System.out.println(carro2.valorEncherTanque(5.37));
		System.out.println(carro1+" "+carro2);

	}

}
