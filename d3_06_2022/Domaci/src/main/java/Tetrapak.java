public class Tetrapak extends Ambalaza{
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean reciklira;
    private int osnovnaCena;

    public Tetrapak(String barkod, String nazivArtikla, double netoTezinu, double brutoTezinu, boolean reciklira, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezinu, brutoTezinu);
        this.reciklira = reciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isReciklira() {
        return reciklira;
    }

    public void setReciklira(boolean reciklira) {
        this.reciklira = reciklira;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        if(this.reciklira){
          return  this.brutoTezinu * 1.5 * this.osnovnaCena;
        }
        return this.osnovnaCena;
    }

    @Override
    public void stampaj() {
        if(reciklira){
            System.out.println("Ambalaza moze da se  reciklira");
        }else {
            System.out.println("Ambalaza nije za recikliranje");
        }
        System.out.println("Osnovna cena: " + this.osnovnaCena);

    }
}
