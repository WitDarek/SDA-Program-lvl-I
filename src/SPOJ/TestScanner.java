package SPOJ;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        String text= "Teksrsddsd sdsd \n aasasassa";
        Scanner scanner = new Scanner (text);
        while (scanner.hasNext ()){
            System.out.println (scanner.hasNext ());
            text=scanner.nextLine ();
            System.out.println (text);
            System.out.println (scanner.hasNext ());
        }
    }
}
