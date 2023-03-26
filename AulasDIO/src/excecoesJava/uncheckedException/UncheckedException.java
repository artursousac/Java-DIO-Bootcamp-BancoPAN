package excecoesJava.uncheckedException;

import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		
		boolean continueLooping = true;
		
		do {
			String a = JOptionPane.showInputDialog("Numerador: ");
			String b = JOptionPane.showInputDialog("Denominador: ");
		
		try {
			int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
			System.out.println("Resultado: " + resultado);
			continueLooping = false;
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! "+e.getMessage()); //o .getMessage faz aparecer "for input String: ...", ou seja, o erro que deu.
			//e.printStackTrace(); //Isso faz aparecer no console o erro que aparece;
		}catch(ArithmeticException e) {
			//e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0.");
		}
		finally {
			System.out.println("Chegou no finally!");
		}
		} while(continueLooping);
		
		System.out.println("Chegou até aqui...");
		
	}
	
	public static int dividir(int a, int b) {
		return a/b;
	}

}
