package modelos;

import behavior.Grasnar;
import behavior.BaterAsas;

/**
 *
 * @author guilhermewolner
 */
public class Mallard extends Pato{
 
    public Mallard(){
        super.nomePato = "Mallard";
        super.quackBehavior = new Grasnar();
        super.vooBehavior = new BaterAsas();        
    }
}
