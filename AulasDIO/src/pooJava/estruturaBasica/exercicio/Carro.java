package pooJava.estruturaBasica.exercicio;

public class Carro {
	private int capacidadeTanque;
	private String cor;
	private String marca;
	
	public Carro() {
		
	}
	
	public Carro(int capacidadeTanque, String cor, String marca) {
		this.cor = cor;
		this.marca = marca;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double valorEncherTanque(double valorGasolina) {
		return valorGasolina * capacidadeTanque;
	}
}
