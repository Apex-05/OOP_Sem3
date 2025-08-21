import java.io.*;

class STUDENT {
    String sname;
    int marks_array[];
    int total;
    float avg;

    void assign(String sname, int marks_array[]) {
        this.sname = sname;
        this.marks_array = marks_array.clone();
    }

    void display() {
        System.out.println("---------Student Information------------");
        System.out.println("Student Name : " + this.sname);
        System.out.println("Student Marks:");
        for (int i = 0; i < 3; i++)
            System.out.println(" Subject " + (i+1) + ":" + this.marks_array[i]);
        System.out.println("Student Total Marks : " + this.total);
        System.out.println("Student Avg : " + this.avg);
    }

    void compute() {
        this.total = 0;
        for (int i = 0; i < 3; i++)
            this.total += this.marks_array[i];
        this.avg = (float) this.total / 3;
    }
}

class ScienceStudent extends STUDENT {
    private int practicalMarks;

    ScienceStudent(String sname, int marks_array[], int practicalMarks) {
        super.assign(sname, marks_array);
        this.practicalMarks = practicalMarks;
    }

    void compute() {
        super.total = 0;
        for (int i = 0; i < 3; i++)
            super.total += super.marks_array[i];
        super.total += this.practicalMarks;
        super.avg = (float) super.total / 4;
    }

    void displayPracticalMarks() {
        System.out.println("Practical Marks of Student(Science) is " + this.practicalMarks);
    }
}

class ArtsStudent extends STUDENT {
    private String electiveSubject;

    ArtsStudent(String sname, int marks_array[], String electiveSubject) {
        super.assign(sname, marks_array);
        this.electiveSubject = electiveSubject;
    }

    void displayelectiveSubject() {
        System.out.println("Elective Subject Choosen by Student is " + this.electiveSubject);
    }
}

class q1 {
    public static void main(String[] args) {
        int Arr[] = {80,80,80};
        ScienceStudent ss1 = new ScienceStudent("Karthikeya", Arr, 80);
        ss1.compute();
        ss1.display();
        ss1.displayPracticalMarks();

        int Arr1[] = {60,80,90};
        ArtsStudent as1 = new ArtsStudent("Aditya", Arr1, "Data Science");
        as1.compute();
        as1.display();
        as1.displayelectiveSubject();

        // Demonstrating dynamic polymorphism
        STUDENT s;
        s = ss1; s.compute(); s.display();
        s = as1; s.compute(); s.display();
    }
}
