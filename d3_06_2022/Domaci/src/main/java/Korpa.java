import java.util.ArrayList;

public class Korpa {
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze), kao parametar funkcije se prima
//    Super karticu iz koje se cita popust.

    private ArrayList<Ambalaza> niz = new ArrayList<>();

    public void dodaj(Ambalaza ambalaza) {
        niz.add(ambalaza);
    }

    public void izbaci(String barkod) {
        niz.remove(barkod);
    }

    private double cenaAmbalazaPopust(double popust) {
        double suma = 0;
        for (int i = 0; i < niz.size(); i++) {
            suma = niz.get(i).cenaArtikla();
        }return suma - popust;
    }
    public double ukupnaCenaKorpe(double superKartica){
        double sum = 0;
        for (int i = 0; i < niz.size(); i++) {
            sum = niz.get(i).cenaArtikla();
        }return sum - superKartica;
    }
}