import java.util.Queue;

public class BFS {

    void visit(Node n) {
        n.visited = true;
    }

    public void search(Node root) {
        Queue<Node> queue = new Queue<>();
        visit(root);
        queue.add(root);
        
        while (!queue.isEmpty()) {
            for (Node n : queue.poll().adjacent) {
                if (!n.visited) {
                    visit(n);
                    queue.add(n);
                }
            }
        }
        

    }
}