package d24_05_2022;

public class Transakcije {
//    id transakcije
//    racun sa kog se prenose sredstva
//    racun na koji se prenose sredstva
//    gettere i settere
//            konstruktore
//    privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
//    ako je prenos sredstava manji od 4500, provizija je fiksna 45
//    ako je prenos sredstava veci od 4500, provizija je 1%
//    S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji
//    predstavlja visinu transakcije
//    Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
//    metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se
//    unosi vrednost koja se prebacuje.
//    Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje
//    samo (trazena suma).

    private int idTransakcije;
    private Racun racunsaKogSePrenosSredstva;
    private Racun racunNakojiSePrenoseSrestva;

    public Transakcije(int idTransakcije,Racun racunsaKogSePrenosSredstva,Racun racunNakojiSePrenoseSrestva){
        this.idTransakcije = idTransakcije;
        this.racunNakojiSePrenoseSrestva = racunNakojiSePrenoseSrestva;
        this.racunsaKogSePrenosSredstva = racunsaKogSePrenosSredstva;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getRacunsaKogSePrenosSredstva() {
        return racunsaKogSePrenosSredstva;
    }

    public void setRacunsaKogSePrenosSredstva(Racun racunsaKogSePrenosSredstva) {
        this.racunsaKogSePrenosSredstva = racunsaKogSePrenosSredstva;
    }

    public Racun getRacunNakojiSePrenoseSrestva() {
        return racunNakojiSePrenoseSrestva;
    }

    public void setRacunNakojiSePrenoseSrestva(Racun racunNakojiSePrenoseSrestva) {
        this.racunNakojiSePrenoseSrestva = racunNakojiSePrenoseSrestva;
    }

    private double provizija(int visinaTransakcije){
        if (visinaTransakcije < 4500){
            return 45;
        }else {
            return visinaTransakcije / 100;
        }
    }

    public void izvrsiTransakciju(int vrednost){
        if (this.racunsaKogSePrenosSredstva.promeniStanjeNaRacunu(vrednost * -1)){
            this.racunNakojiSePrenoseSrestva.promeniStanjeNaRacunu(vrednost);
        }
    }
}
