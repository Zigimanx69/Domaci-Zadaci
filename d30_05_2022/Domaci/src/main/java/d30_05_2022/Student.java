package d30_05_2022;

import java.util.ArrayList;

public class Student {
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)


    private int brojIndeksa;
    private String punoIme;
    private String studije;
    ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student(int brojIndeksa, String punoIme, String studije) {
        this.brojIndeksa = brojIndeksa;
        this.punoIme = punoIme;
        this.studije = studije;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getStudije() {
        return studije;
    }

    public void setStudije(String studije) {
        this.studije = studije;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void dodajIspit(Ispit ispiti) {
        this.ispiti.add(ispiti);

    }

    public double prosek() {
        double prosekk = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            Ispit ispit = ispiti.get(i);
            if (ispit.ispitPolozen()) {
                prosekk += ispit.getOcena();
            }
        }
        return prosekk / ispiti.size();
    }

    public void stampaj() {
        System.out.println(this.brojIndeksa + " - " + this.punoIme + " - " + this.studije);
        System.out.println("Predmeti: ");
        for (int i = 0; i < ispiti.size(); i++) {
            Ispit ispit = ispiti.get(i);
            System.out.println(ispit.getPredmet() + " - " + ispit.getPunoImekojiPredajePredmet() + " - " + ispit.getOcena());
        }
        System.out.println("Prosecna ocena je: " + prosek());
    }

}
