public class Ceas {
    private String serie;
    private String marca;
    private String mecanism;
    private String stare;

    public Ceas(String serie, String marca, String mecanism, String stare) {
        this.serie = serie;
        this.marca = marca;
        this.mecanism = mecanism;
        this.stare = stare;
    }

    public String getSerie() { return serie; }
    public String getMarca() { return marca; }
    public String getStare() { return stare; }

    @Override
    public String toString() {
        return marca + " (" + serie + ") - " + stare;
    }
}