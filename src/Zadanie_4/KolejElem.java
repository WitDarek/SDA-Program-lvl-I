package Zadanie_4;

public class KolejElem {
    private int value;
    private KolejElem next;

    public KolejElem(int value, KolejElem next) {
        this.value = value;
        this.next = next;
    }

    public KolejElem(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(KolejElem next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public KolejElem getNext() {
        return next;
    }
}


