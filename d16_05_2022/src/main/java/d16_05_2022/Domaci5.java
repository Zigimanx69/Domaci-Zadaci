package d16_05_2022;

public class Domaci5 {
    public static void main(String[] args) {
        //        Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

        int rez = celiBrojevi(5, 10);
        System.out.println(rez);

    }

    static int celiBrojevi(int m, int n) {
        int sum = n - m - 1;
        return sum;
    }
}


