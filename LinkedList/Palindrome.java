class Node {
    Node next = null;
    int data;

    public Node(int d) {
        this.data = d;
    }
}

public class Palindrome {

    public static boolean isPalindrome(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            Node newNode = new Node(curr.data);
            next = curr.next;
            newNode.next = prev;
            prev = newNode;
            curr = next;
        }

        while (head != null && prev != null) {
            if (head.data != prev.data)
                return false;
            head = head.next;
            prev = prev.next;
        }
        return head == null && prev == null;
    }

    public static void printList(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "-");
            n = n.next;
        }
    }

    public static void main(String[] args) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        System.out.println(isPalindrome(a));

    }
}