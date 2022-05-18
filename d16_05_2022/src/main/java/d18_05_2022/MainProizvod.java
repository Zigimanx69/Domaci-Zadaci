package d18_05_2022;

public class MainProizvod {
    public static void main(String[] args) {
        Proizvod p = new Proizvod();
        p.cenaProizvoda = 344;
        p.nazivProizvoda = "Breskva";
        p.tezinaProizvoda = 32.1;
        p.stampaj();

        System.out.println("");

        Proizvod e = new Proizvod();
        e.cenaProizvoda = 277;
        e.nazivProizvoda = "Kruska";
        e.tezinaProizvoda = 100.0;
        e.stampaj();

    }
}