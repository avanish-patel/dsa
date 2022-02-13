class Stack {

    private int array[];
    private int capacity;
    private int top;

    // Create stack of size
    Stack(int size) {
        array = new int[size];
        capacity = size;
        top = -1;
    }

    // return true top = capacity -1
    public boolean isFull() {
        return top == capacity - 1;
    }

    // return true if top == -1
    public boolean isEmpty() {
        return top == -1;
    }

    // add new element to the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full...");
            System.exit(1);
        }
        System.out.println("Inserting " + item);
        array[++top] = item;
    }

    // remove top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty...");
            System.exit(1);
        }
        System.out.println("Removing " + array[top]);
        array[top] = 0;
        return array[top--];
    }

    // print items in a stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();
        stack.pop();

        stack.printStack();
    }

}