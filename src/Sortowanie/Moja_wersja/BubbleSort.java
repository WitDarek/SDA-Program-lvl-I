package Sortowanie.Moja_wersja;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

            int[] tab = {5, 7, 2, 8, 3, 1, 6, 9, 4, 11, 4, 6, 21};
            SortArray (tab);

    }
    public static void SortArray(int[] tab){
        int tmp=0;
        for (int i = 0; i < tab.length-1; i++) {
            boolean zmieniono =false; // ograniczniee wykonywania sortowania jak jest juz poortowane
            for (int j = 0; j < tab.length-1-i; j++) {
                if(tab[j]>tab[j+1]){
                    tmp=tab[j];
                    tab[j]=tab[j+1];
                    tab[j+1]=tmp;
                    zmieniono = true;
                }
            }
            if(!zmieniono) break;
            System.out.println (Arrays.toString (tab));
        }
    }

}

