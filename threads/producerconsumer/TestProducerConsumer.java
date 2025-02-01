/*
 * Two threads, Producer & Consumer, put stuff into a QStructure and
 * take out stuff from the QStructure concurrently.  The goal is to
 * get the two threads to work together by not not letting the Producer
 * put stuff in the QStructure without the Consumer taking it out, and 
 * by not letting the Consumer take stuff out that the Producer hasn't
 * already produced.
 * 
 */
package myjava.threads.producerconsumer;

public class TestProducerConsumer {
    
    public static void main(String... args) {
        QStructure q = new QStructure();
        new Producer(q);
        new Consumer(q);
    }
}
