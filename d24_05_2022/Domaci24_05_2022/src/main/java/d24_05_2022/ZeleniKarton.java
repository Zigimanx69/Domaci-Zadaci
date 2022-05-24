package d24_05_2022;

public class ZeleniKarton {
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime

    private String punoIme;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imePrezimeProfesora;
    private int ocena;


    public ZeleniKarton(){

    }
    public ZeleniKarton(String punoIme, int brojIndeksa, String nazivPredmeta, String imePrezimeProfesora, int ocena) {
        this.punoIme = punoIme;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imePrezimeProfesora = imePrezimeProfesora;
        this.ocena = ocena;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }

    public void setImePrezimeProfesora(String imePrezimeProfesora) {
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean polozenIspitIliNe(){
       if(ocena > 5){
           return true;
       }else{
           return false;
       }
    }
    public void stampaj(){
        System.out.println(this.nazivPredmeta + " - " + this.ocena);
        System.out.println("Student : " + this.punoIme + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imePrezimeProfesora);
    }
}
