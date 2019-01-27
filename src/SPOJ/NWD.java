package SPOJ;

import java.util.Scanner;

public class NWD {
    public static void main(String[] args) {

        int a=0;
        int b=0;

        Scanner scanner=new Scanner (System.in);
        int IloscTestow = scanner.nextInt ();

        for (int i = 0; i <IloscTestow ; i++) {
            a=scanner.nextInt ();
            b=scanner.nextInt ();
            System.out.println (nwd(a,b));
        }
    }

    public static int nwd(int a ,int b){
        while (b!=0)
        {
            int c =a%b;
            a = b;
            b = c;
        }
        return a;
    }

}
