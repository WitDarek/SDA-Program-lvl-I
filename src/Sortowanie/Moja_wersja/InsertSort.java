package Sortowanie.Moja_wersja;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] tab = {5, 7, 2, 8, 3, 1, 6, 9, 4, 11, 4, 6, 3};
        Sort (tab);
    }

    public static void Sort(int[] tab) {
        int tmp = 0;
        for (int i = 0; i < tab.length - 1; i++) {

            /*if(tab[i+1]<tab[i]) {
                tmp = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = tmp;
            }*/
            for (int j = i; j >= 0; j--) {
                if (tab[j + 1] < tab[j]) {
                    tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                }
                if (tab[j + 1] <= tab[j]) break;
            }
            System.out.println (Arrays.toString (tab));
        }
    }

}

