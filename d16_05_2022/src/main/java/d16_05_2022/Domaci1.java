package d16_05_2022;

public class Domaci1 {
    public static void main(String[] args) {
//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena
//        vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        stampajVrednostza10Vecu(5);
    }

    static void stampajVrednostza10Vecu(int vrednost) {
        int sum = vrednost * 10;
        System.out.println(sum);
    }
}

