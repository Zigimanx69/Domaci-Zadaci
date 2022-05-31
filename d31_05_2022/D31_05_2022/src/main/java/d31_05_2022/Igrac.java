package d31_05_2022;

public class Igrac extends Osoba {
//    broj (broj koji igrac nosi)
//    poziciju koju igra (odbrambeni, napadac, … )
//    kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere za broj, kapiten i poziciju
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu

    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {

    }

    public Igrac(String punoIme, int jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Igrac nosi dres sa brojem: " + this.broj);
        System.out.println("Igrac igra na poziciji: " + this.pozicija);
        if (this.kapiten) {
            System.out.println("Igrac je kapiten");
        } else {
            System.out.println("Igrac nije kapiten");
        }

    }
}
