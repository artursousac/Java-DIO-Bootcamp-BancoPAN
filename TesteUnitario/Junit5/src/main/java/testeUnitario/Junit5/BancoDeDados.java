package testeUnitario.Junit5;

import java.util.logging.Logger;

public class BancoDeDados {
	
	private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());
	
	public static void iniciarConexao() {
		//fez algo
		LOGGER.info("Iniciou Conexão");
	}
	
	public static void finalizarConexao() {
		//fez algo
		LOGGER.info("Finalizou Conexão");
	}
	
	public static void insereDados(Pessoa pessoa) {
		//insere pessoa no BD
		LOGGER.info("Inseriu dados");
	}
	
	public static void removeDados(Pessoa pessoa) {
		//insere pessoa no BD
		LOGGER.info("Removeu dados");
	}

}
