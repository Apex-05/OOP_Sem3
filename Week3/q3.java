/*
Define a class Mixer to merge two sorted integer arrays in ascending order with the following instance variables and methods:
instance variables:
int arr[] //to store the elements of an array
Methods:
void accept() // to accept the elements of the array in ascending order without any duplicates
Mixer mix(Mixer A) // to merge the current object array elements with the parameterized array elements and return the resultant object
void display() // to display the elements of the array
*/
import java.io.*;
import java.util.*;

class Mixer {
    int arr[], N;

    void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No of Elements in Array: ");
        this.N = input.nextInt();
        this.arr = new int[N];
        int last = Integer.MIN_VALUE;
        for (int i = 0; i < N; ) {
            System.out.print("Enter element " + (i + 1) + ": ");
            int val = input.nextInt();
            if (i == 0 || (val > last)) {
                this.arr[i] = val;
                last = val;
                i++;
            } else {
                System.out.println("Please enter elements in ascending order and without duplicates.");
            }
        }
    }

    Mixer mix(Mixer A) {
        int i = 0, j = 0, k = 0;
        int total = this.N + A.N;
        int temp[] = new int[total];
        while (i < this.N && j < A.N) {
            if (this.arr[i] < A.arr[j]) {
                temp[k++] = this.arr[i++];
            } else if (this.arr[i] > A.arr[j]) {
                temp[k++] = A.arr[j++];
            } else {
                temp[k++] = this.arr[i++];
                j++;
            }
        }
        while (i < this.N) temp[k++] = this.arr[i++];
        while (j < A.N) temp[k++] = A.arr[j++];
        Mixer res = new Mixer();
        res.N = k;
        res.arr = new int[k];
        for (int m = 0; m < k; m++) res.arr[m] = temp[m];
        return res;
    }

    void display() {
        System.out.print("Array: ");
        for (int i = 0; i < this.N; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class q3 {
    public static void main(String args[]) {
        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();
        System.out.println("Enter first array:");
        m1.accept();
        System.out.println("Enter second array:");
        m2.accept();
        Mixer merged = m1.mix(m2);
        System.out.print("Merged array: ");
        merged.display();
    }
}
