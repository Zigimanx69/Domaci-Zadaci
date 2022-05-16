package d16_05_2022;

public class Domaci3 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.

        podaci(1406198873, "Igor", "Djokic", 1988, true);

    }

    static void podaci(int jmbg, String ime, String prezime, int god, boolean aktivan) {
        System.out.println("JMBG: " + jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("God.rodjenja: " + god);
        System.out.println("Aktivan: " + aktivan);
    }

}

