import java.util.*;

class Node {
    int data;
    Node left = null;
    Node right = null;

    public Node(int d) {
        data = d;
    }
}

public class ListOfDepth {

    public void createList(ArrayList<LinkedList<Node>> lists, Node n, int depth) {
        if (n == null) return;

        if (lists.size() <= depth) {
            LinkedList<Node> list = new LinkedList<>();
            lists.add(list);
        }

        lists.get(depth).add(n);
        createList(lists, n.left, depth + 1);
        createList(lists, n.right, depth + 1);

    }

    public ArrayList<LinkedList<Node>> createListOfDept(Node n) {
        ArrayList<LinkedList<Node>> lists = new ArrayList<>();
        createList(lists, n, 0);
        return lists;
    }

    
}