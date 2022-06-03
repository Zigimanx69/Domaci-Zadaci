package d02_06_2022;

public class Magacioner extends Radnik{
    public Magacioner(String imeIprezime) {
        super(imeIprezime);
    }
//    Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//    ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//    suma plata svih sektor / broj sektora * 0.5
//    override uje metodu za platu, tako da se plata racuna po formuli:
//            (prosecna plata za sve sektore u kojima radi) * (broj sektora).

    private double prosecnaPlata(){
        int suma = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            Sektor sektor = nizSektora.get(i);
            suma += sektor.getPlata() / nizSektora.size() * 0.5;
        }
        return suma;
    }

    @Override
    public double plata(){
        double suma = 0;
        for (int i = 0; i < nizSektora.size(); i++) {
            Sektor sektor = nizSektora.get(i);
            suma = this.prosecnaPlata() * nizSektora.size();
        }
        return suma;
    }
}

