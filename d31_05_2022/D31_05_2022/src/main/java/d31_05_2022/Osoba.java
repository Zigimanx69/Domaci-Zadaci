package d31_05_2022;

public class Osoba {
//    ime i prezime
//            jmbg
//    godinu rodjenja
//    default-ni konstuktor
//    konstuktor sa parametrima
//    gettere i settere
//    metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)

    protected String punoIme;
    protected int jmbg;
    protected int godinaRodjenja;

    public Osoba() {

    }

    public Osoba(String punoIme, int jmbg, int godinaRodjenja) {
        this.punoIme = punoIme;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

    public void stampaj() {
        System.out.println(this.punoIme + ", " + this.jmbg + ", " + this.godinaRodjenja);
    }
}
