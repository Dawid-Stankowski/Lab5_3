import java.util.ArrayList;

public class Uczen {
    private String imie;
    private String nazwisko;
    private ArrayList<Double> oceny;

    public Uczen(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();
    }

    // Dodawanie ocen
    public void dodajOcene(double ocena) {
        if (ocena >= 1.0 && ocena <= 5.0) {
            oceny.add(ocena);
            System.out.println("Ocena " + ocena + " dodana dla ucznia " + imie + " " + nazwisko);
        } else {
            System.out.println("Ocena musi być w zakresie od 1.0 do 5.0");
        }
    }

    // Obliczanie średniej ocen
    public double obliczSredniaOcen() {
        if (oceny.isEmpty()) {
            return 0.0;
        } else {
            double suma = 0.0;
            for (Double ocena : oceny) {
                suma += ocena;
            }
            return suma / oceny.size();
        }
    }

    // Informacje o uczniu
    public String informacjeOUczniu() {
        return "Imię: " + imie + "\nNazwisko: " + nazwisko + "\nŚrednia ocen: " + obliczSredniaOcen();
    }


    public static void main(String[] args) {

        Uczen uczen = new Uczen("Jan", "Kowalski");

        //Testowe dodwanie ocen
        uczen.dodajOcene(4.5);
        uczen.dodajOcene(3.0);
        uczen.dodajOcene(5.0);

        // Wyświetlenie informacji o uczniu
        System.out.println(uczen.informacjeOUczniu());
    }
}
