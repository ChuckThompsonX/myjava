package abstractfactory;

/**
 *
 * @author Chuck
 */
public class LightBulb {
    
    String name;
    String serialNumber;
    Integer watts;
    
    LightBulb() {
        name = "";
        serialNumber = "";
        watts = 0;
    }
    
    LightBulb(String name, String serialNumber, Integer watts) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.watts = watts;
    }
    
}
