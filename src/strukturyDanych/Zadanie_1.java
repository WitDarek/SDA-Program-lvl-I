package strukturyDanych;

public class Zadanie_1 {
    public static void main(String[] args) {
        int tab[] = {4, 7, 2, 6, 5, 9, 3, 12};

        allNumberEven(tab);
        addDiv3(tab);
        add5MinusLast(tab);

    }
    public static void allNumberEven(int[] tab) {

        for (int i = tab.length - 1; i >= 0; i--) {
            if (i % 2 == 0)
                System.out.println("Wartość tablicy o indeksie "+i+"="+tab[i]);
        }
    }
    public static void addDiv3(int[] tab) {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 3 == 0) {
                suma += tab[i];
            }
        }
        System.out.println("Suma liczb podzielnych przez 3 ="+suma);
    }

    public static void add5MinusLast(int[] tab) {
        int suma = 0;
        if(tab.length<6){
            System.out.println("Za mało elementów");
            return;
        }
        for (int i = 0; i < 5; i++) {
            suma += tab[i];
        }
        System.out.println("Suma 5 początkowych liczb ="+suma);
        System.out.println("Suma 5 początkowych liczb odjąć ostatni element tablicy "+tab[tab.length-1]+ " ="+(suma - tab[tab.length - 1]));
    }
}

