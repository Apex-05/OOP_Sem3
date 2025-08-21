import java.util.*;

class InvalidDayException extends Exception {
    int day;
    InvalidDayException(int day) {
        this.day = day;
    }
    public String toString() {
        return "Day " + day + " is Invalid!";
    }
}

class InvalidMonthException extends Exception {
    int month;
    InvalidMonthException(int month) {
        this.month = month;
    }
    public String toString() {
        return "Month " + month + " is Invalid!";
    }
}

class CurrentDate {
    int day, month, year;

    void createDate() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Day: ");
        day = input.nextInt();
        System.out.print("Enter Month: ");
        month = input.nextInt();
        System.out.print("Enter Year: ");
        year = input.nextInt();
    }

    void displayDate() throws InvalidDayException, InvalidMonthException {
        if (day <= 0 || day > 31) throw new InvalidDayException(day);
        if (month <= 0 || month > 12) throw new InvalidMonthException(month);
        System.out.println(day + "/" + month + "/" + year);
    }
}

class q2 {
    public static void main(String args[]) {
        CurrentDate cd = new CurrentDate();
        cd.createDate();
        try {
            cd.displayDate();
        } catch (InvalidMonthException e) {
            System.out.println(e.toString());
        } catch (InvalidDayException e) {
            System.out.println(e.toString());
        }
    }
}
