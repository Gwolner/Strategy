# SimUDuck - Simulador de patos

Simulador de patos que permite visualizar diversos comportamentos dos mais variádos tipos de patos, sejam animais (Marreco, Cabeça-Vermelha, Mallard) ou objetos inanimados (Pato de borracha, Pato de madeira.)

## Objetivo

O objetivo deste projeto é resolver o problema de atribuir comportamentos próprios para cada tipo de pato (sub-classes de Patos) sem utilizar-se, unicamente, do conceito de Herança de modo a evitar que patos inanimados possam se comportar como patos reais.

Pato de borracha voar e Pato de madeira grasnar, por exemplo.

## GoF Strategy

A solução foi adotar o padrão comportamental Strategy, um dos tipos de Padrões de Projetos conhecido como GoF(Gang of Four). Com ele, não só é possível atribuir comportamentos próprios para cada sub-classe, como também é possivel alterar este comportamento dinamicamente.

Sendo asssim, um pato de borracha não irá voar nem irá grasnar, mas sim permanecer imóvel e emitir um som de apito. O pato de madeira não irá voar e não irá emitir som algum. Já os patos reais irão grasnar e voar livremente.

Um exemplo de mudança dinamica no comportamento seria, por exemplo, atribuir ao pato de madeira a caracteristica de voar através de um foguete. Esta alteração de comportamento pode ser visto no snippet abaixo.

```java
PatoDeMadeira pdm = new PatoDeMadeira();
pdm.exibir();
pdm.setVooBehavior(new Foguete());
pdm.performVoo();
```

## Ideia do projeto

O simulador de patos foi inspirado no exemplo-problema abordado no livro "Use a Cabeça! Padrões de Projetos", 2ª edição revisada da Editora Alta Books.
