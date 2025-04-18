public class ClientVIP extends Client {
    private double discount;

    public ClientVIP(String nume, String prenume, String email, double discount) {
        super(nume, prenume, email);
        this.discount = discount;
    }

    public double getDiscount() { return discount; }
}