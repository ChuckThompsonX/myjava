package abstractfactory;

/**
 *
 * @author Chuck
 */
public class TheftApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        
        HouseFactory houseFactory;
        
        // I want to create an EIB bulb
        houseFactory = new EIBFactory();
        houseFactory.createBulb(); // I can call the same method every time for any manufacturer
        
        // I want to create a Luxmate blind
        houseFactory = new LuxmateFactory();
        houseFactory.createBlind(); // I can call the same method every time for any manufacturer
        
        houseFactory = new LuxmateFactory();
        houseFactory.createBulb(); // I can call the same method every time for any manufacturer
        
        // In the future I can easily add another manufacturer here
        // And easily call the same method to create a product
        
        // Do you see how we let the House Factory take care of everything?
    }
}
