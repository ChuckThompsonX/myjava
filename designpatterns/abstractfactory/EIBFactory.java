package myjava.abstractfactory;

public class EIBFactory extends HouseFactory {
    
    LightBulb eibBulb;
    Blind eibBlind;
    
    @Override
    public void createBulb() {
        // Implementation specific code
        eibBulb = new EIBBulb("EIBBulb1", "1234", 120);
    }
    
    @Override
    public void createBlind() {
        // Implementation specific code
        eibBlind = new EIBBlind("1234", "EIBBlinders");
    }
}
