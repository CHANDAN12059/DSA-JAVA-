package LinkedList;

public class linkedList {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
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
        tail = newNode;
    }

    public void addMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

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
        size--;
    }

    public void removeLast() {

        if (size == 0) {
            return;
        } else if (size == 1) {
            head = tail = null;
            size = 0;
            return;
        }

        Node temp = head;

        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;

    }

    public int search(int num) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == num) {
                return i;
            }
            i++;
            temp = temp.next;

        }

        return -1;

    }

    public void reverse() {

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void removeNodeFromEnd(int n) {

        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (sz == n) {
            head = head.next;
            return;
        }

        Node prev = head;
        int i = 1;
        while (i < sz - n) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;

    }

    public Node mid() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public boolean palindrome() {

        if (head == null || head.next == null) {
            return true;
        }
        Node midElement = mid();

        Node prev = null;
        Node curr = midElement;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;
        Node leftHead = head;

        while (rightHead != null) {

            if (leftHead.data != rightHead.data) {
                return false;

            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;

        }

        return true;

    }

    public void print() {
        if (head == null) {
            System.out.println("Empty linkedList");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");

    }

    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(2);
        // ll.addLast(1);
        // ll.addMiddle(300, 2);
        // ll.removeLast();
        ll.print();
        // ll.reverse();
        // ll.print();
        ll.removeNodeFromEnd(3);
        System.out.println(ll.palindrome());
        ll.print();

        // System.out.println("Element found at index = " + ll.search(1));
        // System.out.println(ll.size);
    }
}
