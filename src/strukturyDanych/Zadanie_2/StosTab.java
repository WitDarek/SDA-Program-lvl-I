package strukturyDanych.Zadanie_2;

public class StosTab {

    private int[] tab;
    private int top = -1;

    public StosTab(int size) {
        tab = new int[size];
    }


    public void push(int value) throws ArrayIndexOutOfBoundsException{
        if(isFull()){
            throw new ArrayIndexOutOfBoundsException("isFull");
        }
        tab[++top] = value;
    }

    public int pop() throws ArrayIndexOutOfBoundsException{
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Tablica jest pusta");
        }
        return tab[top--];
    }
    public boolean isEmpty() {
        return top == -1; // automatycznie zwraca jak jest -1 true jak nie to false

/*        if (top == -1){           powyżej jest skrócona wersja tej metody.
            return true;
        }
        else {
            return false;
        }
 */
    }
    public int peek()throws ArrayIndexOutOfBoundsException{
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException("Tablica jest pusta");
        }
        return tab[top];
    }
    public void print(){
        for(int i=0;i<=top;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }
    public boolean isFull(){
        return top>=tab.length-1;
    }
}
