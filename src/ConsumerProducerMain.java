import java.util.LinkedList;

class ConsumerProducer
{

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;


    public void consume() throws InterruptedException {
        int value = 0;

            synchronized (this) {
                while (list.size()==0)
                    wait();
                System.out.println("Producer consumed-"
                        + value);

                // to insert the jobs in the list
                list.removeFirst();

                // notifies the consumer thread that
                // now it can start consuming
                notify();
                Thread.sleep(1000);
            }



    }

    public void produce() throws InterruptedException {
        int value = 0;

            synchronized (this) {
                while (list.size() == capacity)
                    wait();
                System.out.println("Producer produced-"
                        + value);

                // to insert the jobs in the list
                list.add(value++);

                // notifies the consumer thread that
                // now it can start consuming
                notify();
                Thread.sleep(1000);
            }

    }
}

public class ConsumerProducerMain  {


    public static void main(String[] args) throws InterruptedException {

        final ConsumerProducer consumerProducer = new ConsumerProducer();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumerProducer.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumerProducer.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });


        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }
}
