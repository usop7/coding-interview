class Node {
    Node next = null;
    int data;

    public Node(int d) {
        this.data = d;
    }
}

public class Partition {

    public static Node partition(Node head, int n) {
        Node small = new Node(-1);
        Node big = new Node(-1);
        Node curr = head;
        Node smallHead = small;
        Node bigHead = big;

        while (curr != null) {
            if (curr.data < n) {
                small.next = curr;
                curr = curr.next;
                small = small.next;
                small.next = null;
            } else {
                big.next = curr;
                curr = curr.next;
                big = big.next;
                big.next = null;
            }
        }
        small.next = bigHead.next;
        return smallHead.next;

    }

    public static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-");
            n = n.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(5);
        Node e = new Node(10);
        Node f = new Node(2);
        Node g = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        printList(a);

        System.out.println();

        printList(partition(a, 5));



    }
}