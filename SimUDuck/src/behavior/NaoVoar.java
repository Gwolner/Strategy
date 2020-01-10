package behavior;

/**
 *
 * @author guilhermewolner
 */
public class NaoVoar implements VooBehavior{
    
    @Override
    public void voar() {
        System.out.println("Não pode voar!");
    }
}
