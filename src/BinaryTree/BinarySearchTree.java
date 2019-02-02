package BinaryTree;

public class BinarySearchTree {

    private Wezel korzen;

    public BinarySearchTree() {
        korzen = null;
    }

    public void dodaj(int wartosc) {
        korzen = dodajRekurencyjnie (korzen, wartosc);
    }

    public boolean znajdz(int wartosc) {
        return znajjdujeRekurencyjne (korzen, wartosc);
    }

    public void usun(int wartosc) {
        korzen = usunRekurencyjnie (korzen, wartosc);
    }

    private Wezel dodajRekurencyjnie(Wezel obecny, int wartosc) {
        if (obecny == null) {
            return new Wezel (wartosc);
        }
        if (wartosc < obecny.getWartosc ()) {
            obecny.setLewy (dodajRekurencyjnie (obecny.getLewy (), wartosc));
        } else if (wartosc > obecny.getWartosc ()) {
            obecny.setPrawy (dodajRekurencyjnie (obecny.getPrawy (), wartosc));
        }
        return obecny;
    }

    private boolean znajjdujeRekurencyjne(Wezel obecny, int wartosc) {
        if (obecny == null) {
            return false;
        }
        if (wartosc == obecny.getWartosc ()) {
            return true;
        } else if (wartosc < obecny.getWartosc ()) {
            return znajjdujeRekurencyjne (obecny.getLewy (), wartosc);
        } else if (wartosc > obecny.getWartosc ()) {
            return znajjdujeRekurencyjne (obecny.getPrawy (), wartosc);
        }
        return false;
    }

    private Wezel usunRekurencyjnie(Wezel obecny, int wartosc) {
        if (obecny == null) {
            return null;
        }
        if (wartosc == obecny.getWartosc ()) {
            if (obecny.getLewy () == null && obecny.getPrawy () == null) {
                return null;
            } else if (obecny.getLewy () != null && obecny.getPrawy () == null) {
                return obecny.getLewy ();
            } else if (obecny.getLewy () == null && obecny.getPrawy () != null) {
                return obecny.getPrawy ();
            } else {
                int wartoscMinimumPoddrzewa = znajdzWartoscMinimum (obecny.getPrawy ());
                obecny.setWartosc (wartoscMinimumPoddrzewa);
                obecny.setPrawy (usunRekurencyjnie (obecny.getPrawy (), wartoscMinimumPoddrzewa));
            }
        } else if (wartosc < obecny.getWartosc ()) {
            obecny.setLewy (usunRekurencyjnie (obecny.getLewy (), wartosc));
        } else if (wartosc > obecny.getWartosc ()) {
            obecny.setPrawy (usunRekurencyjnie (obecny.getPrawy (), wartosc));
        }
        return obecny;
    }

    private int znajdzWartoscMinimum(Wezel obecny) {
        while (obecny.getLewy () != null) {
            obecny = obecny.getLewy ();
        }
        return obecny.getWartosc ();
    }


}

