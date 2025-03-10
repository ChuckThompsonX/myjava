package myjava.threads.producerconsumer;

public class Consumer implements Runnable {
    
    QStructure q;
    Thread t;
    
    Consumer(QStructure q) {
        this.q = q;
        this.t = new Thread(this, "Consumer");
        this.t.start();
    }
    
    @Override
    public void run() {
        while (true) {
            q.get();

            try {
                Thread.sleep(500);
            } 
            catch (InterruptedException ex) {
                // Do nothing
            }
        }
    }
}
