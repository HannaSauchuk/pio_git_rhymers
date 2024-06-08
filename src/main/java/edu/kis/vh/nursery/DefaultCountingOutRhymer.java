package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer implementuje licznik, który przechowuje
 * elementy w tablicy o stałej wielkości. Ma takie opercje jak dodawanie elementu
 * do tablicy, sprawdzenie czy licznik jest pusty lub pełny oraz podgląd
 * ostatniego elementu i jego usuwanie z tablicy.
 */
public class DefaultCountingOutRhymer {
    /**
     * Wartość, która oznacza, że tablica jest pusta.
     */
    private static final int EMPTY = -1;
    /**
     * Wartość minimalna zwracana przez metodę peekaboo, gdy licznik jest pusty.
     */
    private static final int PEEKABOO_MIN = -1;
    /**
     * Rozmiar tablicy przechowującej elementy licznika.
     */
    private static final int MAX_SIZE = 12;
    /**
     * Tablica przechowująca elementy licznika.
     */
    private final int[] numbers = new int[MAX_SIZE];
    /**
     * Indeks wskazujący na ostatni dodany element w tablicy
     * z przypisaną wartością domyślną EMPTY.
     */
    private int total = EMPTY;

    /**
     * Zwraca obecny indeks ostatniego elementu w liczniku.
     * @return indeks ostatniego elementu
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nowy element do tablicy.
     * Przed dododwaniem sprawdza, czy tablica nie jest pełna
     * @param in wartość dodawanego elementu
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza czy licznik jest pusty.
     * @return true, jak licznik jest pusty, false w przeciwnym przypadku
     */
    public boolean callCheck() {
        return getTotal() == EMPTY;
    }

    /**
     * Sprawdza czy licznik jest pełny.
     * @return true, jak licznik jest pełny, false w przeciwnym przypadku
     */
    public boolean isFull() {
        return getTotal() == MAX_SIZE - 1;
    }

    /**
     * Zwraca ostatni dodany element bez jego usuwania z tablicy.
     * @return ostatni element w tablicy lub -1 (PEEKABOO_MIN) w przypadku pustej tablicy licznika
     */
    protected int peekaboo() {
        if (callCheck())
            return PEEKABOO_MIN;
        return numbers[getTotal()];
    }

    /**
     * Zwraca ostatni element z tablicy oraz usuwa go.
     * @return osatni element w tablicy lub -1 (MIN) jeżeli tablica jest pusta
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
