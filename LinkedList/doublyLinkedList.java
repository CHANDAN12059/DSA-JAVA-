package LinkedList;

public class doublyLinkedList {
    public static class Node {

        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public void removeFirst() {
        if (head == null) {
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;

        }

        head = head.next;
        head.prev = null;
        size--;

    }

    public void removeLast() {

        if (head == null) {
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;

        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;

    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doublyLinkedList ll = new doublyLinkedList();
        ll.addFirst(100);
        ll.addFirst(200);
        ll.addLast(500);
        ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        ll.reverse();
        ll.print();
        System.out.println();
        System.out.println("size = " + size);

    }
}
