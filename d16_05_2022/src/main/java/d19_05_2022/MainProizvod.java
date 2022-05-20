package d19_05_2022;

public class MainProizvod {
    public static void main(String[] args) {

        Proizvod jabuka = new Proizvod();
        jabuka.naziv = "Jabuka";
        jabuka.cena = 50;
        jabuka.tezina = 99;

        jabuka.stampaj();
        jabuka.povecajCenu(20);
        double popust =jabuka.vratiCenuSaPopustom(50);
        System.out.println("Cena sa popustom bi bila: " + popust);
        int posta = jabuka.racunajPostarinu();
        System.out.println("Postarina za proizvod iznosi: " + posta + "din");


        System.out.println("");

        Proizvod kruska = new Proizvod();
        kruska.naziv = "Kruska";
        kruska.cena = 200;
        kruska.tezina = 700;


       // kruska.povecajCenu(10);
        double popust2 = kruska.vratiCenuSaPopustom(10);
        System.out.println("Cena sa popustom bi bila: " + popust2);
        int posta2 = kruska.racunajPostarinu();
        System.out.println("Postarina za proizvod iznosi: " + posta2 + "din");
        kruska.stampaj();


    }
}
