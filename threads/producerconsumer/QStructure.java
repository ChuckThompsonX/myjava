package myjava.threads.producerconsumer;

public class QStructure {
    
    int n;
    boolean valueSet = false;
    
    synchronized int get() {
        while (!valueSet) {
            try {
                // tell calling thread to give up monitor and go to sleep
                // until some other thread enters the same monitor and calls notify()
                wait(); 
            } 
            catch (InterruptedException e) {
                System.out.println("InterruptedException caught " + e.getMessage());
            }
        }
        
        System.out.println("Got: " + n);
        valueSet = false;
        notify(); // wakes up thread that called wait on same object
        return n;
    }
    
    synchronized void put(int n) {
        while (valueSet) {
            try {
                // tell calling thread to give up monitor and go to sleep
                // until some other thread enters the same monitor and calls notify()
                wait();
            } 
            catch (InterruptedException e) {
                System.out.println("InterruptedException caught " + e.getMessage());
            }
        }
        
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify(); // wakes up thread that called wait on same object
    }
}
