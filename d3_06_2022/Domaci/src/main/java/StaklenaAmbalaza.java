import com.sun.security.jgss.GSSUtil;

public class StaklenaAmbalaza extends Ambalaza{
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.

    private int cenaKaucije;
    private boolean daLiSePlacaKaucija;
    private int osnovnaCena;

    public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezinu, double brutoTezinu, int cenaKaucije, boolean daLiSePlacaKaucija, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezinu, brutoTezinu);
        this.cenaKaucije = cenaKaucije;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public int getCenaKaucije() {
        return cenaKaucije;
    }

    public void setCenaKaucije(int cenaKaucije) {
        this.cenaKaucije = cenaKaucije;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(this.daLiSePlacaKaucija){
            return this.osnovnaCena * 1.2 + this.cenaKaucije;
        }
        return this.osnovnaCena * 1.2;
    }

    @Override
    public void stampaj() {
       if(daLiSePlacaKaucija){
           System.out.println("Kaucija za flasu se placa");
       }else {
           System.out.println("Kaucija za flasu se ne naplacuje");
       }
        System.out.println("Cena kaucija za flasu je: " + this.cenaKaucije);
        System.out.println("Osnovna cena je: " + this.osnovnaCena);
    }
}
