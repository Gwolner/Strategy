package modelos;

import behavior.Apitar;
import behavior.NaoVoar;

/**
 *
 * @author guilhermewolner
 */
public class PatoDeBorracha extends Pato{
    
    public PatoDeBorracha(){
        super.nomePato = "Pato de borracha";
        super.quackBehavior = new Apitar();
        super.vooBehavior = new NaoVoar();
    }
    
//    //Implementação trocada pelo uso do GoF Strategy
//    @Override
//    public void quack(){
//        System.out.println("Squeeeak");
//    }
    
}
