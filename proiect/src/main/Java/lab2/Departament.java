import java.util.ArrayList;
import java.util.List;

public class Departament {
    private final String numeDepartament;
    private List<Angajat> membri = new ArrayList<>();

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
    }

    public void adaugaAngajat(Angajat angajat) {
        membri.add(angajat);
    }

    public void stergeAngajat(Angajat angajat) {
        membri.remove(angajat);
    }

    public List<Angajat> getMembri() {
        return membri;
    }

    public int getNumarAngajati() {
        return membri.size();
    }

    public String getNumeDepartament() {
        return numeDepartament;
    }
}

