import java.util.*;
import java.util.stream.Collectors;

public class ServiceAtelier {
    private List<Client> clienti = new ArrayList<>();
    private List<Ceas> ceasuri = new ArrayList<>();
    private TreeSet<Reparatie> reparatii = new TreeSet<>();
    private Map<Client, List<Ceas>> relatii = new HashMap<>();

    public void adaugaClient(Client c) {
        clienti.add(c);
    }

    public void adaugaCeas(Client c, Ceas ceas) {
        ceasuri.add(ceas);
        relatii.computeIfAbsent(c, k -> new ArrayList<>()).add(ceas);
    }

    public void adaugaReparatie(Reparatie r) {
        reparatii.add(r);
    }

    public void afiseazaCeasuriDupaMarca(String marca) {
        for (Ceas c : ceasuri) {
            if (c.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(c);
            }
        }
    }

    public void afiseazaCeasuriClient(Client client) {
        List<Ceas> lista = relatii.get(client);
        if (lista != null) {
            for (Ceas c : lista) System.out.println(c);
        }
    }

    public void afiseazaReparatii() {
        for (Reparatie r : reparatii) System.out.println(r);
    }

    public void totalCost(Client client) {
        double total = reparatii.stream().mapToDouble(Reparatie::getCost).sum();
        System.out.println("Total reparații: " + total);
    }
}