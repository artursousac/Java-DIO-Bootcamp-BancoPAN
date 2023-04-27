package one.digitalinnovation.gof.facade;

import one.digitalinnovation.gof.subsistema1.crm.CrmService;
import one.digitalinnovation.gof.subsistema2.cep.CepAPI;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		
		String cidade = CepAPI.getInstancia().recuperarCidade(cep);
		String estado = CepAPI.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarClient(nome, cep, cidade, estado);
	}

}
