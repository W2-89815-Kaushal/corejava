package demo05;

public class GrowableStack implements Stack {
    private Employee[] stack;
    private int top;

    public GrowableStack() {
        stack = new Employee[SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top == stack.length - 1) {
            Employee[] newStack = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, newStack, 0, stack.length);
            stack = newStack;
            System.out.println("Stack resized.");
        }
        stack[++top] = emp;
        System.out.println("Pushed: " + emp);
    }

    @Override
    public Employee pop() {
        if (top >= 0) {
            Employee emp = stack[top--];
            System.out.println("Popped: " + emp);
            return emp;
        } else {
            System.out.println("Stack is empty.");
            return null;
        }
    }
}
