package testeUnitario.Junit5;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {

   @Test
   @DisabledIfEnvironmentVariable(named = "USER", matches = "root")
   public void validarAlgoSomenteNoUsuarioWillyan() {
	   Assertions.assertEquals(10, 5+5);
   }
   
   @Test
   @EnabledOnOs(OS.LINUX)
   public void validarAlgoSomenteNoUsuarioWillyan2() {
	   Assertions.assertEquals(10, 5+5);
   }
}