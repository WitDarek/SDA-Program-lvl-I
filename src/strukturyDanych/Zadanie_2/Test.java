package strukturyDanych.Zadanie_2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        wywolajStosTab();


    }

    public static void wywolajStosTab() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rozmiar tablicy");
        int size = scanner.nextInt();
        StosTab stosTab = new StosTab(size);

        while (true) {
            System.out.println("Podaj operację:" +
                    "1. pusch()" +
                    "2. pop()" +
                    "3. peek()" +
                    "4. print()" +
                    "0. wyjscie");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Podaj wartość tablicy");
                    int value = scanner.nextInt();
                    try {
                        stosTab.push(value);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println(stosTab.pop());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println(stosTab.peek());
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    stosTab.print();
                    break;
                case 0:
                    return;

            }
        }
    }
}

