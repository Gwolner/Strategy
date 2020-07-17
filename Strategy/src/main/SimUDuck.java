package main;

import behavior.Foguete;
import modelos.CabecaVermelha;
import modelos.Mallard;
import modelos.PatoDeBorracha;
import modelos.PatoDeMadeira;


/**
 *
 * @author guilhermewolner
 */
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
}
