public class DFS {
    void visit(Node node) {
        node.visited = true;
    }

    public void search(Node root) {
        if (root == null) return;
        visit(root);
        for (Node n : root.adjacent) {
            if (!n.visited) {
                search(n);
            }
        }
    }
}