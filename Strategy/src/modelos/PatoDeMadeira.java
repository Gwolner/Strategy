package modelos;

import behavior.NaoVoar;
import behavior.Silencio;

/**
 *
 * @author guilhermewolner
 */
public class PatoDeMadeira extends Pato{
    
    public PatoDeMadeira(){
        super.nomePato = "Pato de madeira";
        super.quackBehavior = new Silencio();
        super.vooBehavior = new NaoVoar();
    }
    
//    //Implementação trocada pelo uso do GoF Strategy
//    @Override
//    public void quack(){
//        System.out.println("<< Silêncio >>");
//    }
    
}
