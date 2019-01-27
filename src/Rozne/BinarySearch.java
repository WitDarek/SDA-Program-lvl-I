package Rozne;

public class BinarySearch {
    public static void main(String[] args) {


        int[] tab = new int[1000];
        int y = 1800;

        for(int i=0;i<tab.length;i++){
            tab[i]=i*2;
        }
        run(tab,y);
    }

    public static void run(int[] tab,int y){
        int lewo =0;
        int prawo = tab.length-1;
        int srodek=0;


        while(lewo<prawo){
            srodek=(lewo+prawo)/2;

            if (tab[srodek]<y){
                lewo=srodek+1;
            }
            else
                prawo=srodek;
        }
        if (tab[lewo]==y){
            System.out.println ("Szukana wartość jest na indexie = "+lewo  );
        }
        else
            System.out.println ("Brak szukanej wartości");
    }


}
