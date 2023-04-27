package one.digitalinnovation.gof.subsistema1.crm;

public class CrmService {
	
	private CrmService() {
		super();
	}
	
	public static void gravarClient(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de CRM.");
	}

}
