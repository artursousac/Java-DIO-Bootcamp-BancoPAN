package one.digitalinnovation.gof.subsistema2.cep;

public class CepAPI {
	
private static CepAPI instancia = new CepAPI();
	
	private CepAPI() {
		super();
	}
	
	public static CepAPI getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Fortaleza";
	}
	
	public String recuperarEstado(String cep) {
		return "CE";
	}

}
