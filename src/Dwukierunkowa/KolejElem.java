package Dwukierunkowa;

public class KolejElem {
    private int value;
    KolejElem next;
    KolejElem prev;


    public KolejElem(int value) {
        this.value = value;
    }

    public KolejElem(int value, KolejElem next, KolejElem prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public KolejElem getNext() {
        return next;
    }

    public void setNext(KolejElem next) {
        this.next = next;
    }

    public KolejElem getPrev() {
        return prev;
    }

    public void setPrev(KolejElem prev) {
        this.prev = prev;
    }
}
