package metodos.exercicios;

public class SmarTV {

	String ligada = "Desligada";
	int canal = 1;
	int volume = 25;
	
	public void ligar() {
		ligada = "Ligada";
	}
	
	public void desligar() {
		ligada = "Desligada";
	}
	
	public void aumentarVolume() {
		volume += 1;
	}
	
	public void diminuirVolume() {
		volume -= 1;
	}
	
	public void subirCanal() {
		canal += 1;
	}
	
	public void descerCanal() {
		canal -= 1;
	}
	
	public void mudarCanal(int novoCanal) {
		canal = novoCanal;
	}

}
