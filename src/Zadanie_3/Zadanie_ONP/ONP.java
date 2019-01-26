package Zadanie_3.Zadanie_ONP;

import Zadanie_3.StosLista;
import Zadanie_3.StosListaOutOfIndex;

public class ONP {
    public ONP(){

    }
    public void run(String[] tab){
        StosLista stosLista = new StosLista ();

        for(String e:tab){
            try {
                int value = Integer.parseInt (e);
                stosLista.push (value);
            }catch (NumberFormatException ex){
                int valueFirstElemnet=0;
                int valueSecondElement=0;
                try {
                    valueSecondElement = stosLista.pop();
                    valueFirstElemnet = stosLista.pop ();
                } catch (StosListaOutOfIndex stosListaOutOfIndex) {
                    stosListaOutOfIndex.printStackTrace ();
                }
                int count =0;
                switch (e){
                    case "+":
                        count =valueFirstElemnet+valueSecondElement;
                        break;
                    case "-":
                        count =valueFirstElemnet-valueSecondElement;
                        break;
                    case "*":
                        count =valueFirstElemnet*valueSecondElement;
                        break;
                    case "/":
                        count =valueFirstElemnet/valueSecondElement;
                        break;
                }
                stosLista.push (count);

            }
        }
        try {
            int result = stosLista.pop ();
            System.out.println ("Wynik: "+result);
        } catch (StosListaOutOfIndex stosListaOutOfIndex) {
            stosListaOutOfIndex.printStackTrace ();
        }
    }
}
