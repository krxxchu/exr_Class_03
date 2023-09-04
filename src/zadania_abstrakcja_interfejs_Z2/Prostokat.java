package zadania_abstrakcja_interfejs_Z2;

public class Prostokat implements FiguraGeometryczna {

    int sumaKatow = 360;
    double bokA, bokB;

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    public double obwod() {
        double obwodProstokata = 2 * bokA + 2 * bokB;
        System.out.println("Obwod prostokąta to: " + obwodProstokata);
        return obwodProstokata;
    }

    @Override
    public double pole() {
        double poleProstokata = bokA * bokB;
        System.out.println("Pole prostokąta wynosi: " + poleProstokata);
        return poleProstokata;
    }

}
