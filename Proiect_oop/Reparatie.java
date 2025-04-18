import java.time.LocalDate;

public class Reparatie implements Comparable<Reparatie> {
    private String descriere;
    private LocalDate data;
    private double cost;

    public Reparatie(String descriere, LocalDate data, double cost) {
        this.descriere = descriere;
        this.data = data;
        this.cost = cost;
    }

    public LocalDate getData() { return data; }
    public double getCost() { return cost; }

    @Override
    public String toString() {
        return data + ": " + descriere + " - " + cost + " RON";
    }

    @Override
    public int compareTo(Reparatie o) {
        return this.data.compareTo(o.data);
    }
}