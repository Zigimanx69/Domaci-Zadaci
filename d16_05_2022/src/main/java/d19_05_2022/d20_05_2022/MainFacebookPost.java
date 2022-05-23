package d20_05_2022;

public class MainFacebookPost {
    public static void main(String[] args) {
        FacebookPost f = new FacebookPost();
          f.imePrezimeObjavljen = "Igor Djokic";
          f.imePrezimeNakomJeObjavljenPost = "Dragana Djokic";
          f.tekstPoruke = "Ja sam legenda";
          f.brojLajkova = 3;
          f.brojDeljenja = 5;

          f.like();
          f.share();
          f.print();

        System.out.println("");

          FacebookPost d = new FacebookPost("Ivana Djokic" , "Jasar Ahmedovski","Jednoj zeni za secanje dugo");
          d.brojDeljenja = 2;
          d.brojLajkova = 28;
          d.print();
    }
}
