package d31_05_2022;

public class MainOsoba {
    public static void main(String[] args) {
        Igrac igor = new Igrac("Igor Djokic", 55444, 1988, 69, "Napadac", true);
        Igrac milan = new Igrac("Milan Jovanovic", 99855, 1997, 44, "Odbrana", false);
        igor.stampaj();
        System.out.println();
        Trener anceloti = new Trener("Carlo Anceloti", 445569, 1955, 25, "Kondicioni");
        Trener capelo = new Trener("Fabio Capelo", 77899, 1966, 30, "Fitnes");
        anceloti.stampaj();

    }
}
