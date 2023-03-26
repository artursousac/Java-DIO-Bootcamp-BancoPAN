package excecoesJava.exceptionCustomizada;

public class DivisaoNaoExata extends Exception{

    private int numerado;
    private int denominador;

    public DivisaoNaoExata(String message, int numerado, int denominador) {
        super(message);
        this.numerado = numerado;
        this.denominador = denominador;
    }
    
    
}