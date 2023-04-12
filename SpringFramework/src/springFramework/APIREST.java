package springFramework;

public class APIREST {
/*
 * Arquitetura baseada na camada de serviço REST.
 * Cliente obtem resposta no formato JSON.
 * 
 * API é um código programável que faz a "ponte" de comunicação
 * entre duas aplicações distintas.
 * 
 * API REST:É como um guia de boas práticas
 * API RESTful: É a capacidade de determinado sistema aplicar os
 * princípios de REST.
 * 
 * Nem todos API utilizam uma convenção REST.
 * 
 * Princípios para que uma arquitetura seja RESTful:
 * - Cliente-Servidor
 * - Interface Uniforme (Interação uniforme entre cliente e servidor)
 * - Stateless (Interação via API tem acesso a dados completos e compreensiveis.)
 * - Cache (Reduzir o tempo médio de resposta)
 * - Camada (Arquitetura menos complexo e altamente flexível)
 * 
 * Glory of REST:
 * 0: The Swamp of POX
 * - Ausência de Regras. É considerado o nível mais básico e uma API
 * que implementa apenas esse nível não pode ser considerada REST,
 * pois não segue qualquer padrão.
 * 1: Resources
 * - Mais seletivos nos verbos para cada operação e o nome dos recursos
 * são equalizados.
 * 2: HTTP Verbs
 * - Forte dependência do nível 1. Valida e aplica os verbos para
 * finalidades específicas.
 * 3: Hypermedia Controls
 * - Fornece aos seus clientes links que indicarão como poderá ser
 * feita a navegação entre seus recursos. Ou seja, quem for
 * consumir a API precisará saber apenas a rota principal e a resposta
 * dessa arquisição terá todas as demais rotas possíveis.
 * Nível 3 é o menos explorado e o Nível 2 é o mais explorado.
 * 
 * Controller disponibiliza as funcionalidades de negócio da aplicação
 * por meio do protocolo HTTP.
 * 
 * @RestController é responsável por designar o bean de component que suporta requisições
 * HTTP com base na arquitetura REST.
 * @RequestMapping("prefix") determina qual a URI comum para todos os recursos disponibilizados
 * pelo Controller.
 * @GetMapping determina que o método irá aceitar requisições HTTP do tipo GET.
 * @PostMapping determina que o método irá aceitar requisições HTTP do tipo POST.
 * @PutMapping determina que o método irá aceitar requisições HTTP do tipo PUT.
 * @DeleteMapping determina que o método irá aceitar requisições HTTP do tipo DELETE.
 * @RequestBody: Converte um JSON para o tipo do objeto esperado como parâmetro no método.
 * @PathVariable: Consegue determinar que parte da URI será composta por parâmetros recebidos
 * nas requisições.
 * 
 * 
 */
}
