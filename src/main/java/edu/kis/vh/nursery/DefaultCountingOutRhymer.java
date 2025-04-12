package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer implementuje podstawowy mechanizm stosu
 * wykorzystywanego do wyliczanek. Umożliwia dodawanie elementów (metoda countIn),
 * sprawdzanie, czy stos jest pusty (callCheck) lub pełny (isFull),
 * podglądanie elementu na szczycie stosu (peekaboo) oraz pobieranie elementu ze stosu (countOut).
 */
public class DefaultCountingOutRhymer {

    /**
     * Tablica przechowująca elementy stosu.
     */
    private int[] numbers = new int[12];

    /**
     * Indeks określający pozycję ostatniego dodanego elementu w tablicy.
     * Wartość -1 oznacza, że stos jest pusty.
     */
    private int total = -1;

    /**
     * Zwraca aktualną wartość indeksu 'total', czyli liczbę elementów na stosie.
     *
     * @return aktualna liczba elementów w stosie
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nowy element do stosu, o ile stos nie jest pełny.
     * Jeśli stos nie jest pełny, zwiększa indeks 'total' i zapisuje wartość.
     *
     * @param in wartość, która ma zostać dodana do stosu
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return {@code true} jeśli stos jest pusty (total == -1), w przeciwnym razie {@code false}
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return {@code true} jeśli stos jest pełny (total == 11), w przeciwnym razie {@code false}
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Zwraca wartość elementu znajdującego się na szczycie stosu bez jego usuwania.
     * Jeśli stos jest pusty, metoda zwraca -1.
     *
     * @return wartość elementu na szczycie stosu lub -1, jeśli stos jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     * Pobiera (usuwa i zwraca) element ze szczytu stosu.
     * Jeśli stos jest pusty, metoda zwraca -1.
     *
     * @return wartość pobranego elementu lub -1, jeśli stos jest pusty
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
}
