package Doubly_list;

public class basic {

    // Node class
    static class Node {
        int val;
        Node prev;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;
    int size;

    // Constructor
    public basic() {
        head = null;
        tail = null;
        size = 0;
    }

    // Get value at index
    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // Add at head
    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    // Add at tail
    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (size == 0) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    // Add at specific index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) return;

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        Node prevNode = temp.prev;

        prevNode.next = newNode;
        newNode.prev = prevNode;

        newNode.next = temp;
        temp.prev = newNode;

        size++;
    }

    // Delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        if (index == 0) {
            head = head.next;
            if (head != null)
                head.prev = null;
            else
                tail = null;

            size--;
            return;
        }

        if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        }

        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

        size--;
    }

    // Print list forward
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void printReverse() {

        Node temp = tail;   // Start from last node

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;   // Move backward
        }

        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        basic list = new basic();

        list.addAtHead(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtIndex(1, 15);   // 10 15 20 30

        System.out.println("Linked List Elements:");
        list.printList();

        list.deleteAtIndex(2);    // remove 20

        System.out.println("After Deletion:");
        list.printList();
        System.out.println("Linked list print reverse");
        list.printReverse();
    }
}
