package Zadanie_4;

public class Main {
    public static void main(String[] args) {
        wywolajKolejkaLista ();
    }

    public static void wywolajKolejkaLista() {
        KolejList kolejList = new KolejList ();

        kolejList.add (1);
        kolejList.add (2);
        kolejList.add (3);

        kolejList.print ();

        System.out.println (kolejList.poll ());
        System.out.println (kolejList.peek ());
        System.out.println (kolejList.poll ());

        kolejList.add (5);
        kolejList.add (7);
        kolejList.poll ();
        kolejList.poll ();
        kolejList.poll ();
        kolejList.print ();
    }
}
