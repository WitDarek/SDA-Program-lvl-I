package Rozne;

public class Main {
    public static void main(String[] args) {
        wywolajSilnia ();
    }
    public static void wywolajSilnia(){
        Silnia silnia=new Silnia ();
        System.out.println (silnia.rekurencyjnie (5));
    }
}
