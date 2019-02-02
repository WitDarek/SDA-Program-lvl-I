package SPOJ;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Flamaster {
        public static void main(String[] args) {
            String text;
            Scanner scanner=new Scanner (System.in);
            int testy =scanner.nextInt ();

            for (int i = 0; i <=testy; i++) {
                text=scanner.nextLine ();
                char[] chars = text.toCharArray ();
                Convert (chars);
                System.out.println ();

            }
        }
        public static void Convert (char[] chars){
            int index=2;
//        char[] chars1=new char[chars.length];
            for (int i = 1; i <chars.length ; i++) {
                System.out.print (Character.toString (chars[i-1]));
                if (chars[i]==chars[i-1]) {
                    i++;
                    if(i==chars.length) {
//                        System.out.print (Character.toString (chars[i-2]));
                        System.out.print (Character.toString (chars[i-1]));
                        break;
                    }
                    if (chars[i] == chars[i-1] ) {
                        while (chars[i] == chars[i-1]) {
                            index++;
                            i++;
                            if(i==chars.length) break;
                        }
                        System.out.print (index);
//                        System.out.print (Character.toString (chars[i-1])+index);
                        index=2;
                    }
                    else{
//                        System.out.print (Character.toString (chars[i-1]));
                        System.out.print (Character.toString (chars[i-1]));
                    }
                }
                else
                if(i==1)
                {
//                    System.out.print (Character.toString (chars[i-1]));
                    System.out.print (Character.toString (chars[i]));
                }else
                    System.out.print (Character.toString (chars[i]));

            }
        }
}
