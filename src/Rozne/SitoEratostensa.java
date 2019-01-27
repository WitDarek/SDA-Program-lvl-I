package Rozne;

import java.util.Arrays;

public class SitoEratostensa {
    public static void main(String[] args) {
        boolean[] tab = new boolean[10000];
        Arrays.fill (tab, true);
        tab[0]=false;
        tab[1]=false;
        Sito (tab);
    }

    public static void Sito(boolean[] tab) {
        for (int i = 2; i < tab.length; i++) {
            if (tab[i] == true) {
                for (int j = i * i; j < tab.length; j = j + i) {
                    tab[j] = false;
                }
            }
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println (i + "= " + tab[i]);
        }

    }

}


