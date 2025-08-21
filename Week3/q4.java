import java.io.*;
import java.util.*;

class Stack {
    int stack[], tos, size;

    Stack(int size) {
        this.size = size;
        this.tos = -1;
        this.stack = new int[size];
    }

    boolean is_full() {
        return this.tos == this.size - 1;
    }

    boolean is_empty() {
        return this.tos == -1;
    }

    void push(int value) {
        if (this.is_full()) {
            System.out.println("Stack overflow! Cannot push new element");
            return;
        }
        this.tos += 1;
        this.stack[this.tos] = value;
    }

    int pop() {
        if (this.is_empty()) {
            System.out.println("Stack underflow! Cannot pop element");
            return -1;
        }
        int value = this.stack[this.tos];
        tos--;
        return value;
    }

    void display() {
        System.out.print("Stack contents: ");
        for (int i = this.tos; i >= 0; i--) {
            if (i == 0) System.out.print(stack[i]);
            else System.out.print(stack[i] + ",");
        }
        System.out.println();
    }
}

class q4 {
    public static void main(String args[]) {
        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();
        int value = stack.pop();
        System.out.println("Popped: " + value);
        stack.display();
    }
}
