public abstract class Ambalaza {
//    barkod (primer: 328232-2823)
//    naziv artikla
//    neto tezinu
//    bruto tezinu
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//    abstraktnu metodu koja vraca cenu artikla
//    abstraktnu metodu stampaj

    protected String barkod;
    protected String nazivArtikla;
    protected double netoTezinu;
    protected double brutoTezinu;

    public Ambalaza(){

    }

    public Ambalaza(String barkod, String nazivArtikla, double netoTezinu, double brutoTezinu) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezinu = netoTezinu;
        this.brutoTezinu = brutoTezinu;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getNetoTezinu() {
        return netoTezinu;
    }

    public void setNetoTezinu(double netoTezinu) {
        this.netoTezinu = netoTezinu;
    }

    public double getBrutoTezinu() {
        return brutoTezinu;
    }

    public void setBrutoTezinu(double brutoTezinu) {
        this.brutoTezinu = brutoTezinu;
    }

    public void racunaTezinuPakovanja(){
        double racuna = this.brutoTezinu - this.netoTezinu;
    }

    public abstract double cenaArtikla();

    public abstract void stampaj();
}
