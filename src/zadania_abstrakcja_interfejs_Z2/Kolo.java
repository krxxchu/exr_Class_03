package zadania_abstrakcja_interfejs_Z2;

public class Kolo implements FiguraGeometryczna {

    double promienKola;
    String kolorKola;

    public Kolo(double promienKola, String kolorKola) {
        this.promienKola = promienKola;
        this.kolorKola = kolorKola;
    }

    @Override
    public double pole() {
        double poleKola = Math.PI * Math.pow(promienKola, 2);
        System.out.println("Pole koła wynosi: " + poleKola);
        return poleKola;
    }

    @Override
    public double obwod() {
        double obwodKola = 2 * Math.PI * promienKola;
        System.out.println("Obwod kola wynosi: " + obwodKola);
        return obwodKola;
    }

    public void wyswietlKolor() {
        System.out.println("Kolor koła to: " + kolorKola);
    }
}
