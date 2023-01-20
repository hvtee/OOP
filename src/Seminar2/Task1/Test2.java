package Seminar2.Task1;

public class Test2 implements Program {
    int num;

    @Override
    public int getNext() {
        num += 2;
        return num;
    }

    @Override
    public void reset() {
        num = 0;
    }

    @Override
    public void setStart(int val) {
        num = val;
    }
}
