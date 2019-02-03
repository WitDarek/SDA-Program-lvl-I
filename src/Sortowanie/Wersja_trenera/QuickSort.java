package Sortowanie.Wersja_trenera;

public class QuickSort {

    public int[] sortuj(int[] tab,int lewy, int prawy){
        int pivot = tab[(lewy+prawy)/2];
        int i =lewy;
        int j=prawy;
        int tmp=0;

        while (i<=j){
            while (tab[i]<pivot){
                i++;
            }
            while (tab[j]>pivot){
                j--;
            }
            if(i<=j){
                tmp=tab[i];
                tab[i]=tab[j];
                tab[j]=tmp;
                i++;
                j++;
            }
        }
        if(lewy<j) {
            sortuj (tab, lewy, j);
        }
        if(i<prawy) {
            sortuj (tab, i, prawy);
        }
        return tab;
    }
}
