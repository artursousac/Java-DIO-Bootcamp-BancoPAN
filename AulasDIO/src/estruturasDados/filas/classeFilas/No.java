package estruturasDados.filas.classeFilas;

public class No {
	
	private Object object; //Conteúdo do Nó. A parte útil.
	private No refNo; //Referência de Nó.
	
	public No(Object object) {
		this.refNo = null;
		this.object = object;
	}
	
	public No() {	
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}

	@Override
	public String toString() {
		return "No [object=" + object + "]";
	}
	
	
	
	

}
