package myjava.abstractfactory;

public class Blind {
    
    String serialNumber;
    String name;
    
    Blind() {
        serialNumber = "";
        name = "";
    }
    
    Blind(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }
}
