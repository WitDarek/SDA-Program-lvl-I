package Dwukierunkowa;

public class KolejList {

    private KolejElem first = null;
    private KolejElem last = null;


    public void addFirst(int value) {
        KolejElem elem = new KolejElem (value, null, null);
        if (first == null) {
            first = last = elem;
        } else {
            if (first == last) {  // trzeba sprawdzić czy jest tylko jeden element, jak tak to przy tworzeniu firsta musi rowniez byc zmiana w lascie.

                elem.setNext (first);
                first.setPrev (elem);
                first = elem;
                last.setPrev (first);
            } else {
                elem.setNext (first);
                first.setPrev (elem);
                first = elem;

            }
        }
    }

    public void addLast(int value) {
        KolejElem elem = new KolejElem (value, null, null);
        if (first == null) {
            first = last = elem;
        } else {
            if (first == last) {
                elem.setPrev (last);
                last.setNext (elem);
                last = elem;
                first.setNext (last);
            } else {
                elem.setPrev (last);
                last.setNext (elem);
                last = elem;
            }
        }
    }

    public void pollFirst() {
        if (first == last) {
            System.out.println ("Usunięto wartość: " + first.getValue ());
            first = last = null;
        } else {
            System.out.println ("Usunięto wartość: " + first.getValue ());
            first = first.getNext ();
            first.setPrev (null);
        }
    }

    public void pollLast() {
        if (first == last) {
            System.out.println ("Usunięto wartość: " + first.getValue ());
            first = last = null;
        } else {
            System.out.println ("Usunięto wartość: " + last.getValue ());
            last = last.getPrev ();
            last.setNext (null);
        }
    }

    public void show() {
        KolejElem tmpElem = first;
        while (tmpElem != null) {
            System.out.print (tmpElem.getValue () + " ");
            tmpElem = tmpElem.getNext ();
        }
        System.out.println ();
    }

    public void showRev() {
        KolejElem tmpElem = last;
        while (tmpElem != null) {
            System.out.print (tmpElem.getValue () + " ");
            tmpElem = tmpElem.getPrev ();
        }
        System.out.println ();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int peekFirst() {
        int val = 0;
        if (first == null) {
            System.out.println ("Kolekcja jest pusta");
        } else val = first.getValue ();
        return val;
    }

    public int peekLast() {
        int val = 0;
        if (first == null) {
            System.out.println ("Kolekcja jest pusta");
        } else val = last.getValue ();
        return val;
    }

    public boolean czyZnajduje(int value) {
        KolejElem tmp = first;
        while (tmp != null) {
            if (value == tmp.getValue ()) {
                return true;
            }
            tmp = tmp.getNext ();
        }
        return false;
    }
    public void usun(int value){
        KolejElem tmp = first;
        while (tmp !=null){
            if (value == first.getValue ()){
                pollFirst ();
            }else if(value==last.getValue ()){
                pollLast ();
            }else if(value == tmp.getValue ()){
                tmp.getPrev ().setNext (tmp.getNext ());
                tmp.getNext ().setPrev (tmp.getPrev ());
            }
           tmp= tmp.getNext ();
        }

    }
}