import java.util.HashSet;

// Remove duplicates from an unsorted linked list
public class RemoveDups {

    public Node removeDups(Node head) {
        HashSet<Integer> set = new HashSet<>();

        Node curr = head;
        if (curr != null)
            set.add(curr.data);

        while (curr.next != null) {
            if (set.contains(curr.next.data)) {
                curr.next = curr.next.next;
            } else {
                set.add(curr.next.data);
            }
            curr = curr.next;
        }
        return head;
    }


    public void removeDups2(Node head) {
        HashSet<Integer> set = new HashSet<>();
        Node prev = null;
        while (head != null) {
            if (set.contains(head.data)) {
                prev.next = head.next;
            } else {
                set.add(head.data);
                prev = head;
            }
            head = head.next;
        }
    }

    public void removeDups3(Node head) {
        Node curr = head;
        while (curr != null) {
            Node runner = curr;
            while (runner.next != null) {
                if (runner.next.data == curr.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }

            }
            curr = curr.next;
        }
    }

}