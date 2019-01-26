package strukturyDanych.Zadanie_3;

import strukturyDanych.Zadanie_3.Zadanie_ONP.ONP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //wywolajStosList ();
        wywolajONP ();

    }

    public static void wywolajStosList() {
        StosLista stosLista = new StosLista ();
        stosLista.push (1);
        stosLista.push (2);
        stosLista.push (3);

        stosLista.print ();

        try {
            stosLista.pop ();
            stosLista.pop ();
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace ();
        }
        stosLista.push (4);
        stosLista.push (5);
        stosLista.push (6);

        try {
            System.out.println (stosLista.peek ());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace ();
        }
        try {
            stosLista.pop ();
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace ();
        }
        try {
            System.out.println (stosLista.peek ());
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace ();
        }

        stosLista.print ();

    }
    public static void wywolajONP(){
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine ();
        System.out.println ("Podaj wyrażenie");
        String[] operations = input.split (" ");
        new ONP ().run(operations);
    }
}

