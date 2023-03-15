package estruturasDados.arvores.classeNoArvore;

public class BinNo<T extends Comparable<T>> {
	
	private T conteudo;
	private BinNo<T> noEsq;
	private BinNo<T> noDir;
	
	public BinNo(T conteudo) {
		noEsq = noDir = null;
		this.conteudo = conteudo;
	}
	
	public BinNo() {
		
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public BinNo<T> getNoEsq() {
		return noEsq;
	}

	public void setNoEsq(BinNo<T> noEsq) {
		this.noEsq = noEsq;
	}

	public BinNo<T> getNoDir() {
		return noDir;
	}

	public void setNoDir(BinNo<T> noDir) {
		this.noDir = noDir;
	}

	@Override
	public String toString() {
		return "BinNo [conteudo=" + conteudo + "]";
	}
	
	

}
