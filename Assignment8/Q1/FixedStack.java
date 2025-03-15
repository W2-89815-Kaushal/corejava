package demo05;
public class FixedStack implements Stack {
    private Employee[] stack;
    private int top;

    public FixedStack() {
        stack = new Employee[SIZE];
        top = -1;
    }

    @Override
    public void push(Employee emp) {
        if (top < SIZE - 1) {
            stack[++top] = emp;
            System.out.println("Pushed: " + emp);
        } else {
            System.out.println("Stack is full.");
        }
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
