package Lab2.Task1;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        for (int item : stack) {
            System.out.println(item);
        }

        System.out.println("Top of the stack: " + stack.peek());
        System.out.println("Popped item: " + stack.pop());

        for (int item : stack) {
            System.out.println(item);
        }
    }
}
