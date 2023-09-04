package zadania_abstrakcja_interfejs_Z2;

public class Prostopadloscian extends Prostokat {


    double wysokosc;


    public Prostopadloscian(double bokA, double bokB, double wysokosc) {
        super(bokA,bokB);
        // TAK NIE MOŻE BYC this.bokA = bokA;
        //  poniewaz  this.bokB = bokB;
        this.wysokosc = wysokosc;
    }

    public double objetoscProstopadloscianu() {
        double objetosc = bokA * bokB * wysokosc;
        System.out.println("Objetosc prostopadloscianu wynosi: " + objetosc);
        return objetosc;
    }

}

