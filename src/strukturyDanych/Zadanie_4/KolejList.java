package strukturyDanych.Zadanie_4;

public class KolejList {
    private KolejElem first;
    private KolejElem last;

    public KolejList() {
        last = first = null;
    }

    public void add(int value) {
        KolejElem elem = new KolejElem (value, null);
        if (first == null) {
            first = last = elem;
        } else
            last.setNext (elem);
        last = elem;
    }

    public int poll() {
        if(isEmpty ()){
            //TODO exception
        }
        int value = first.getValue ();
        if (first.getNext () == null) {
            first = last = null;
        } else {
            first = first.getNext ();
        }
        return value;
    }
    public boolean isEmpty(){
        return first ==null;
    }
    public int peek(){
        if(isEmpty ()){
            //TODO exception
        }
        return first.getValue ();
    }
    public void print(){
        KolejElem tmpElem = first;
        while (tmpElem !=null){
            System.out.print (tmpElem.getValue ()+ " ");
            tmpElem = tmpElem.getNext ();
        }
        System.out.println ();
    }

}

