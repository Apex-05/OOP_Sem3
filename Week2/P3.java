//Print all the prime numbers in a given 1D array.
import java.io.*;
import java.util.*;

class P3 {

    static boolean isPrime(int num) {
        if (num < 2) return false;
        boolean Prime = true;
        for (int i = 2; i <= (num / 2); i++) {
            if (num % i == 0) {
                Prime = false;
                break;
            }
        }
        return Prime;
    }

    public static void main(String args[]) {
        int Nums[] = {2, 3, 5, 8, 10, 13, 16};
        for (int i = 0; i < Nums.length; i++) {
            if (isPrime(Nums[i])) System.out.print(Nums[i] + " ");
        }
    }
}
