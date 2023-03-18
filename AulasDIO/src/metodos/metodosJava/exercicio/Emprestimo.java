package metodos.metodosJava.exercicio;

public class Emprestimo {
	
	private double valorEmprestimoJuros;
	private double taxaJurosMes = 1.01458;
	private int quantidadeParcelas;
	
	public Emprestimo(double valorEmprestimo, int quantidadeParcelas) {
		this.valorEmprestimoJuros = (valorEmprestimo)*Math.pow(taxaJurosMes, quantidadeParcelas);
		this.quantidadeParcelas = quantidadeParcelas;
	}
	
	public void calcularValorEmprestimo(double valorEmprestimo, int quantidadeParcelas) {
		this.valorEmprestimoJuros = Math.pow((valorEmprestimo*taxaJurosMes), quantidadeParcelas);
	}

	public double getValorEmprestimoJuros() {
		return valorEmprestimoJuros;
	}
	

}
