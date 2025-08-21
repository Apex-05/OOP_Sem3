import java.util.*;

class PushException extends Exception {
    public String toString() {
        return "Stack is Full!";
    }
}

class PopException extends Exception {
    public String toString() {
        return "Stack is Empty!";
    }
}

class Stack {
    int Arr[];
    int tos, Capacity;

    Stack(int Capacity) {
        this.Capacity = Capacity;
        Arr = new int[Capacity];
        tos = -1;
    }

    int pop() throws PopException {
        if (tos == -1) {
            throw new PopException();
        }
        return Arr[tos--];
    }

    void push(int item) throws PushException {
        if (tos == Capacity - 1) {
            throw new PushException();
        }
        Arr[++tos] = item;
    }
}

class q1 {
    public static void main(String args[]) {
        Stack stack = new Stack(2);
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30); // This should throw PushException
        } catch (PushException e) {
            System.out.println(e.toString());
        }

        try {
            int _temp1 = stack.pop();
            int _temp2 = stack.pop();
            int _temp3 = stack.pop(); // This should throw PopException
        } catch (PopException e) {
            System.out.println(e.toString());
        }
    }
}
