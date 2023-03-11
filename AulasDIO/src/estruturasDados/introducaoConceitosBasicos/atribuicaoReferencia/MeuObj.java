package estruturasDados.introducaoConceitosBasicos.atribuicaoReferencia;

public class MeuObj {
	Integer num;
	
	public MeuObj(Integer num) {
		this.num = num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
	
	public String toString() {
		return this.num.toString();
	}
}
