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

    static void sortStudentsBySemGpa(student[] students, int N) {
        Arrays.sort(students, 0, N, (s1, s2) -> {
            if (s1.Ssem != s2.Ssem) return Short.compare(s1.Ssem, s2.Ssem);
            return Float.compare(s1.Scgpa, s2.Scgpa);
        });
        System.out.println("Sorted student records with respect to semester and CGPA:");
        for (int i = 0; i < N; i++) students[i].display();
    }

    static void sortStudentsByName(student[] students, int N) {
        Arrays.sort(students, 0, N, Comparator.comparing(s -> s.Sname));
        System.out.println("Sorted student records with respect to name:");
        for (int i = 0; i < N; i++) students[i].display();
    }
}

class q4 {
    public static void main(String args[]) {
        int N = 3;
        student[] students = new student[N];
        students[0] = new student("Bob Lee", new GregorianCalendar(2021, 5, 10), (short)2, 8.2f, 8.1f);
        students[1] = new student("Alice Smith", new GregorianCalendar(2021, 6, 10), (short)2, 8.6f, 8.2f);
        students[2] = new student("John Doe", new GregorianCalendar(2022, 2, 1), (short)1, 7.1f, 7.3f);

        student.sortStudentsBySemGpa(students, N);
        student.sortStudentsByName(students, N);
    }
}
