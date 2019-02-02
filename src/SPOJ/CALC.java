/*CALC - Kalkulator

Napisz program, który działa jak prosty kalkulator obsługujący pięć operacji: dodawanie, odejmowanie, mnożenie, dzielenie i obliczanie reszty z dzielenia liczb całkowitych.
Wejście

Na wejście programu podana zostanie pewna nieokreślona liczba zestawów danych. Zestawy składają się z jednoznakowego symbolu operacji do wykonania (+ dodawanie, - odejmowanie, * mnożenie, / dzielenie całkowitoliczbowe, % reszta z dzielenia) oraz następujących po nim dwóch liczb całkowitych. Poszczególne składowe zestawu zostaną rozdzielone spacjami, a same zestawy znakiem nowej linii. Liczba testów nie przekracza 100, wynik zawiera się w typie int32.
Wyjście

Na wyjściu programu ma się pojawić ciąg liczb będących rezultatem wykonania pojawiających się na wejściu poleceń. Poszczególne liczby należy rozdzielić znakami nowej linii. Uwaga! Można założyć, że dane wejściowe nie zawierają polecenia dzielenia przez 0.
Przykład

Wejście:
+ 7 9
- 0 4
* 5 6
/ 8 3
% 5 2

Wyjście:
16
-4
30
2
1
*/

package SPOJ;

import java.util.Scanner;

public class CALC {
    public static void main(String[] args) {
        String znak;
        int a = 0;
        int b = 0;
        int test =101;
        int i=0;
        Scanner scanner = new Scanner (System.in);

        while (scanner.hasNext ()) {        // mozna zrobic to scanner.nextLine czyli jak nie ma następnej lini to wychodzi z petli
            znak = scanner.nextLine ();

            switch (znak) {
                case "+":
                    a = scanner.nextInt ();
                    b = scanner.nextInt ();
                    System.out.println (a + b);
                    break;
                case "-":
                    a = scanner.nextInt ();
                    b = scanner.nextInt ();
                    System.out.println (a - b);
                    break;
                case "*":
                    a = scanner.nextInt ();
                    b = scanner.nextInt ();
                    System.out.println (a * b);
                    break;
                case "/":
                    a = scanner.nextInt ();
                    b = scanner.nextInt ();
                    if (b==0){
                        System.out.println (" ");
                    }
                    else
                    System.out.println (a / b);
                    break;
                case "%":
                    a = scanner.nextInt ();
                    b = scanner.nextInt ();
                    System.out.println (a % b);
                    break;
            }
            i++;
        }
    }

}
