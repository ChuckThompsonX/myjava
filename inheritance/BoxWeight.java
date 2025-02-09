package myjava.inheritance;

public class BoxWeight extends Box {

    double weight;
    
    BoxWeight(double m) {
        super(0.0, 0.0, 0.0);
        weight = m;
    }
    
    BoxWeight(double w, double h, double d, double m) {
        //width = w;
        //height = h;
        //depth = d;
        super(w, h, d);
        weight = m;
    }
    
}
