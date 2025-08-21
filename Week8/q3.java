import java.util.*;

class SeatsFilledException extends Exception {
    public String toString() {
        return "Seats are Filled!";
    }
}

class student {
    static int Scount = 0;
    int Sregno;
    String Sname;
    GregorianCalendar Sdoj;
    short Ssem;
    float Sgpa;
    float Scgpa;

    student(String Sname, GregorianCalendar Sdoj, short Ssem, float Sgpa, float Scgpa) throws SeatsFilledException {
        this.Sname = Sname;
        this.Sdoj = Sdoj;
        this.Ssem = Ssem;
        this.Sgpa = Sgpa;
        this.Scgpa = Scgpa;
        if (Scount >= 2) throw new SeatsFilledException();
        Scount += 1;
        this.Sregno = (this.Sdoj.get(Calendar.YEAR) % 100) * 100 + Scount;
    }

    void display() {
        System.out.println("----------Student Details----------");
        System.out.println("Student Reg No: " + Sregno);
        System.out.println("Student Name: " + Sname);
        System.out.println("Student DOJ: " + Sdoj.getTime());
        System.out.println("Student Sem: " + Ssem);
        System.out.println("Student GPA: " + Sgpa);
        System.out.println("Student CGPA: " + Scgpa);
    }
}

class q3 {
    public static void main(String args[]) {
        try {
            student s1 = new student("Karthikeya", new GregorianCalendar(2005, 9, 20), (short)3, 2.3f, 4.6f);
            student s2 = new student("Aditya", new GregorianCalendar(2005, 9, 20), (short)3, 2.3f, 4.6f);
            student s3 = new student("Sneha", new GregorianCalendar(2005, 9, 20), (short)3, 2.3f, 4.6f); // Should throw exception
            s1.display();
            s2.display();
            s3.display();
        } catch (SeatsFilledException e) {
            System.out.println(e.toString());
        }
    }
}
