class Node {
    Node next = null;
    int data;

    public Node(int d) {
        this.data = d;
    }
}

public class SumList {

    public static Node sum(Node a, Node b) {
        Node curr = new Node(0);
        Node dummyHead = curr;
        int carry = 0;
        while (a != null || b != null || carry > 0) {
            int value = carry + (a == null ? 0 : a.data) + (b == null ? 0 : b.data);
            if (value >= 10) {
                carry = 1;
                value -= 10; 
            } else {
                carry = 0;
            }

            Node sum = new Node(value);
            curr.next = sum;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
            curr = curr.next;
        }
        return dummyHead.next;
    }

    public static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-");
            n = n.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(7);
        Node b = new Node(1);
        Node c = new Node(6);

        Node d = new Node(5);
        Node e = new Node(9);
        Node f = new Node(2);
        a.next = b;
        b.next = c;
        
        d.next = e;
        e.next = f;
        
        printList(a);
        System.out.println();
        printList(d);
        System.out.println();
        printList(sum(a, d));


    }
}