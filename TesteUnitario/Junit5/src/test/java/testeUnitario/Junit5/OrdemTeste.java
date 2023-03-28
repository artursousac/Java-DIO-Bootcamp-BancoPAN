package testeUnitario.Junit5;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)
//Random, DisplayName...
public class OrdemTeste {

	@Order(4)
	@Test
	public void validaFluxoA() {
		Assertions.assertTrue(true);
	}
	@Order(1)
	@Test
	public void validaFluxoB() {
		Assertions.assertTrue(true);
	}
	@Order(2)
	@Test
	public void validaFluxoC() {
		Assertions.assertTrue(true);
	}
	@Order(3)
	@Test
	public void validaFluxoD() {
		Assertions.assertTrue(true);
	}
}