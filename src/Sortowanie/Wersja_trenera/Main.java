package Sortowanie.Wersja_trenera;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab={3,5,7,9,0,9,7,5,4,43,33,4,34,5,6,6,7,87,8,3,2,2,345,45,6};

        CountingSort sort =new CountingSort ();
       // System.out.println (Arrays.toString (sort.sortuj (tab,345)));
        QuickSort sort1 = new QuickSort ();
        System.out.println (Arrays.toString (sort1.sortuj (tab,0,tab.length-1)));
    }
}
