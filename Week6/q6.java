import java.io.*;

class Student {
    String Name;
    int Id;
    void setStudent(String Name, int Id) {
        this.Name = Name;
        this.Id = Id;
    }
}

class Sports extends Student {
    int s_grade;
    void setSgrade(int grade) { this.s_grade = grade; }
}

class Exam extends Student {
    int e_grade;
    void setEgrade(int grade) { this.e_grade = grade; }
}

class Results extends Sports {
    int e_grade;
    String finalResult;

    void setEgrade(int grade) { this.e_grade = grade; }
    void setResult(String r) { this.finalResult = r; }

    void display() {
        System.out.println("Name: " + Name);
        System.out.println("ID: " + Id);
        System.out.println("Sports Grade: " + s_grade);
        System.out.println("Exam Grade: " + e_grade);
        System.out.println("Result: " + finalResult);
    }
}

class q6 {
    public static void main(String args[]) {
        Results res = new Results();
        res.setStudent("John", 12345);
        res.setSgrade(85);
        res.setEgrade(90);
        res.setResult("PASS");
        res.display();
    }
}
