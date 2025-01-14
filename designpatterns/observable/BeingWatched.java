package myjava.designpatterns.observable;

import java.util.Observable;

public class BeingWatched extends Observable {
    
    // I'm the publisher because I can be observed
    // My goal is to let people (objects) watching me know that I changed
    
    void counter(Integer period) {
        while (period >= 0) {
            // Something has changed
            setChanged();
            
            Integer intVal = new Integer(period);
            // Notify all observers that it has changed by calling their update() method
            notifyObservers(intVal);
            
            waitSomeTime(100);
            period--;
        }
    }
    
    void waitSomeTime(Integer ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted.");
        }        
    }
}
