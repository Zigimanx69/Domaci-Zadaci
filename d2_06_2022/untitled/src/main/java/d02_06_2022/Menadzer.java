package d02_06_2022;

public class Menadzer extends Radnik{
    public Menadzer(String imeIprezime) {
        super(imeIprezime);
    }

    //    Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//    override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima
    @Override
    public double plata(){
        int suma = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            Sektor sektor = nizSektora.get(i);
            suma += sektor.getPlata();
        }
        return suma;
    }
}
