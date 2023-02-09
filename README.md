## Prática de Java Polimorfismo: entenda herança e interfaces

Material de estudos práticos do Programa ONE da Oracle

### Anotações

* Eclipse: criação de método dos atributos - selecionar "Source > Generate Getters e Setters..." na janela selecionamos quais atributos desejamos gerar os getters e setters.
* Usando herança no Java através de palavra chave extends.
* Classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe.
* Benefício da herança: Reutilização do código.
* Atalho Eclipse: CTRL + SHIFT + C é para comentar e descomentar.
* Modificadores de visibilidade: private(apenas visível dentro da classe) < protected(visível dentro da classe e também para as filhas) < public(visível em todo lugar).
* Classe mãe é chamada de super ou base class.
* Classe filha também é chamada de sub class. 
* Uma classe pode ter várias filhas, mas apenas uma mãe. A partir de uma instância de uma classe filha, podemos chamar qualquer método público que tenha sido declarado na classe mãe.
* Herança com Java > Reutilização de código > Polimorfismo

* Conceitos de herança, construtores e polimorfismo.
* A utilização da anotação @Override: é usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado.
* Construtores não são herdados.
* Construtor da classe mãe pode ser chamado através do super().
* Classes e métodos abstratos não tem relação direta com consumo de memória.
* Classes abstratas: podem ter atributos, podem ter métodos concretos (com implementação), podem ter métodos abstratos (sem implementação) dessa forma obrigamos um filho implementar o método, não podem instanciar objetos de uma classe abstrata.
* Interfaces: utilizada de forma para conseguir polimorfismo sem herança.
* Conceito do Polimorfismo: capacidade de um objeto ser referenciado por vários tipos, quando uma classe extende de outra ou também quando uma classe implementa uma interface.
* Não existe herança múltipla em Java.
