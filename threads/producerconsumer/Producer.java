package producerconsumer;

public class Producer implements Runnable {
    
    QStructure q;
    Thread t;
    
    Producer(QStructure q) {
        this.q = q;
        this.t = new Thread(this, "Producer");
        this.t.start();
    }
    
    @Override
    public void run() {
        int i = 0;
                
        while (true) {
            q.put(i++);

            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                // Do nothing
            }
        }
        
    }
}
