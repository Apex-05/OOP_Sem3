import java.util.*;

class RowSum implements Runnable {
    Thread thr;
    int Matrix[][];
    int rowid, sum;

    RowSum(int Matrix[][], int rowid) {
        this.Matrix = Matrix;
        this.rowid = rowid;
        this.sum = 0;
        thr = new Thread(this);
        thr.start();
    }

    public void run() {
        for (int i = 0; i < Matrix[rowid].length; i++) {
            sum += Matrix[rowid][i];
        }
    }
}

class q2 {
    public static void main(String args[]) {
        int Matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = Matrix.length;
        RowSum[] rthreads = new RowSum[rows];
        int totalSum = 0;

        for (int i = 0; i < rows; i++) {
            rthreads[i] = new RowSum(Matrix, i);
        }

        for (int i = 0; i < rows; i++) {
            try {
                rthreads[i].thr.join();
                totalSum += rthreads[i].sum;
                System.out.println("Row " + i + " sum = " + rthreads[i].sum);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Total sum of matrix is " + totalSum);
    }
}
