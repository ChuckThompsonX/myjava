package abstractfactory;

/**
 *
 * @author Chuck
 */
public class LuxmateFactory extends HouseFactory {
    
    LuxmateBulb luxmateBulb;
    LuxmateBlind luxmateBlind;
    
    @Override
    public void createBulb() {
        // Implementation deferred to specific subclass
        luxmateBulb = new LuxmateBulb("Luxmate1", "1234", 120);
    }
    
    @Override
    public void createBlind() {
        // Implementation specific code
        luxmateBlind = new LuxmateBlind("1234", "LuxmateBlinder");
    }
}
