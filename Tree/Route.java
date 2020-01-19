import java.util.*;

class Node {
    String data;
    boolean visited = false;
    ArrayList<Node> adjacents;

    public Node(String s) {
        this.data = s;
        adjacents = new ArrayList<Node>();
    }

    public void add(Node n) {
        this.adjacents.add(n);
    }
}

public class Route {

    void visit(Node n) {
        n.visited = true;
    }


    public boolean bfs(Node a, Node b) {
        if (a == b) return true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(a);
        
        while (!queue.isEmpty()) {
            for (Node n : queue.poll().adjacents) {
                if (!n.visited) {
                    if (n == b) return true;
                    visit(n);
                    queue.add(n);
                }
            }
        }
        return false;
    }

    public boolean dfs(Node a, Node b) {
        if (a == b) return true;
        visit(a);
        for (Node n : a.adjacents) {
            if (!n.visited) {
                System.out.println(a.data + " " + n.data + " " + b.data);
                if (n == b) return true;
                dfs(n, b);
            }
        }
        return false;
    } 

    public boolean dfs2(Node a, Node b) {
        if (a == b) return true;
        Stack<Node> stack = new Stack<>();
        stack.add(a);
        
        while (!stack.isEmpty()) {
            Node n = stack.pop();
            if (!n.adjacents.isEmpty()) {
                Node tmp = n.adjacents.get(0);
                if (!tmp.visited) {
                    if (tmp == b) return true;
                    stack.add(tmp);
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        Route r = new Route();

        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        a.add(b);
        b.add(c);
        c.add(d);

        //System.out.println(r.bfs(a, d));
        System.out.println(r.dfs2(a, d));

        
    }
    
}