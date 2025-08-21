import java.io.*;
import java.util.*;

class EMPLOYEE {
    String Ename;
    int Eid, Basic;
    double DA, Gross_Sal, Net_Sal;

    EMPLOYEE(String Ename, int Eid, int Basic) {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Basic = Basic;
    }
    EMPLOYEE(String Ename, int Eid) {
        this.Ename = Ename;
        this.Eid = Eid;
    }

    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        Net_Sal = Gross_Sal * 0.7;
    }
    void display() {
        System.out.println("----------Employee Details----------");
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee Id: " + Eid);
        System.out.println("Employee Basic Salary: " + Basic);
        System.out.println("Employee DA: " + DA);
        System.out.println("Employee Gross_Sal: " + Gross_Sal);
        System.out.println("Employee Net_Sal: " + Net_Sal);
    }
}

class FullTimeEmp extends EMPLOYEE {
    double FEBonus, FEDeduction;
    FullTimeEmp(String Ename, int Eid, int Basic, double FEBonus, double FEDeduction) {
        super(Ename, Eid, Basic);
        this.FEBonus = FEBonus;
        this.FEDeduction = FEDeduction;
    }
    void calculateSalary() {
        super.Gross_Sal = super.Basic + this.FEBonus - this.FEDeduction;
        super.Net_Sal = super.Gross_Sal * 0.7;
    }
    void display() {
        System.out.println("----------Employee Details----------");
        System.out.println("Employee Name: " + super.Ename);
        System.out.println("Employee Id: " + super.Eid);
        System.out.println("Employee Basic Salary: " + super.Basic);
        System.out.println("Employee Bonus: " + this.FEBonus);
        System.out.println("Employee Deductions: " + this.FEDeduction);
        System.out.println("Employee Gross_Sal: " + super.Gross_Sal);
        System.out.println("Employee Net_Sal: " + super.Net_Sal);
    }
}

class PartTimeEmp extends EMPLOYEE {
    int hoursWorked;
    final static double hourlyRate = 20.0;
    PartTimeEmp(String Ename, int Eid, int hoursWorked) {
        super(Ename, Eid);
        this.hoursWorked = hoursWorked;
    }
    void calculateSalary() {
        super.Basic = (int)Math.round(this.hoursWorked * this.hourlyRate);
        super.Gross_Sal = super.Basic;
        super.Net_Sal = super.Gross_Sal * 0.7;
    }
    void display() {
        System.out.println("----------Employee Details----------");
        System.out.println("Employee Name: " + super.Ename);
        System.out.println("Employee Id: " + super.Eid);
        System.out.println("Employee Hours Worked: " + this.hoursWorked);
        System.out.println("Employee Hourly Rate: " + PartTimeEmp.hourlyRate);
        System.out.println("Employee Gross_Sal: " + super.Gross_Sal);
        System.out.println("Employee Net_Sal: " + super.Net_Sal);
    }
}

class q2 {
    public static void main(String[] args) {
        FullTimeEmp fte1 = new FullTimeEmp("Karthikeya", 1, 10000, 2000, 500);
        fte1.calculateSalary();
        fte1.display();

        PartTimeEmp pte1 = new PartTimeEmp("Aditya", 2, 20);
        pte1.calculateSalary();
        pte1.display();
    }
}
