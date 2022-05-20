package d19_05_2022;

public class Proizvod {

    public String naziv;
    public double cena;
    public double tezina;

    public void stampaj(){
        System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina + ".");
    }

    public void povecajCenu(int povecanje){
       this.cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom(int popust){

       if(popust > 0 || popust <= 100) {
           return  this.cena - (this.cena * popust / 100);
        }return 0;
    }

    public int racunajPostarinu(){
        if(this.tezina <= 100){
            return 200;
        }else if(this.tezina >= 101 && this.tezina <= 500){
            return 400;
        }else{
            return 1000;
        }
    }


}
