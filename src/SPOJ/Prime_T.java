package SPOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Prime_T {
    public static void main(String[] args) {

        boolean[] tab = new boolean[10001];
        Arrays.fill (tab, true);
        tab[0] = false;
        tab[1] = false;
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ();
        int liczba;
        for (int i = 0; i < n; i++) {
            liczba = scanner.nextInt ();
            System.out.println (Sito (tab, liczba));
        }
        scanner.close ();

    }

    public static String Sito(boolean[] tab, int n)
    {
        String txt=null;
        for (int i = 2; i < tab.length; i++) {
            if (tab[i] == true)
            {
                for (int j = i * i; j < tab.length; j = j + i)
                {
                    tab[j] = false;
                }
            }
        }

        for (int i = 0; i < tab.length; i++)
        {
            if (n == i)
            {
                if (tab[i] == true)
                {
                    txt="TAK";
                } else
                    txt="NIE";
            }
        }return txt;
    }
}


