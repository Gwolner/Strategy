package behavior;

/**
 *
 * @author guilhermewolner
 */
public class Silencio implements QuackBehavior{
    
    @Override
    public void quack() {
        System.out.println("<< Silêncio >>");
    }
}
