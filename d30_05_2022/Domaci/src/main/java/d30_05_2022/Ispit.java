package d30_05_2022;

public class Ispit {
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)


    private String predmet;
    private int ocena;
    private String punoImekojiPredajePredmet;

    public Ispit(String predmet, int ocena, String punoImekojiPredajePredmet) {
        this.predmet = predmet;
        this.ocena = ocena;
        this.punoImekojiPredajePredmet = punoImekojiPredajePredmet;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getPunoImekojiPredajePredmet() {
        return punoImekojiPredajePredmet;
    }

    public void setPunoImekojiPredajePredmet(String punoImekojiPredajePredmet) {
        this.punoImekojiPredajePredmet = punoImekojiPredajePredmet;
    }

    public boolean ispitPolozen() {
        if (this.ocena >= 6 && this.ocena <= 10) {
            return true;
        }
        return false;
    }

    public void stampaj() {
        System.out.println(this.predmet + " - " + this.punoImekojiPredajePredmet + " - " + this.ocena);
    }
}
