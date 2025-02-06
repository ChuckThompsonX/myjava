package abstractfactory;

/**
 *
 * @author Chuck
 */
public class EIBBlind extends Blind {
    
    EIBBlind() {
        super();
    }
    
    EIBBlind(String serialNumber, String name) {
        super(serialNumber, name);
        System.out.println("An EIB blind was created.");
        System.out.println("Name: " + name + " Serial #: " + serialNumber + "\n");
    }
}
