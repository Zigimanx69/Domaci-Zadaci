package d24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class MainZeleni {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<ZeleniKarton> niz = new ArrayList<>();

        System.out.println("Unesite broj zelenih kartona za ispite: ");
        int n = s.nextInt();

        for (int i = 0; i <= n; i++) {
            System.out.println("Unesite ime i prezime studenta: ");
            String imePrezime = s.nextLine();
            System.out.println("Uensite broj indeksa: ");
            int brojindeksa = s.nextInt();
            System.out.println("Unesite naziv predmeta: ");
            String nazivPredmeta = s.next();
            System.out.println("Unesite ime profesora: ");
            String imeProfesora = s.nextLine();
            System.out.println("Unesite ocenu: ");
            int ocena = s.nextInt();
            ZeleniKarton x = new ZeleniKarton(imePrezime, brojindeksa, nazivPredmeta, imeProfesora, ocena);
            niz.add(x);

        }

        for (int i = 0; i < niz.size(); i++) {
            System.out.println();
            niz.get(i).stampaj();
        }

    }
}