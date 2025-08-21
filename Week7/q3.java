/*
Interface Series with methods GetNext, reset, setStart.
Class ByTwos generates a sequence incremented by 2.
*/

interface Series {
    int GetNext();
    void reset();
    void setStart(int start);
}

class ByTwos implements Series {
    int prev = 0;

    public int GetNext() {
        prev += 2;
        return prev;
    }

    public void reset() {
        prev = 0;
    }

    public void setStart(int start) {
        prev = start;
    }
}

class q3 {
    public static void main(String args[]) {
        Series ser;
        ser = new ByTwos();
        System.out.println(ser.GetNext());
        System.out.println(ser.GetNext());
        ser.reset();
        System.out.println(ser.GetNext());
        ser.setStart(100);
        System.out.println(ser.GetNext());
    }
}
