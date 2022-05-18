package d18_05_2022;

public class SmartAirConditioning {
//    Kreirati klasu SmartAirConditioning koja ima:
//    atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//    atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//    atribut za mod (hladi/greje)
//    metodu za stampu - stampa u formatu: Proizvoljno :)
//
//
//    U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i za svaki od njih pozvati metodu za stampu

    String markaKlime;
    int temperatura;
    String mod;

    public void stampa() {
        System.out.println("Marka klime je " + markaKlime + ", " + "temperaturu koju ste izabrali je " + temperatura + "." + "Mod koji je trenutno ukljucen je da " + mod + ".");
    }
}
