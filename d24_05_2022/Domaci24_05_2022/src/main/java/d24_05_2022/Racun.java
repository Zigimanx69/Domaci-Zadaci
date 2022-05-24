package d24_05_2022;

import javax.print.DocFlavor;

public class Racun {
//    broj racuna (npr: 170-289328923-23)
//    ime i prezime osobe
//    trenutno stanje na racunu (npr: 100, 1220)
//    gettere i setter za sve atribute, sem settera za stanje na racunu
//    metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
//    metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.

    private String brojRacuna;
    private String punoImeosobe;
    private double trenutnoStanje;

    public Racun(){

    }
    public Racun(String brojRacuna,String punoImeosobe,int trenutnoStanje){
        this.brojRacuna = brojRacuna;
        this.punoImeosobe = punoImeosobe;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public String getPunoImeosobe() {
        return punoImeosobe;
    }

    public void setPunoImeosobe(String punoImeosobe) {
        this.punoImeosobe = punoImeosobe;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public boolean promeniStanjeNaRacunu(int promena){
        if (this.trenutnoStanje + promena < 0){
            System.out.println("Stanje racuna ne moze biti negativno");
            return false;
        }else {
            trenutnoStanje = trenutnoStanje + promena;
            return true;
        }
    }

    public void stampaj(){
        System.out.println(this.punoImeosobe + " - " + this.brojRacuna);
        System.out.println("Stanje na racunu je: " + this.trenutnoStanje + "rsd.");
    }
}
