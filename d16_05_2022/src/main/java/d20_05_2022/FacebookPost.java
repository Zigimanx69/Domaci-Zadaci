package d20_05_2022;

public class FacebookPost {

    public String imePrezimeObjavljen;
    public String imePrezimeNakomJeObjavljenPost;
    public String tekstPoruke;
    public int brojLajkova;
    public int brojDeljenja;


    public FacebookPost(){

    }

    public FacebookPost(String imePrezimeNakomJeObjavljenPost, String imePrezimeObjavljen, String tekstPoruke){
      this.imePrezimeNakomJeObjavljenPost = imePrezimeNakomJeObjavljenPost;
      this.imePrezimeObjavljen = imePrezimeObjavljen;
      this.tekstPoruke = tekstPoruke;
    }

    public void like(){
       this.brojLajkova= this.brojLajkova + 1;
    }

    public void dislike(){
        if(this.brojLajkova >= 0){
            this.brojLajkova = this.brojDeljenja - 1;
        }
    }

    public void share(){
        this.brojDeljenja = this.brojDeljenja + 1;
    }

    public void print(){
        System.out.println(this.imePrezimeObjavljen + " >>> " + this.imePrezimeNakomJeObjavljenPost);
        System.out.println(this.tekstPoruke);
        System.out.println("Likes " + brojLajkova + " | " + "Shares " + brojDeljenja);
    }
}
