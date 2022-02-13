public class Queue {

    private int array[];
    private int capacity;
    private int front, rear;

    Queue(int size) {
        array = new int[size];
        capacity = size;
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full...");
            System.exit(1);
        }
        if (front == -1)
            front = 0;
        array[++rear] = item;
        System.out.println("Inserted : " + item);
    }

    public void deQueue() {
    }
}
