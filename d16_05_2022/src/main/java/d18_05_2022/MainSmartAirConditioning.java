package d18_05_2022;

public class MainSmartAirConditioning {
    public static void main(String[] args) {
        SmartAirConditioning s = new SmartAirConditioning();
        s.markaKlime = "Samsung";
        s.temperatura = 22;
        s.mod = "hladi";
        s.stampa();

        System.out.println("");

        SmartAirConditioning e = new SmartAirConditioning();
        e.markaKlime = "Galanz";
        e.temperatura = 30;
        e.mod = "greje";
        e.stampa();
    }
}

