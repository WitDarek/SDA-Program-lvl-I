/*1. Stwórz tablicę intów i wypełnij ją wartościami. Sprawdź czy elementy w tablicy są posortowane niemalejąco. Zwróć true, jeżeli prawda, wpp. false.
2. Stwórz tablicę intów o wielkości podanej przez użytkownika.Wypełnij ją wartościami losowymi, a następnie wypisz wszystkie elementy.
3. Podaj dwie tablice intów o takim samym rozmiarze, zsumuj wartości na tych samych indeksach i wynik zwróć w nowej tablicy.*/

package ZadaniaTablice;

import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        int[] tab = {4, 6, 5, 3, 5};
        int[] tab1 = {5, 4, 3, 2, 1};
        int[] tab2 = {1, 2, 3, 4, 5, 6};
        System.out.println (Sort (tab));
        System.out.println (Sort (tab1));
        System.out.println (Sort (tab2));
        // printArray ();

        System.out.println ("Suma dwóch tablic równa się " + addArrays (tab, tab1));
        System.out.println ("Suma dwóch tablic równa się " + addArrays2 (tab1, tab2));
        Arrays ();
    }


    public static boolean Sort(int[] tab) {
        boolean val = false;
        int val1 = 0;

        for (int i = 1; i < tab.length; i++) {
            val1 = tab[i];
            if (val1 > tab[i - 1])
                val = true;
            else {
                val = false;
                break;
            }

        }
        return val;
    }

    public static void printArray() {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj wielkość tablcy");
        int val = scanner.nextInt ();
        int[] tab = new int[val];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) Math.ceil (Math.random () * 100);
            System.out.print ("tab[" + i + "] = " + tab[i] + " ");
        }

    }

    public static int addArrays(int[] tab, int[] tab2) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += (tab[i] + tab2[i]);
        }
        return sum;
    }

    public static int addArrays2(int[] tab, int[] tab2) {
        int sum = 0;
        int length = 0;

        if (tab.length > tab2.length) {
            length = tab.length;
            int[] tmp = new int[tab.length];
            for (int i = 0; i < tab2.length; i++) {
                tmp[i] = tab2[i];
            }
            for (int i = 0; i < length; i++) {
                sum += (tab[i] + tmp[i]);
            }
        } else {
            length = tab2.length;
            int[] tmp = new int[tab2.length];
            for (int i = 0; i < tab.length; i++) {
                tmp[i] = tab[i];
            }
            for (int i = 0; i < length; i++) {
                sum += (tmp[i] + tab2[i]);
            }
        }
        return sum;

    }

    public static void Arrays() {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Podaj wielkość tablcy");
        int val = scanner.nextInt ();
        int[] tab = new int[val];
        int sum = 0;
        int av = 0;

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) Math.ceil (Math.random () * 100);
            sum += tab[i];
            System.out.print ("tab[" + i + "] = " + tab[i] + " ");
        }
        System.out.println ();
        av = sum / tab.length;
        System.out.println ("średnia wartość elementów tablicy = " + av);
        System.out.print ("Liczby miejsze od średniej: ");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] < av) {
                System.out.print (tab[i] + " ");
            }
        }
        System.out.println ();
        System.out.print ("Liczby większe od średniej: ");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > av) {
                System.out.print (tab[i] + " ");
            }
        }

    }
}
