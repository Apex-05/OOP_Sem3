//Create a method max() that has three integer parameters x, y, and z, and it returns the largest of the three. Do it two ways: once using an if-else-if ladder and once using nested if statements
import java.io.*;
import java.util.*;

class P1 {

    static int max(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > x && y > z) {
            return y;
        } else {
            return z;
        }
    }

    static int max1(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else {
            if (y > x && y > z) {
                return y;
            } else {
                return z;
            }
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = input.nextInt();
        System.out.print("Enter y: ");
        int y = input.nextInt();
        System.out.print("Enter z: ");
        int z = input.nextInt();
        System.out.println("Max using if-else-if: " + max(x, y, z));
        System.out.println("Max using nested if: " + max1(x, y, z));
    }
}
