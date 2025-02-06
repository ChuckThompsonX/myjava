package abstractfactory;

/**
 *
 * @author Chuck
 */
public class LuxmateBulb extends LightBulb {
    
    LuxmateBulb() {
        super();
    }
    
    LuxmateBulb(String name, String serialNumber, Integer watts) {
        super(name, serialNumber, watts);
        System.out.println("A Luxmate Bulb was created.");
        System.out.println("Name: " + name + " Serial #: " + serialNumber + " Watts: " + watts + "\n");
    }
}
