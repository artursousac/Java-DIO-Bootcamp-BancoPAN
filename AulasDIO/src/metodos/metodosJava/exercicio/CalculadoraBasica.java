package metodos.metodosJava.exercicio;

public class CalculadoraBasica {
	
	private double adicao;
	private double subtracao;
	private double multiplicacao;
	private double divisao;
	private double num1;
	private double num2;
	
	public CalculadoraBasica(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void adicao(double num1, double num2) {
		this.adicao = num1 + num2;
	}
	
	public double getAdicao() {
		return adicao;
	}

	public void setAdicao(double adicao) {
		this.adicao = adicao;
	}

	public double getSubtracao() {
		return subtracao;
	}

	public void setSubtracao(double subtracao) {
		this.subtracao = subtracao;
	}

	public double getMultiplicacao() {
		return multiplicacao;
	}

	public void setMultiplicacao(double multiplicacao) {
		this.multiplicacao = multiplicacao;
	}

	public double getDivisao() {
		return divisao;
	}

	public void setDivisao(double divisao) {
		this.divisao = divisao;
	}

	public void subtracao(double num1, double num2) {
		this.subtracao = num1 - num2;
	}
	
	public void multiplicacao(double num1, double num2) {
		this.multiplicacao = num1 * num2;
	}
	
	public void divisao(double num1, double num2) {
		this.divisao = num1/num2;
	}
	
	

}
