public class Queue {

    int maxSize;
    int queueArrr[];
    int front;
    int rear;
    int count;
    Queue(int maxSize)
    {
        this.maxSize = maxSize;
        this.queueArrr = new int[maxSize];
        this.front=0;
        this.rear=-1;
        this.count=0;


        //TODO
    }
}
