package observable;

import java.util.Observable;
import java.util.Observer;

public class Watcher1 implements Observer {
    
    // I am observer #1
    
    @Override
    public void update(Observable obj, Object arg) {
        Integer iVal = ((Integer) arg).intValue();
        // I'm simply reacting here to what happens with BeingWatched
        System.out.println("WATCHER 1: update() called, count is " + iVal);
    }
    
}
