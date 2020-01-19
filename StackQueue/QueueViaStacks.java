public class QueueViaStacks {
    Stack<Integer> stack, modifiedStack;

    public QueueViaStacks() {
        stack = new Stack<>();
        modifiedStack = new Stack<>();
    }

    public int size() {
        return stack.size() + modifiedStack.size();
    }

    public void add(int value) {
        stack.push(value);
    }

    public void shiftStacks() {
        while (!stack.isEmpty()) {
            modifiedStack.push(stack.pop());
        }
    }

    public int peek() {
        shiftStacks();
        return modifiedStack.peek();
    }

    public int remove() {
        shiftStacks();
        return modifiedStack.pop();
    }

}