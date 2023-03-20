package pooJava.relacoes.exercicios.UpDownCast;

public class Main {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		//Upcast; A a = new B();
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario jardineiro = new Jardineiro();
		
		//Downcast;
		//Vendedor vendedor = (Vendedor) new Funcionario();

	}

}
