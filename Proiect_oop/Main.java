import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ServiceAtelier atelier = new ServiceAtelier();

        Client c1 = new Client("Ion", "Popescu", "ion@gmail.com");
        Client c2 = new ClientVIP("Maria", "Ionescu", "maria@gmail.com", 0.1);
        Ceas ceas1 = new Ceas("123", "Casio", "Quartz", "nu funcționează");
        Ceas ceas2 = new Ceas("456", "Seiko", "Automatic", "pierdută coronița");

        atelier.adaugaClient(c1);
        atelier.adaugaClient(c2);
        atelier.adaugaCeas(c1, ceas1);
        atelier.adaugaCeas(c2, ceas2);

        atelier.adaugaReparatie(new Reparatie("Schimbat baterie", LocalDate.of(2024, 3, 10), 50));
        atelier.adaugaReparatie(new Reparatie("Curățat mecanism", LocalDate.of(2024, 3, 15), 120));

        System.out.println("-- Ceasuri Seiko --");
        atelier.afiseazaCeasuriDupaMarca("Seiko");

        System.out.println("-- Ceasuri client Ion --");
        atelier.afiseazaCeasuriClient(c1);

        System.out.println("-- Reparatii sortate --");
        atelier.afiseazaReparatii();

        System.out.println("-- Cost total reparatii --");
        atelier.totalCost(c1);
    }
}