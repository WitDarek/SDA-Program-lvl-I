package Sortowanie.Moja_wersja;

import java.util.Arrays;

public class Sortowanie {
    public static void main(String[] args) {
        int[] tab= {5,7,2,8,3,1,6,9,4,11,4,6,3};
        SortArray (tab);
    }

    public static void SortArray(int[] tab){
        int[] tab1=new int[tab.length];
        int tmp=0;
        for (int i = 0; i < tab.length; i++) {
            for (int j =i+1 ; j < tab.length; j++) {
                if(tab[j]<tab[i]){
                    tmp=tab[j];
                    tab[j]=tab[i];
                    tab[i]=tmp;

                }
            }
            System.out.println (Arrays.toString (tab));
        }
    }
}
