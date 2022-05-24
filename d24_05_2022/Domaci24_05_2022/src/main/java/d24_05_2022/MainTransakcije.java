package d24_05_2022;

public class MainTransakcije {
    public static void main(String[] args) {
        Racun posiljalac = new Racun("123456","Igor Djokic", 2000);
        Racun primalac = new Racun("987456", "Ilija Cvorovic", 1455);

        Transakcije prva = new Transakcije(1234,posiljalac,primalac);
        prva.izvrsiTransakciju(5000);
        primalac.stampaj();
        posiljalac.stampaj();
    }
}
