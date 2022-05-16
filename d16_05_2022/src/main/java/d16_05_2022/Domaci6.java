package d16_05_2022;

public class Domaci6 {
    public static void main(String[] args) {
//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.

        int sum = najmanjiBroj(4, 10, 1);
        System.out.println("Najmanji broj od ponudjenih je: " + sum);
    }

    static int najmanjiBroj(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else if (c < a && c < b) {
            return c;
        }
        return 0;

    }
}
