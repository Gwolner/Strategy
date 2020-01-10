package modelos.patos;

import behavior.Grasnar;
import behavior.BaterAsas;

/**
 *
 * @author guilhermewolner
 */
public class CabecaVermelha extends Pato{
    
    public CabecaVermelha(){
        super.nomePato = "Cabeça-Vermelha";
        super.quackBehavior = new Grasnar();
        super.vooBehavior = new BaterAsas();
    }
}
