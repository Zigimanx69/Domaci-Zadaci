public class Main {
    public static void main(String[] args) {
        Korpa korpa = new Korpa();
        Ambalaza tetra = new Tetrapak("1234", "Mleko", 90, 120, true, 150);
        Ambalaza staklo = new StaklenaAmbalaza("741258", "Pivo", 330, 340, 100, true, 160);

        SuperKartica kart = new SuperKartica(123, "Igor Djokic", 200);

        korpa.dodaj(tetra);
        korpa.dodaj(staklo);


        System.out.println("Ukupna cena korpe je: " + korpa.ukupnaCenaKorpe(kart));
    }
}


