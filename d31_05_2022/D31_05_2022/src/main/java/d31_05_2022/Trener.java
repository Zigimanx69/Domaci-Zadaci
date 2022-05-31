package d31_05_2022;

public class Trener extends Osoba {
    //    godine iskustva
//    tip trenera (kondicioni, za igru, pomocni, personalni)
//    metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
    private int godineIskustva;
    private String tipTrenera;

    public Trener(String punoIme, int jmbg, int godinaRodjenja, int godineIskustva, String tipTrenera) {
        super(punoIme, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tipTrenera = tipTrenera;
    }

    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Trener ima " + this.godineIskustva + " godine iskustva.");
        System.out.println("On je " + this.tipTrenera + " trener.");
    }
}
