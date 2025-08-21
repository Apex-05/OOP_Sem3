class Table extends Thread {
    int number;

    Table(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++)
            System.out.println(i + " * " + number + " = " + i * number);
    }
}

class q1 {
    public static void main(String args[]) {
        Table t1 = new Table(5);
        Table t2 = new Table(7);
        t1.start();
        t2.start();
    }
}
