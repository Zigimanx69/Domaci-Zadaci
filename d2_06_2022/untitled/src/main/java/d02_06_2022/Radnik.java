package d02_06_2022;

import java.util.ArrayList;

public abstract class Radnik {
//    Kreirati abstraktnu klasu Radnik koja ima:
//    ime i prezime
//    niz sektora u kojima radi
//    abstraktnu metodu koja vraca platu radnika
//    metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public Radnik(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    protected String imeIprezime;
    public ArrayList<Sektor> nizSektora = new ArrayList<>();

    public abstract double plata();

    public void zaposliUsektor(Sektor sektor){
        nizSektora.add(sektor);
    }
}


