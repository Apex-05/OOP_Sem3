//Write a program that creates an integer array of length N, fills the array with sequence of values (from 1 to N) using a for loop, then loops through the array printing out the values using for-each loop.
import java.io.*;
import java.util.*;

class P2 {

    public static void main(String args[]) {
        System.out.print("Enter N: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int Array[] = new int[N];
        for (int i = 1; i <= N; i++) {
            Array[i - 1] = i;
        }
        for (int num : Array) {
            System.out.print(num + " ");
        }
    }
}
