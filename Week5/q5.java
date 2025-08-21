import java.io.*;
import java.util.*;

class student {
    static int Scount = 0;
    int Sregno;
    String Sname;
    GregorianCalendar Sdoj;
    short Ssem;
    float Sgpa;
    float Scgpa;

    student(String Sname, GregorianCalendar Sdoj, short Ssem, float Sgpa, float Scgpa) {
        this.Sname = Sname;
        this.Sdoj = Sdoj;
        this.Ssem = Ssem;
        this.Sgpa = Sgpa;
        this.Scgpa = Scgpa;
        Scount += 1;
        this.Sregno = (this.Sdoj.get(Calendar.YEAR) % 100) * 100 + Scount;
    }

    void display() {
        System.out.println("----------Student Details----------");
        System.out.println("Student Reg No:" + Sregno);
        System.out.println("Student Name:" + Sname);
        System.out.println("Student DOJ:" + Sdoj.getTime());
        System.out.println("Student Sem:" + Ssem);
        System.out.println("Student GPA:" + Sgpa);
        System.out.println("Student CGPA:" + Scgpa);
    }

    static void listByFirstChar(student[] students, int N, char c) {
        for (int i = 0; i < N; i++)
            if (students[i].Sname.charAt(0) == c)
                students[i].display();
    }

    static void listBySubstring(student[] students, int N, String sub) {
        for (int i = 0; i < N; i++)
            if (students[i].Sname.contains(sub))
                students[i].display();
    }

    void initialsAndFamilyName() {
        String[] parts = Sname.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length - 1; i++) {
            sb.append(Character.toUpperCase(parts[i].charAt(0))).append(". ");
        }
        sb.append(parts[parts.length - 1]);
        Sname = sb.toString();
    }

    static void displayAll(student[] students, int N) {
        for (int i = 0; i < N; i++) students[i].display();
    }
}

class q5 {
    public static void main(String args[]) {
        int N = 3;
        student[] students = new student[N];
        students[0] = new student("Prakash Kalingrao Aithal", new GregorianCalendar(2021, 2, 3), (short)2, 7.5f, 7.3f);
        students[1] = new student("John Doe", new GregorianCalendar(2022, 5, 7), (short)1, 9.1f, 8.6f);
        students[2] = new student("Alice Smith", new GregorianCalendar(2022, 3, 7), (short)2, 7.7f, 7.1f);

        student.listByFirstChar(students, N, 'J');
        student.listBySubstring(students, N, "Smith");
        for (int i = 0; i < N; i++) students[i].initialsAndFamilyName();
        student.displayAll(students, N);
    }
}
