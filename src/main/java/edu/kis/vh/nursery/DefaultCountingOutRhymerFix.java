package edu.kis.vh.nursery;

public class DefaultCountingOutRhymerFix {

    public static final int MIN = -1;
    private int[] numbers = new int[12];

    public int total = MIN;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MIN;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return MIN;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return MIN;
        return numbers[total--];
    }

}
