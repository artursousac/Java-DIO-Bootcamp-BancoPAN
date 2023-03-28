package desafio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso1.setTitulo("Curso JS");
		curso1.setDescricao("Descrição curso js");
		curso1.setCargaHoraria(4);
		
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria Java");
		mentoria.setData(LocalDate.now());
		
		//System.out.println(curso1);
		//System.out.println(curso2);
		//System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricacao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devArtur = new Dev();
		devArtur.setNome("Artur");
		devArtur.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Artur: "+devArtur.getConteudosInscritos());
		devArtur.progredir();
		System.out.println("Conteúdos Concluidos Artur: "+devArtur.getConteudosConcluidos());
		System.out.println("XP: "+devArtur.calcularTotalXp());
		
		System.out.println("- - - - - - - - - - - - - - - - -");
		
		Dev devYuri = new Dev();
		devYuri.setNome("Yuri");
		devYuri.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Yuri: "+devYuri.getConteudosInscritos());
		devYuri.progredir();
		devYuri.progredir();
		devYuri.progredir();
		System.out.println("Conteúdos Concluidos Yuri: "+devYuri.getConteudosConcluidos());
		System.out.println("XP: "+devYuri.calcularTotalXp());

	}

}
