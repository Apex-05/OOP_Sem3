package myPackages.p1;

/*
Define a class Maximum with overloaded static methods for maximum of different inputs.
*/

public class Maximum {
    public static int max(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }

    public static float max(float a, float b, float c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }

    public static int max(int Arr[]) {
        int max = Arr[0];
        for (int i = 1; i < Arr.length; i++) {
            if (Arr[i] > max) max = Arr[i];
        }
        return max;
    }

    public static int max(int Arr[][]) {
        int max = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                if (Arr[i][j] > max) max = Arr[i][j];
            }
        }
        return max;
    }
}
