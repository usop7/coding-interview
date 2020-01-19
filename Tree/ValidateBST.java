class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
    }
}

public class ValidateBST {

    // left <= current < right

    /* 
        //Wrong Answer
    
    public static boolean isValidBST(Node n) {
        if (n == null) return true;

        if (n.left != null && n.left.data > n.data) {
            return false;
        }
        if (n.right != null && n.right.data < n.data) {
            return false;
        }

        return isValidBST(n.left) && isValidBST(n.right);
    }
    */

    static int min = 100;
    public static boolean isValidBST(Node n) {
        if (n == null) return true;
        if (!isValidBST(n.left)) return false;
        if (min != 100 && n.data < min) {
            return false;
        } 
        min = n.data;
        return isValidBST(n.right);
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        b.left = a;
        b.right = c;
        c.right = d;
        d.right = e;

        System.out.println(isValidBST(b));
    }
    
}