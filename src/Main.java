import zadania_abstrakcja_interfejs_Z1.GwiazdaSmierci;
import zadania_abstrakcja_interfejs_Z2.Kolo;
import zadania_abstrakcja_interfejs_Z2.Prostokat;
import zadania_abstrakcja_interfejs_Z2.Prostopadloscian;

public class Main {
    public static void main(String[] args) {

        GwiazdaSmierci statekKosmiczny = new GwiazdaSmierci();
        System.out.println("Oto przykład ataku laserem:");
        statekKosmiczny.atakujLaserem();
        System.out.println();

        Kolo koloPierwsze = new Kolo(1, "Zielony");
        Kolo koloDrugie = new Kolo(4.5, "Fioletowy");
        koloPierwsze.pole();
        koloDrugie.obwod();
        koloDrugie.wyswietlKolor();
        System.out.println();
        Prostokat prostakatPierwszy = new Prostokat(5, 7);
        prostakatPierwszy.pole();
        System.out.println();
        Prostopadloscian prostopadloscian = new Prostopadloscian(5, 2, 2);
        prostopadloscian.objetoscProstopadloscianu();
        System.out.println();

        Info obiektInfo = new Info() {
            @Override
            public void wyswietlInfo() {
                System.out.println("informacja wypisana z klasy anonimowej");
            }
        };

        obiektInfo.wyswietlInfo();

    }
}

interface Info {
    void wyswietlInfo();
}