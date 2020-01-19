import java.util.Stack;

public class SortStack {

    public static void sort(Stack<Integer> stack) {
        Stack<Integer> sorted = new Stack<>();
        while (!stack.empty()) {
            int value = stack.pop();
            while (!sorted.empty() && sorted.peek() > value) {
                stack.push(sorted.pop());
            }
            sorted.push(value);
        }
        
        while(!sorted.empty()) {
            stack.push(sorted.pop());
        }
    } 

    public static void print(Stack<Integer> stack) {
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(3);
        
        sort(stack);
        print(stack);
    }

}