package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MIN = -1;
    public static final int AMOUNT_OF_NUMBERS = 12;
    public static final int NUMBER_COUNTER = 11;
    private final int[] numbers = new int[AMOUNT_OF_NUMBERS];

    public int total = MIN;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == MIN;
    }

    public boolean isFull() {
        return total == NUMBER_COUNTER;
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
