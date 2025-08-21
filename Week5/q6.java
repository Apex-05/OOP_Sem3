import java.io.*;
import java.util.*;

class q6 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String num = input.nextLine();
        StringBuilder sb = new StringBuilder(num).reverse();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (i > 0 && i % 3 == 0) ans.append(',');
            ans.append(sb.charAt(i));
        }
        System.out.println(ans.reverse().toString());
    }
}
