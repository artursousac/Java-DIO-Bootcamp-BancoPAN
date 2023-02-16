package tiposVariaveis;

public class tiposVariaveis {

public static void main(String[] args) {

String meuNome = "Artur Cavalcante";

double salarioMinimo = 2500.33;
float salarioTeste = 2500.33f;
long salarioTeste2 = 2500L;


short numeroCurto = 1;
int numeroNormal = numeroCurto;
short numeroCurto2 = (short) numeroNormal;

// Por convenção, Constante são sempre escritas em CAIXA ALTA.

int numero = 5;

numero = 10;

System.out.print("Valor do número é: " + numero);

final double VALOR_DE_PI = 3.14; // Utilizando a palavra final ela vira constante.

// VALOR_DE_PI = 10.75; dará problema, pois valor de pi não é mutável com o final.
System.out.print("\nValor de PI é: " + VALOR_DE_PI);
}

}
