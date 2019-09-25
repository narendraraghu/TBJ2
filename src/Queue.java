public class Queue {

    private int maxSize,front,rear,count;
    int queueArrr[];

    String str ="znstrf", sddf="dfsdg";
    Queue(int maxSize)
    {
        this.maxSize = maxSize;
        this.queueArrr = new int[maxSize];
        this.front=0;
        this.rear=-1;
        this.count=0;
    }
}
