package Kopiec;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        wywolajKopiec ();
    }
    public static void wywolajKopiec(){
        int[] tab=new int[] {3,8,2,6,10,7,9,15,4,18};
        Kopiec kopiec=new Kopiec ();
        kopiec.run (tab);
        System.out.println (Arrays.toString (tab));
    }
}
