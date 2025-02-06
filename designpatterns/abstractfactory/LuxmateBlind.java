package abstractfactory;

/**
 *
 * @author Chuck
 */
public class LuxmateBlind extends Blind {
    
    LuxmateBlind() {
        super();
    }
    
    LuxmateBlind(String serialNumber, String name) {
        super(serialNumber, name);
        System.out.println("An Luxmate blind was created.");
        System.out.println("Name: " + name + " Serial #: " + serialNumber + "\n");
    }
}
