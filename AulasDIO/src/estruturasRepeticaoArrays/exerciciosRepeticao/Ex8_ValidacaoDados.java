package estruturasRepeticaoArrays.exerciciosRepeticao;

import javax.swing.JOptionPane;

/*
 * Faça um programa que leia e valide as seguintes informações:
 * Nome: maior que 3 caracteres;
 * Idade: entre 0 e 150;
 * Salário: maior que zero;
 * Sexo: 'f' ou 'm';
 * Estado Civil: 's', 'c', 'v', 'd';
 */
public class Ex8_ValidacaoDados {

	public static void main(String[] args) {

		boolean teste = false;
		// Nome
		String nome = JOptionPane.showInputDialog("Digite um nome: ").toLowerCase().trim();
		if (nome.matches(".*(?x).*\\w*") && !nome.matches(".*\\d.*") && nome.length() > 3) {
			teste = true;
		}
		while (!teste || nome.length() <= 3) {
			JOptionPane.showMessageDialog(null, "Digite um nome válido (somente letras) com mais de 3 caracteres!!!");
			nome = JOptionPane.showInputDialog("Digite um nome: ").toLowerCase().trim();
			if (nome.matches("\\w*") && !nome.matches(".*\\d.*") && nome.length() > 3) {
				teste = true;
			}
		}

		// Idade
		String idade = JOptionPane.showInputDialog("Digite uma idade entre 0 e 150: ").trim();
		while (!idade.matches("\\d*")) {
			JOptionPane.showMessageDialog(null, "Digite uma idade válida!!! Somente valores numéricos.");
			idade = JOptionPane.showInputDialog("Digite uma idade entre 0 e 150: ").trim();
			if (idade.matches("\\d*")) {
				if (Integer.parseInt(idade) >= 0 && Integer.parseInt(idade) < 150) {
					break;
				} else {
					idade = "a";
				}
			}
		}
		// Salário
		String salario = JOptionPane.showInputDialog("Digite o salário, que seja maior que zero: ").trim();
		while (!salario.matches("\\d*")) {
			JOptionPane.showMessageDialog(null, "Digite um salário válido!!! Somente valores numéricos e maior que zero.");
			salario = JOptionPane.showInputDialog("Digite o salário, que seja maior que zero: ").trim();
			if (salario.matches("\\d*")) {
				if (Double.parseDouble(salario) > 0) {
					break;
				} else {
					salario = "a";
				}
			}
		}

		// Sexo
		String sexo = JOptionPane.showInputDialog("Digite o sexo ('m' ou 'f'): ").toLowerCase().trim();
		while (!sexo.matches("f|m")) {
			JOptionPane.showMessageDialog(null, "Digite um sexo válido, somente as letras m ou f!!!");
			sexo = JOptionPane.showInputDialog("Digite o sexo ('m' ou 'f'): ").toLowerCase().trim();
		}
		if (sexo.equals("f")) {
			sexo = "Feminino";
		} else if (sexo.equals("m")) {
			sexo = "Masculino";
		}

		// Estado Civil
		String estadoCivil = JOptionPane.showInputDialog("Digite o estado civil ('s', 'c', 'v' ou 'd'): ").toLowerCase().trim();
		while (!estadoCivil.matches("s|c|v|d")) {
			JOptionPane.showMessageDialog(null, "Digite um estado civil válido, somente as letras s, c, v ou d!!!");
			sexo = JOptionPane.showInputDialog("Digite o estado civil ('s', 'c', 'v' ou 'd'): ").toLowerCase().trim();
		}
		if (estadoCivil.equals("s")) {
			if (sexo.equals("Masculino")) {
				estadoCivil = "Solteiro";
			} else if (sexo.equals("Feminino")) {
				estadoCivil = "Solteira";
			}
		} else if (estadoCivil.equals("c")) {
			if (sexo.equals("Masculino")) {
				estadoCivil = "Casado";
			} else if (sexo.equals("Feminino")) {
				estadoCivil = "Casada";
			}
		} else if (estadoCivil.equals("v")) {
			if (sexo.equals("Masculino")) {
				estadoCivil = "Viúvo";
			} else if (sexo.equals("Feminino")) {
				estadoCivil = "Viúva";
			}
		} else if (estadoCivil.equals("d")) {
			if (sexo.equals("Masculino")) {
				estadoCivil = "Divorciado";
			} else if (sexo.equals("Feminino")) {
				estadoCivil = "Divorciada";
			}
		}

		System.out.println("Nome: " + nome + "\nIdade: " + idade + " Anos\nSalário: R$ " + salario + "\nSexo: " + sexo
				+ "\nEstado Civil: " + estadoCivil);

	}

}
