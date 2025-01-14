package myjava.designpatterns.observable;

import java.util.Observable;
import java.util.Observer;

public class Watcher2 implements Observer {
    
    // I am observer #2
    
    @Override
    public void update(Observable obj, Object arg) {
        // Ring bell when done
        Integer iVal = ((Integer) arg).intValue();
        // I'm simply reacting here to what happens with BeingWatched
        if (iVal == 2) {
            System.out.println("WATCHER 2: Done" + '\7');
        }
    }
    
}
