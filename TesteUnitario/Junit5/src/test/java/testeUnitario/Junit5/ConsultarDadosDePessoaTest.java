package testeUnitario.Junit5;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class ConsultarDadosDePessoaTest {
	@BeforeAll
	public void configuraConexao() {
		BancoDeDados.iniciarConexao();
	}
	
	@BeforeEach
	public void insereDadosParaTeste() {
		BancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
	}
	
	@Test
	public void validarDadosDeRetorno() {
		Assertions.assertTrue(true);
	}
	@Test
	public void validarDadosDeRetorno2() {
		Assertions.assertTrue(true);
	}
	@AfterAll
	public void finalizarConexao() {
		BancoDeDados.finalizarConexao();
	}
	
	@AfterEach
	public void removeDadosDoTeste() {
		BancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
	}
}
