package metodos.exercicios;

public class Usuario {

	public static void main(String[] args) {
		
		SmarTV tvQuarto = new SmarTV();
		
		System.out.println("Status da TV: " + tvQuarto.ligada);
		System.out.println("Canal Atual: " + tvQuarto.canal);
		System.out.println("Volume: " + tvQuarto.volume);
		
		tvQuarto.ligar();
		
		tvQuarto.aumentarVolume();
		tvQuarto.diminuirVolume();
		
		tvQuarto.mudarCanal(13);

		System.out.println("\nNovo Status: TV " + tvQuarto.ligada);
		System.out.println("Novo Volume: " + tvQuarto.volume);
		System.out.println("Novo Canal: " + tvQuarto.canal);
		
		
	}

}
