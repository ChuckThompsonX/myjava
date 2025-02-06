package abstractfactory;

/**
 *
 * @author Chuck
 */
public class EIBBulb extends LightBulb {
    
    EIBBulb() {
        super();
    }
    
    EIBBulb(String name, String serialNumber, Integer watts) {
        super(name, serialNumber, watts);
        System.out.println("An EIB Bulb was created.");
        System.out.println("Name: " + name + " Serial #: " + serialNumber + " Watts: " + watts + "\n");
    }
}
