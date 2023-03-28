package testeUnitario.Junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AssertionsTeste {

	@Test
	public void validarLancamentos() {
		int[] primeiroLancamento = {10, 20, 30, 40, 50};
		int[] segundoLancamento = {-1, 5, 2, 3, 10};
		
		Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
	}
	
	@Test
	public void validarSeObjetoEstaNulo() {
		Pessoa pessoa = null;
		
		Assertions.assertNull(pessoa);
		
		pessoa = new Pessoa("Luciano", LocalDateTime.now());
		
		Assertions.assertNotNull(pessoa);
	}
	
	@Test
	public void validarNumerosDeTiposDiferentes() {
		
		double valor = 5.0;
		double outroValor = 5.0;
		
		assertEquals(valor, outroValor); //com a Assertions.*, não precisa escrever o Assertions.algumaCoisa;
		
	}
}