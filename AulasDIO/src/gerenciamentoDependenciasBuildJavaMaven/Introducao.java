package gerenciamentoDependenciasBuildJavaMaven;

public class Introducao {

	public static void main(String[] args) {
		/*
		 * Maven: Gerencia build e dependências de um projeto.
		 * 
		 * src > main > one > digitalInnovation > web > controller > UserController.java
		 * 
		 * controller + service + repository > JAR; other-package + component + configuration > JAR
		 * 
		 * JAR + JAR + JAR + JAR > WAR >...
		 * 
		 * Maven vem para auxiliar para empacotar, compilar todas as fontes.
		 * 
		 * Endereça como o software foi construído e suas dependências através do POM (Project Object Model).
		 * Facilita a compreensão do desenvolvedor.
		 * Fornecer informações de qualidade.
		 * 
		 * A fim de criar um projeto via linha de comando, fazemos:
		 * Entramos no diretório onde queremos criar
		 * mvn archetype.generate -DgroupId=one.digitalinnovation -DartifactId=quick-start-maven -Dartchetype=maven-archetype-quickstart -DinteractiveMode=false
		 * 
		 * Comandos: Compilar. Testar. Empacotar. Limpar diretório.
		 * 
		 * mvn compile; mvn test; mvn package; mvn clean
		 * 
		 * Template > mvn archetype >
		 * 
		 * Pesquise por maven archetype list para encontrar a opção que faz mais sentido pro cenário.
		 * Procurar pelas instruções de execução do comando mvn archetype.
		 * 
		 * O Maven é uma ferramenta de código aberto mantida pela Apache. 
		 * Trata-se de uma ferramenta de gestão de dependências e um task runner.
		 * Em outras palavras, o Maven automatiza os processos de obtenção de dependências e de compilação de projetos Java.
		 * 
		 * grupId = nome da organização ao qual pertence esse projeto, possui o mesmo padrão de nomenclatura de pacotes.
		 * artifactId = nome do projeto.
		 * version = versão do projeto, caso não seja colocado nenhum valor o Maven vai utilizar o valor padrão que é o 1.0-SNAPSHOT
		 * package = nome do pacote principal do nosso projeto, é boa prática colocar a junção do groupId com o artifactId. Caso não seja
		 * passado nenhum valor, o Maven irá assumir o mesmo valor colocado no groupId.
		 * 
		 * Dentro da pasta do projeto temos o arquivo pom.xml que contém as informações sobre o projeto
		 * e quais as suas dependências.
		 * As pastas src contém a pasta main, que irá guardar o código fonte do projeto e a pasta test irá conter
		 * os códigos fontes para os testes automatizados.
		 * Dentro de cada uma destas pastas, terá uma estrutura de pastas de acordo com o nome definido no package.
		 * 
		 * Além das pastas criadas pelo Maven, existe uma outra pasta que será criada sempre que executar o comando
		 * para que nosso projeto seja compilado, para demonstrar a criação dessa pasta devemos executar o comando
		 * mvn compile dentro da pasta do projeto.
		 * Quando utiliza o mvn compile, é criada a pasta target, esta pasta irá ter os arquivos .class do nosso projeto.
		 * 
		 * No pom.xml a gente gerencia as dependências do projeto, onde colocamos as informações das bibliotecas
		 * que o nosso projeto necessita para funcionar e o Maven vai realizar o download das bibliotecas e adiciona-las
		 * no Build Path/Classpath.
		 * 
		 * o Pom é dividido em quatro partes, ou podemos dividi-lo assim, sendo:
		 * Primeiro = Possui as coordenadas do projeto, que são os dados que identificam o projeto, como groupId, artifactId e version.
		 * Segundo = Propriedades do projeto, que existe as informações de encoding e também a versão do Java que utilizamos.
		 * Terceiro = É onde definimos as dependencias do nosso projeto.
		 * Quarto = Informações de build, que dizem como o projeto deve ser compilado pelo Maven, aqui também ta descrito quais plugins do Maven
		 * o nosso projeto necessita para ser compilado.
		 * 
		 * Super POM implementa o POM, ou seja, o POM extends do Super POM.
		 * 
		 * Repositórios existem dois, o remoto e o local;
		 * Repositório Remoto: Local central utilizado pelo Maven para buscar os artefatos.
		 * É configurado automaticamente pelo Super POM para utilizar o Maven Central.
		 * Podemos alterar a configuração para utilizar um repositório especifico a partir do Pom.xml do projeto.
		 * Também podemos modificar Via settings.xml.
		 * 
		 * 
		 * Repositório Local: É o repositório na máquina utilizado pelo Maven.
		 * Estratégia de caching. Pasta /m2.repository
		 * 
		 * Se utilizamos o mvn compile ele vai verificar se a dependência que adicionamos existe no repositório local,
		 * caso não exista, ele vai no repositório remoto para realizar o download.
		 * 
		 * mvn install publica localmente o projeto/componente.
		 * 
		 * Dependencias diretas e dependencias transitivas.
		 * Direta é a declarada no pom.xml
		 * transitiva é quando dependencias obrigatórias  das dependencias declaradas no pom.xml
		 */

	}

}
