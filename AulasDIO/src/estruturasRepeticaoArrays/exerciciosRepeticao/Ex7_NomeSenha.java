package estruturasRepeticaoArrays.exerciciosRepeticao;

import javax.swing.JOptionPane;

/*
 * Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
 * mostrando uma mensagem de erro e voltando a pedir as informações.
 */

public class Ex7_NomeSenha {

	public static void main(String[] args) {
		String user;
		String senha;
		
		do {
			user = JOptionPane.showInputDialog("Digite o nome de usuário: ");
			senha = JOptionPane.showInputDialog("Digite a senha: ");
			if (user.equals(senha)) {
				JOptionPane.showMessageDialog(null, "Usuário e Senhas iguais. Tente novamente!");
			}
		} while(user.equals(senha));
		
		JOptionPane.showMessageDialog(null, "Usuário e Senha aceitos.\nUsuário: "+user+"\nSenha: "+senha);
		
	}

}
