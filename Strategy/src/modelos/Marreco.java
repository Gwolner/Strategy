package modelos;

import behavior.BaterAsas;
import behavior.Grasnar;

/**
 *
 * @author guilhermewolner
 */
public class Marreco extends Pato {
    
    public Marreco(){
        super.nomePato = "Marreco";
        super.quackBehavior = new Grasnar();
        super.vooBehavior = new BaterAsas();
    }
}
