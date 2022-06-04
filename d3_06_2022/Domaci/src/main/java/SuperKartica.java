public class SuperKartica {
//    broj kartice
//    ime i prezime vlasnika
//    popust (200, 500, … )
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu stampaj koja stampa karticu u formatu:
//            (broj kartice), (ime i prezime)

    private int brojKArtice;
    private String punoImeVlasnika;
    private double popust;

    public SuperKartica(){

    }
    public SuperKartica(int brojKArtice, String punoImeVlasnika, int popust) {
        this.brojKArtice = brojKArtice;
        this.punoImeVlasnika = punoImeVlasnika;
        this.popust = popust;
    }

    public int getBrojKArtice() {
        return brojKArtice;
    }

    public void setBrojKArtice(int brojKArtice) {
        this.brojKArtice = brojKArtice;
    }

    public String getPunoImeVlasnika() {
        return punoImeVlasnika;
    }

    public void setPunoImeVlasnika(String punoImeVlasnika) {
        this.punoImeVlasnika = punoImeVlasnika;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }
    public void stampaj(){
        System.out.println(this.brojKArtice + ", " + this.punoImeVlasnika);
    }
}
