package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int EMPTY = -1;
    private static final int PEEKABOO_MIN = -1;
    private static final int MAX_SIZE = 12;
    private final int[] numbers = new int[MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return getTotal() == EMPTY;
    }

    public boolean isFull() {
        return getTotal() == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return PEEKABOO_MIN;
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
