package excecoesJava.exceptionCustomizada;
import javax.swing.*;

public class ExceptionCustomizada2 {
    public static void main(String[] args) throws DivisaoNaoExata{
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};
       
        for(int i = 0; i < denominador.length; i++) {
        	try {
        		if(numerador[i] % 2 != 0) 
            		throw new DivisaoNaoExata("Divisão não exata", numerador[i], denominador[i]);
            		
            	int resultado = numerador[i] / denominador[i];
            	System.out.println(resultado);
        	}catch(DivisaoNaoExata e){
        		e.printStackTrace();
        		JOptionPane.showMessageDialog(null, e.getMessage());
        	}
     
        }

        System.out.println("O programa continua...");
    }
}
