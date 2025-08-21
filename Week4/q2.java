/*
Consider the already defined EMPLOYEE class. Provide a default constructor, and parameterized constructor. Also provide a display method. Illustrate all the constructors as well as the display method by defining EMPLOYEE objects.
*/
import java.io.*;
import java.util.*;

class EMPLOYEE {
    String Ename;
    int Eid, Basic;
    double DA, Gross_Sal, Net_Sal;

    // Default constructor
    EMPLOYEE() {
        this.Ename = "Not Assigned";
        this.Eid = 0;
        this.Basic = 0;
        this.compute_net_sal();
    }

    // Parameterized constructor
    EMPLOYEE(String Ename, int Eid, int Basic) {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Basic = Basic;
        this.compute_net_sal();
    }

    void compute_net_sal() {
        this.DA = 0.52 * this.Basic;
        this.Gross_Sal = this.Basic + this.DA;
        this.Net_Sal = this.Gross_Sal * 0.7;
    }

    void display() {
        System.out.println("----------Employee Details----------");
        System.out.println("Employee Name: " + this.Ename);
        System.out.println("Employee Id: " + this.Eid);
        System.out.println("Employee Basic Salary: " + this.Basic);
        System.out.println("Employee DA: " + this.DA);
        System.out.println("Employee Gross_Sal: " + this.Gross_Sal);
        System.out.println("Employee Net_Sal: " + this.Net_Sal);
    }
}

class q2 {
    public static void main(String args[]) {
        EMPLOYEE emp1 = new EMPLOYEE("John", 1001, 5000);
        emp1.display();
        EMPLOYEE emp2 = new EMPLOYEE();
        emp2.display();
    }
}
