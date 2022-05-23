package d23_05_2022;

public class MainBiblioteka {
    public static void main(String[] args) {
        Autor a = new Autor("Mitar", "Miric");
        Knjiga k = new Knjiga(12355,"Orlovi rano lete",1988,a);
        k.stampaj();

        System.out.println(" ");

        Autor b = new Autor();
        b.setIme("Miroslav");
        b.setPrezime("Miskovic");


        Knjiga r = new Knjiga();
        r.setIsbn(123456);
        r.setNaziv("Dobro jutro gospodine");
        r.setGodinaIzdanja(2002);
        r.setAutor(b);
        r.stampaj();
    }
}
