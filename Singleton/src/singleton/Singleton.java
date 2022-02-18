package singleton;

/**
 *
 * @author keith
 */
public class Singleton {
    
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Hola mundo, ¿Cómo estan?");
    }
    
}
