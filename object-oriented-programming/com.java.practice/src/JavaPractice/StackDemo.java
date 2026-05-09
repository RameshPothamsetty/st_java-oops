package JavaPractice;


    class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        // Constructor
        public Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Push element onto stack
        public void push(int x) {
            if (isFull()) {
                System.out.println("Stack Overflow! Cannot push " + x);
                return;
            }
            arr[++top] = x;
        }

        // Pop element from stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            return arr[top--];
        }

        // Peek top element without removing
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return arr[top];
        }

        // Check if stack is empty
        public boolean isEmpty() {
            return top == -1;
        }

        // Check if stack is full
        public boolean isFull() {
            return top == capacity - 1;
        }

        // Utility method to print current stack (for demonstration)
        public void printStack() {
            System.out.print("Stack: [");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]);
                if (i < top) System.out.print(", ");
            }
            System.out.print("]");
        }
    }

    public class StackDemo {
        public static void main(String[] args) {
            Stack stack = new Stack(5); // capacity 5

            // Push 5 elements
            int[] elements = {10, 20, 30, 40, 50};
            System.out.print("Pushed: ");
            for (int e : elements) {
                stack.push(e);
                System.out.print(e + " ");
            }

            // Peek
            System.out.print("| Peek: " + stack.peek());

            // Pop 3 elements
            System.out.print(" | Popped: ");
            for (int i = 0; i < 3; i++) {
                System.out.print(stack.pop() + " ");
            }

            // Print current stack state
            System.out.print("| ");
            stack.printStack();
        }
    }

