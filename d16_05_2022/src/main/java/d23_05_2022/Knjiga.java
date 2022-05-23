package d23_05_2022;

public class Knjiga {
//    Kreirati klasu Knjiga koji ima:
//            -ISBN
//-naziv
//-godina izdanja
//-autor
//-konstuktore koje mislite da su vam potrebni
//-gettere i settere za atribute
//-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//            (ISBN)
//            (naziv) - (godina izdanja)
//    autor: (ime autora) (prezime autora)

    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Knjiga(){

    }
    public Knjiga(int isbn,String naziv,int godinaIzdanja,Autor autor){
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }
    public void stampaj(){
        System.out.println(this.isbn);
        System.out.println(this.naziv + " - " + this.godinaIzdanja);
        this.autor.stampaj();

    }



}
