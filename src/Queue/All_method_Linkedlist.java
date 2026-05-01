package Queue;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue1 {
    Node front, rear;
    int size;

    // Constructor
    void Queue() {
        front = rear = null;
        size = 0;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue (Insert element)
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    // Dequeue (Remove element)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;
        return value;
    }

    // Peek (Front element)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    // Get rear element
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return rear.data;
    }

    // Get size
    public int getSize() {
        return size;
    }

    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class All_method_Linkedlist {
    public static void main(String[] args) {
        Queue1 q = new Queue1();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();   // 10 20 30

        System.out.println(q.dequeue()); // 10
        System.out.println(q.peek());    // 20

        q.display();   // 20 30
    }
}
