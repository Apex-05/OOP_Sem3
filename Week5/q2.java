/*
a) extractInitials()
b) removeWhitespace()
c) List all student names containing a substring
d) Sort students alphabetically
*/
import java.io.*;
import java.util.*;

class STUDENT {
    String Sname;
    String Initial;

    STUDENT(String Sname) {
        this.Sname = Sname;
        this.Initial = "";
    }

    void extractInitials() {
        String[] words = Sname.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty())
                sb.append(Character.toUpperCase(w.charAt(0)));
        }
        Initial = sb.toString();
        System.out.println(Initial);
    }

    void removeWhitespace() {
        String noSpaces = Sname.replaceAll("\\s+", "");
        System.out.println(noSpaces);
    }

    static void SearchSubString(STUDENT stu[], String substring) {
        for (STUDENT s1 : stu) {
            if (s1.Sname.contains(substring))
                System.out.println(s1.Sname);
        }
    }

    static void sortStudents(STUDENT stu[], int N) {
        Arrays.sort(stu, Comparator.comparing(s -> s.Sname));
        System.out.println("Sorted Student Names:");
        for (int i = 0; i < N; i++) {
            System.out.println(stu[i].Sname);
        }
    }
}

class q2 {
    public static void main(String[] args) {
        STUDENT[] students = {
            new STUDENT("John Doe"),
            new STUDENT("Alice Smith"),
            new STUDENT("Bob Lee")
        };
        students.extractInitials();
        students[1].removeWhitespace();
        STUDENT.SearchSubString(students, "Doe");
        STUDENT.sortStudents(students, 3);
    }
}
