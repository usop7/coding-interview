public class ReturnKthToLast {

    public Node returnKthToLast(Node head, int k) {
        Node first = head;
        Node second = head;
        int n = 0;
        while (n < k && first != null) {
            first = first.next;
            n++;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }
}