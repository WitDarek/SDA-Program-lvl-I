/*Odwróć kolejność elementów w tablicy.
Wejście

Najpierw liczba testów t (t ≤ 100). Następnie dla każdego testu liczba n (n ≤ 100) i n liczb oddzielonych spacjami.
Wyjście

Dla każdego testu n liczb w porządku odwrotnym niż na wejściu.
Przykład

Wejście:
2
7 1 2 3 4 5 6 7
3 3 2 11

Wyjście:
7 6 5 4 3 2 1
11 2 3
*/

package SPOJ;

import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        int test = 0;

        Scanner scanner = new Scanner (System.in);
        test = scanner.nextInt ();

        for (int i = 0; i < test; i++) {
            int length = scanner.nextInt ();
            int[] tab = new int[length];
            for (int j = 0; j < length; j++) {
                tab[j] = scanner.nextInt ();

            }
            TabRev (tab);
        }

    }

    public static void TabRev(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println (tab[tab.length - i - 1]);
        }
    }

}
