public class Client {
    private String nume;
    private String prenume;
    private String email;

    public Client(String nume, String prenume, String email) {
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
    }

    public String getNume() { return nume; }
    public String getPrenume() { return prenume; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return nume + " " + prenume + " (" + email + ")";
    }
}