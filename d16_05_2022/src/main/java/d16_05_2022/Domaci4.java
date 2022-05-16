package d16_05_2022;

public class Domaci4 {
    public static void main(String[] args) {
//        Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/// / / / /

        metoda(5, "/");
    }

    static void metoda(int n, String karakter) {
        for (int i = 0; i < n; i++) {
            System.out.print(karakter);

        }
    }
}
