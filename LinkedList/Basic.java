class Node {
    Node next = null;
    int data;

    public Node(int d) {
        this.data = d;
    }

    // append to tail
    void appendToTail(int d) {
        Node newNode = Node(d);
        Node curr = this;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // Delete a Node
    Node deleteNode(Node head, int d) {
        Node curr = head;

        // check the head first
        if (curr.data == d) {
            return head.next;
        }

        while (curr.next != null) {
            if (curr.next.data == d) {
                curr.next = curr.next.next;
                return head;
            }     
            curr = curr.next;
        }
        return head;
    }

}

public class Basic {

    public static void main(String[] args) {

    }
}