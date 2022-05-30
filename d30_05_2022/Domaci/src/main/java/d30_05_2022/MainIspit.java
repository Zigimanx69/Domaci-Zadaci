package d30_05_2022;

public class MainIspit {
    public static void main(String[] args) {
        Ispit i = new Ispit("Matematika",8,"Dragutin Topic" );
        Ispit r = new Ispit("Fizicko", 7,"Miloje Dargoje");
        Ispit m = new Ispit("Istorija", 6,"Milojko Topic");

        Student prvi = new Student(544654,"Igor Djokic","Master");

        prvi.dodajIspit(i);
        prvi.dodajIspit(r);
        prvi.dodajIspit(m);
        prvi.stampaj();
    }
}
