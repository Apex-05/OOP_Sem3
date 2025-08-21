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
}

class q3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter No of Students: ");
        int N = input.nextInt();
        student[] students = new student[N];
        input.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.print("Enter Name: ");
            String name = input.nextLine();
            System.out.print("Enter Year: ");
            int year = input.nextInt();
            System.out.print("Enter Month: ");
            int month = input.nextInt();
            System.out.print("Enter Day: ");
            int day = input.nextInt();
            System.out.print("Enter Semester: ");
            short sem = input.nextShort();
            System.out.print("Enter GPA: ");
            float gpa = input.nextFloat();
            System.out.print("Enter CGPA: ");
            float cgpa = input.nextFloat();
            input.nextLine();
            GregorianCalendar doj = new GregorianCalendar(year, month - 1, day);
            students[i] = new student(name, doj, sem, gpa, cgpa);
        }
        for (int i = 0; i < N; i++) {
            students[i].display();
        }
    }
}
