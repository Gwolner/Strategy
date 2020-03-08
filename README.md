# SimUDuck - Simulador de patos

Simulador de patos que permite visualizar diversos comportamentos dos mais variádos tipos de patos, sejam animais (Marreco, Cabeça-Vermelha, Mallard) ou objetos inanimados (Pato de borracha, Pato de madeira.)

## Objetivo

O objetivo deste projeto é resolver o problema de atribuir comportamentos próprios para cada tipo de pato (sub-classes de Patos) sem utilizar-se, unicamente, do conceito de Herança de modo a evitar que patos inanimados possam se comportar como patos reais.

Pato de borracha voar e Pato de madeira grasnar, por exemplo.

## GoF Strategy

A solução foi adotar o padrão comportamental Strategy, um dos tipos de Padrões de Projetos conhecido como GoF(Gang of Four). Com ele, não só é possível atribuir comportamentos próprios para cada sub-classe, como também é possivel alterar este comportamento dinamicamente.

Sendo asssim, um pato de borracha não irá voar nem irá grasnar, mas sim permanecer imóvel e emitir um som de apito. O pato de madeira não irá voar e não irá emitir som algum. Já os patos reais irão grasnar e voar livremente.

Um exemplo de mudança dinamica no comportamento seria, por exemplo, atribuir ao pato de madeira a caracteristica de voar através de um foguete. Esta alteração de comportamento pode ser visto abaixo.

```java
public class SimUDuck {

    public static void main(String[] args) {
        
        //Forma baseada no padrão GoF Strategy
        Mallard mallard = new Mallard();
        
        mallard.exibir();
        mallard.performQuack();
        mallard.nadar();
        mallard.performQuack();
        mallard.performVoo();
        
        System.out.println("\n");
        
        CabecaVermelha cv = new CabecaVermelha();
        
        cv.exibir();
        cv.performQuack();
        cv.nadar();
        cv.performQuack();
        cv.performVoo();
        
        System.out.println("\n");
        
        PatoDeBorracha pdb = new PatoDeBorracha();
        
        pdb.exibir();
        pdb.performQuack();
        pdb.nadar();
        pdb.performQuack();
        pdb.performVoo();
        
        System.out.println("\n");
        
        PatoDeMadeira pdm = new PatoDeMadeira();
        
        pdm.exibir();
        pdm.performQuack();
        pdm.nadar();
        pdm.performQuack();
        pdm.performVoo();
        
        System.out.println("\nUm foguete será equipado no Pato de Madeira \n");
        
        pdm.exibir();
        pdm.setVooBehavior(new Foguete());
        pdm.performVoo();
    }
```

```java
//Saída
Imagem do pato Mallard
Quack!!
Mallard está nadando...
Quack!!
Está voando!


Imagem do pato Cabeça-Vermelha
Quack!!
Cabeça-Vermelha está nadando...
Quack!!
Está voando!


Imagem do pato Pato de borracha
Squeeeak!!
Pato de borracha está nadando...
Squeeeak!!
Não pode voar!


Imagem do pato Pato de madeira
<< Silêncio >>
Pato de madeira está nadando...
<< Silêncio >>
Não pode voar!

Um foguete será equipado no Pato de Madeira 

Imagem do pato Pato de madeira
>>Decolando<<
```

## Ideia do projeto

O simulador de patos foi inspirado no exemplo-problema abordado no livro "Use a Cabeça! Padrões de Projetos", 2ª edição revisada da Editora Alta Books.
