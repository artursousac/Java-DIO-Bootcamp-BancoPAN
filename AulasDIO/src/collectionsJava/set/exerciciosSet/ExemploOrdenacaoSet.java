package collectionsJava.set.exerciciosSet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 * Dadas as seguintes informações sobre minhas séries favoritas,
 * crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo de episodio)
 * 
 * Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
 * Série 2 = Nome: dark, genero: drama, tempoEpisodio: 60
 * Série 3 = Nome: that '70s show, genero: comédia, tempoEpisodio: 25
 */

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {
		
		System.out.println("\n--Ordem aleatória--");
		Set<Serie> minhasSeries = new HashSet<>();
		
		minhasSeries.add(new Serie("got", "fantasia", 60)); //Como "minhasSeries" é uma coleção de objetos do tipo Serie, então é necessário utilizar o new;
		minhasSeries.add(new Serie("dark", "drama", 60));
		minhasSeries.add(new Serie("that '70s show", "comédia", 25));
		
		//Como é algo do modelo "Set", então ele não irá levar em conta a ordem de inserção.
		for(Serie s : minhasSeries) {
			System.out.println(s.getNome()+" - "+s.getGenero()+" - "+s.getTempoEpisodio());
		}
		
		//Agora vamos colocar em Ordem de Inserção. Para isso, utilizamos o LinkedHashSet.
		System.out.println("\n--Ordem Inserção--");
		Set<Serie> minhasSeries1 = new LinkedHashSet<>();
		
		minhasSeries1.add(new Serie("got", "fantasia", 60));
		minhasSeries1.add(new Serie("dark", "drama", 60));
		minhasSeries1.add(new Serie("that '70s show", "comédia", 25));
		
		for(Serie s : minhasSeries1) {
			System.out.println(s.getNome()+" - "+s.getGenero()+" - "+s.getTempoEpisodio());
		}
		
		//Agora vamos colocar em Ordem Natural. Para isso, utilizamos o TreeSet.
		System.out.println("\n--Ordem Natural (Tempo de Episódio)--");
		Set<Serie> minhasSeries2 = new TreeSet<>();
		//É necessário criar um comparable para utilizar o TreeSet.
		minhasSeries2.add(new Serie("got", "fantasia", 60));
		minhasSeries2.add(new Serie("dark", "drama", 60));
		minhasSeries2.add(new Serie("that '70s show", "comédia", 25));
		//Como está comparando por tempo e existem 2 tempos iguais e o Set não permite dois valores iguais, então só irá aparecer 1.
		//Para isso, fazemos uma condição no compareTo para verificar se a idade é igual e se for, comparar por genero.
		for(Serie s : minhasSeries2) {
			System.out.println(s.getNome()+" - "+s.getGenero()+" - "+s.getTempoEpisodio());
		}
		//Comparando por Nome, Genero e Tempo de Episodio.
		//Para isso, usamos o Comparator;
		System.out.println("\n--Ordem Nome/Gênero/TempoEpisodio--");
		Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		
		minhasSeries3.addAll(minhasSeries);
		
		for(Serie s : minhasSeries3) {
			System.out.println(s.getNome()+" - "+s.getGenero()+" - "+s.getTempoEpisodio());
		}
	}

}

//Criação da Classe Série
//Para utilizar o TreeSet, precisamos implementar o comparable.
//Após implementar o comparable, ele vai pedir para implementar o método compareTo.
class Serie implements Comparable<Serie>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	//Criação do Construtor
	public Serie(String nome, String genero, Integer tempoEpisodio) {
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}
	
	//Criação dos Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}
	
	//Quando se usa Hash's, é aconselhável que sobrescreva os equals e hash;

	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Serie other = (Serie) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}
	
	//Como queremos na Ordem Natural e estamos utilizando a ordem natural para tempo de episodio, fazemos:
	@Override
	public int compareTo(Serie serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if(tempoEpisodio != 0) {
			return tempoEpisodio;
		}
		return this.getGenero().compareTo(serie.getGenero());
		//return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio()); Como é Set, esta opção iria excluir qualquer outra opção que tivesse valor de tempo igual.
	}
	
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

	@Override
	public int compare(Serie s1, Serie s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if(nome != 0) {
			return nome;
		}
		//Quando é string, utilizamos o compareTo;
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if(genero != 0) {
			return genero;
		}
		//Integer já possui o método compare;
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
}
