package modelos;

import behavior.QuackBehavior;
import behavior.VooBehavior;

/**
 *
 * @author guilhermewolner
 */
public class Pato {
    
    String nomePato;
    
    //Atributos de apoio ao comportamento próprio e dinâmico dos patos
    VooBehavior vooBehavior;
    QuackBehavior quackBehavior;
    

    
    public void nadar(){
        System.out.println(nomePato+" está nadando...");
    }
    
    public void exibir(){
        System.out.println("Imagem do pato "+nomePato);
    }
    
    //Métodos que chamam métodos específicos dos atributos de apoio
    public void performVoo(){
        this.vooBehavior.voar();
    }
    
    public void performQuack(){
        this.quackBehavior.quack();
    }
    
    
//    //Implementação trocada pelo uso do GoF Strategy
//    public void quack(){
//        System.out.println(nomePato+" fez quack!");
//    }   
    
//    //Implementação trocada pelo uso do GoF Strategy
//    public void voar(){
//        System.out.println(nomePato+" está voando!");
//    }

    //Métodos que atribuem comportamentos dinamicamente
    public void setVooBehavior(VooBehavior vooBehavior) {
        this.vooBehavior = vooBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
  
    
}
