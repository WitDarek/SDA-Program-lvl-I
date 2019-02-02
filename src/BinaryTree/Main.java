package BinaryTree;

import Rozne.BinarySearch;

public class Main {
    public static void main(String[] args) {
        wywolajBST ();
    }
    public static void wywolajBST(){
        BinarySearchTree bst = new BinarySearchTree ();
        bst.dodaj (5);
        bst.dodaj (2);
        bst.dodaj (7);
        bst.dodaj (10);
        bst.dodaj (3);
        bst.dodaj (6);
        bst.dodaj (15);
        bst.dodaj (21);
        bst.dodaj (1);

        bst.usun (1);
        bst.usun (7);
    }
}
