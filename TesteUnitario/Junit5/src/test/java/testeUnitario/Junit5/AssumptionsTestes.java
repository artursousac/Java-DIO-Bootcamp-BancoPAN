package testeUnitario.Junit5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class AssumptionsTestes {

   @Test
   void validarAlgoSomenteNoUsuarioWillyan() {
	   Assumptions.assumeTrue("Willyan".equals(System.getenv("USER")));
	   Assertions.assertEquals(10, 5+5);
   }
}