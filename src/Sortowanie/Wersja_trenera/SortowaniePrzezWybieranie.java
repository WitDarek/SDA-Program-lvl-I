package Sortowanie.Wersja_trenera;

public class SortowaniePrzezWybieranie {
    public int[] sortuj(int[] tab){
        int n =tab.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1 ; j < n; j++) {
                if(tab[j]<tab[i]){
                    //TabUtilis.swap(tab,i,j); Trzeba dokończyć wpisywniae
                }

            }
        }
        return tab;
    }
}
