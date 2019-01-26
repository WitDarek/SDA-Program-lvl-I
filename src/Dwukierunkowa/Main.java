package Dwukierunkowa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       // wywolajLista ();
        wywolajLista2 ();
    }

    public static void wywolajLista(){
        KolejList kolejList = new KolejList ();

        System.out.println (kolejList.isEmpty ());

        kolejList.addFirst (5);
        kolejList.addFirst (6);
        kolejList.addFirst (7);

        kolejList.addLast (5);
        kolejList.addLast (7);
        kolejList.addFirst (8);
        kolejList.addFirst (82);
        System.out.println (kolejList.isEmpty ());

        kolejList.show ();
        kolejList.pollFirst ();
        kolejList.pollFirst ();
        kolejList.show ();
        kolejList.pollLast ();
        kolejList.pollLast ();
        kolejList.pollLast ();
        kolejList.show ();
        kolejList.showRev ();

        System.out.println(kolejList.peekFirst ());
        System.out.println (kolejList.peekLast ());
    }

    public static void wywolajLista2(){
        KolejList kolejList = new KolejList ();
        while (true){
            System.out.println ("Wybierz funkcje");
            System.out.println ("1: addFirst " +
                    "2: addLast " +
                    "3: pollFirst " +
                    "4: pollLast " +
                    "5: peekFirst " +
                    "6: peekLast " +
                    "7: isEmpty " +
                    "8: show " +
                    "9: showRev "+
                    "10: czyZnajduje "+
                    "11: usun "+
                    "0: end");
            Scanner scaner = new Scanner (System.in);
            int value = scaner.nextInt ();

            switch (value){
                case 1:
                    System.out.println ("Podaj wartość");
                    kolejList.addFirst (scaner.nextInt ());
                    break;
                case 2:
                    System.out.println ("Podaj wartość");
                    kolejList.addLast (scaner.nextInt ());
                    break;
                case 3:
                    kolejList.pollFirst ();
                    break;
                case 4:
                    kolejList.pollLast ();
                    break;
                case 5:
                    System.out.println (kolejList.peekFirst ());
                    break;
                case 6:
                    System.out.println (kolejList.peekLast ());
                    break;
                case 7:
                    System.out.println ("Kolejka jest pusta true, pełna false: "+kolejList.isEmpty ());
                    break;
                case 8:
                    kolejList.show ();
                    break;
                case 9:
                    kolejList.showRev ();
                    break;
                case 10:
                    System.out.println ("Podaj wartość");
                    System.out.println (kolejList.czyZnajduje (scaner.nextInt ()));
                    break;
                case 11:
                    System.out.println ("Podaj wartość");
                    kolejList.usun (scaner.nextInt ());
                    break;
                case 0:
                    return;
            }
        }
    }
}
