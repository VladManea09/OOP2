public class Angajat {
    private String nume;
    private String prenume;
    private int anAngajare;
    private int salariu;
    private Departament departament;

    public Angajat(String nume, String prenume, int anAngajare, int salariu, Departament departament) {
        this.nume = nume;
        this.prenume = prenume;
        this.anAngajare = anAngajare;
        this.salariu = salariu;
        this.departament = departament;
        departament.adaugaAngajat(this);
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getAnAngajare() {
        return anAngajare;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Angajat angajat = (Angajat) o;
        return anAngajare == angajat.anAngajare &&
                nume.equals(angajat.nume) &&
                prenume.equals(angajat.prenume) &&
                departament.equals(angajat.departament);
    }

    @Override
    public String toString() {
        return nume + " " + prenume + " | An: " + anAngajare + " | Salariu: " + salariu;
    }
}