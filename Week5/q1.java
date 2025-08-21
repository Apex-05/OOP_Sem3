/*
1. Add the following string processing methods to the class Employee:
a) formatEmployeeName(): Format each word (capitalize 1st letter, rest lowercase)
b) generateEmail(): Generate email as firstInitial+lastname@example.com
*/
import java.io.*;
import java.util.*;

class Employee {
    String Ename;
    String Eemail;

    Employee(String Ename) {
        this.Ename = Ename;
        this.Eemail = "";
    }

    void formatEmployeeName() {
        if (Ename.length() > 0) {
            String[] parts = Ename.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String part : parts) {
                if (!part.isEmpty()) {
                    sb.append(Character.toUpperCase(part.charAt(0)));
                    if (part.length() > 1) {
                        sb.append(part.substring(1).toLowerCase());
                    }
                    sb.append(" ");
                }
            }
            Ename = sb.toString().trim();
            System.out.println(Ename);
        }
    }

    void generateEmail() {
        String name = Ename.trim().toLowerCase();
        String[] parts = name.split(" ");
        if (parts.length >= 2) {
            Eemail = parts[0].charAt(0) + parts[parts.length - 1] + "@example.com";
        } else {
            Eemail = name.replaceAll("\\s+", "") + "@example.com";
        }
        System.out.println(Eemail);
    }
}

class q1 {
    public static void main(String args[]) {
        Employee e1 = new Employee("KarthIkeya davSam");
        e1.formatEmployeeName();
        e1.generateEmail();

        Employee e2 = new Employee("JOHN DOE");
        e2.formatEmployeeName();
        e2.generateEmail();
    }
}
