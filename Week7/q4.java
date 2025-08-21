import java.util.*;

interface Sports {
    String getGrade();
    void putGrade(String Grade);
}

class Student {
    private int RollNumber, Marks;
    int getMarks() { return Marks; }
    void putMarks(int Marks) { this.Marks = Marks; }
    int getRollNo() { return RollNumber; }
    void putRollNo(int RollNumber) { this.RollNumber = RollNumber; }
}

class Result extends Student implements Sports {
    private String SportsGrade;

    public String getGrade() {
        return SportsGrade;
    }

    public void putGrade(String SportsGrade) {
        this.SportsGrade = SportsGrade;
    }

    void displayResult() {
        System.out.println("Student Roll: " + super.getRollNo());
        System.out.println("Student Marks: " + super.getMarks());
        System.out.println("Student Sports Grade: " + SportsGrade);
    }
}

class q4 {
    public static void main(String args[]) {
        Result s1 = new Result();
        s1.putRollNo(8198);
        s1.putMarks(100);
        s1.putGrade("A1");
        s1.displayResult();
    }
}
