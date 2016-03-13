public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        // do initialize if necessary
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int number) {
        // write your code here
        if(minStack.empty()||minStack.peek()>number)
            minStack.push(number);
        else
            minStack.push(minStack.peek());
        stack.push(number);
    }

    public int pop() {
        // write your code here
        minStack.pop();
        return stack.pop();
    }

    public int min() {
        // write your code here
        return minStack.peek();
    }
}
