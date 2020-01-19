class Node {
    int data;
    Node left;
    Node right;
}

public class BinaryTree {

    // In-Order: LVR
    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.println(node.data); // visit
            inOrderTraversal(node.right);
        }
    }

    // Pre-Order: VLR


    // Post-Order: LRV

}