package estruturasDados.filas.classeFilas;

public class Fila {
	
	private No refNoEntradaFila;

	public Fila() {

		this.refNoEntradaFila = null;
	}
	/*
	 * Outra forma, é refatorando para embutir o nó.
	 * Por exemplo:
	 * public void enqueue(Object obj){
	 * 	No novoNo = new No(obj);
	 * 	refNoEntradaFila = novoNo;
	 * }
	 * 
	 * Se fizer isso, vamos ter um nó dentro de outro nó.
	 * Não será preciso fazer (new No "primeiro"), podendo
	 * já fazer "primeiro".
	 */
	public void enqueue(No novoNo) {
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}
	/*
	 * Outra forma, é refatorando para embutir o nó.
	 * Por exemplo:
	 * Só necessita alterar No para object.
	 */
	public No first() {
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}
				else {
					break;
				}
			}
			return primeiroNo; //primeiroNo.getObject();
		}
		return null;
	}
	
	/*
	 * Outra forma, é refatorando para embutir o nó.
	 * Por exemplo:
	 * Só necessita alterar No para object e return object.
	 */
	
	public No dequeue() {
		if(!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			No noAuxiliar = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}
				else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return primeiroNo;
		}
		return null;
	}
	
	
	public boolean isEmpty() {
		return refNoEntradaFila == null? true : false;
	}

	@Override
	public String toString() {
		String stringRetorno = "";
		No noAuxiliar = refNoEntradaFila;
		
		if(refNoEntradaFila != null) {
			while(true) {
				stringRetorno += "[No{objeto=" + noAuxiliar.getObject() +"}]--->";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}
				else {
					stringRetorno += "null";
					break;
				}
			}
		}
		else {
			stringRetorno = "null";
		}
		
		return stringRetorno;
	}
	
	

}
