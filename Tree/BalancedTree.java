class Node {
    int data;
    Node left;
    Node right;
}

public class BalancedTree {

    public boolean isBalanced(Node n) {
        if (n == null) return true;

        if (Math.abs(getHeight(n.left) - getHeight(n.right)) > 1) {
            return false;
        }
        return isBalanced(n.left) && isBalanced(n.right);
        
    }

    public int getHeight(Node n) {
        if (n == null || (n.left == null && n.right == null)) return 0;
        return 1 + Math.max(getHeight(n.left), getHeight(n.right));
    }

}