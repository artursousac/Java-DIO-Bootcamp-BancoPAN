package pooJava.relacoes;

public class ConceitosRelacoes {
	/*
	 * HERANÇA:
	 * É o relacionamento entre classes em que uma classe chamada
	 * de subclasse é uma extensão, um subtipo, de outra classe chamada de superclasse.
	 * Devido a isto, a subclasse consegue reaproveitar os atributos e métodos
	 * dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.
	 * 
	 * Herança é para criar subtipos, mais especializados, de tipos que já existem.
	 * Membros se refere a atributos e métodos de uma classe.
	 * 
	 * class A extends B {...} faz com que A seja um subtipo de B.
	 * 
	 * Tipos de herança: Simples: A classe filha tem só uma classe mãe.
	 * Múltipla: A classe filha tem uma ou mais classes mães. (JAVA NÃO POSSUI HERANÇA MÚLTIPLA);
	 * 
	 * Upcast: É quando sobe na hierarquia de classes.
	 * A a = new B ();
	 * Downcast: É quando desce na hierarquia. É uma operação perigosa e aconselhável de não ser utilizada.
	 * B a = (B) new A();
	 * 
	 * Polimorfismo: A mesma ação que (SEMPRE) se comporta de modo diferente.
	 * 
	 * Sobrescrita: A mesma ação que PODE se comportar diferente.
	 * 
	 * ASSOCIAÇÃO:
	 * Possibilita um relacionamento entre classes/objetos, no qual possam pedir ajuda a outras classes/objetos
	 * e representar de forma completa o conceito ao qual se destinam.
	 * Ou seja, as classes e objetos interagem entre si para atingir seus objetivos.
	 * 
	 * Tipos: 
	 * -> Estrutural (Atributos): - Composição; - Agregação.
	 * Composição: "Com Parte Todo". Ex: Pessoa e Endereço.
	 * Ou seja, se a pessoa deixa de existir, o endereço deixa de existir.
	 * class Pessoa{ Endereco endereco;}
	 * Agregação: "Sem Parte Todo". Ex: Disciplina e Aluno.
	 * Se a disciplina deixa de existir, o aluno não necessariamente deixa de existir, pois pode estar em outra disciplina.
	 * class Disciplina{ Aluno aluno;}
	 * 
	 * -> Comportamental (Métodos): - Dependência.
	 * Dependência: "Depende de ". Ex: Compra e Cupom.
	 * Quando um método depende de uma entidade objeto.
	 * class Compra{... finalizar (Cupom cupom, ...) ...}
	 * 
	 * INTERFACE:
	 * Define um contrato que deve ser seguido pela classe que a implementa.
	 * Quando uma classe implementa uma interface, ela se compromete a realizar todos os comportamentos
	 * que a interface disponibiliza.
	 * Normalmente os métodos na interface não possuem corpo, apenas assinatura.
	 * 
	 * interface A{ ...}
	 * class B implements A{ ...}
	 * 
	 * 
	 * 
	 * 
	 */
}
