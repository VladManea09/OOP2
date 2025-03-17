public class ManagementService {
    private static ManagementService instance;

    private ManagementService() {}

    public static ManagementService getInstance() {
        if (instance == null) {
            instance = new ManagementService();
        }
        return instance;
    }

    public void inregistreazaAngajat(Angajat angajat, Departament departament) {
        if (departament.getMembri().contains(angajat)) {
            System.out.println("Angajatul deja exista in departament!");
        } else {
            departament.adaugaAngajat(angajat);
            System.out.println("Angajat adaugat cu succes in " + departament.getNumeDepartament());
        }
    }

    public void schimbaDepartament(Angajat angajat, Departament nouDepartament) {
        Departament vechi = angajat.getDepartament();
        vechi.stergeAngajat(angajat);
        nouDepartament.adaugaAngajat(angajat);
        angajat.setDepartament(nouDepartament);
        System.out.println("Angajatul a fost mutat in " + nouDepartament.getNumeDepartament());
    }

    public void schimbaSalariu(Angajat angajat, int nouSalariu) {
        angajat.setSalariu(nouSalariu);
        System.out.println("Salariul lui " + angajat.getNume() + " a fost actualizat la " + nouSalariu);
    }

    public void afiseazaDepartamente() {
        for (Departament d : Departamente.getDepartamente()) {
            System.out.println(d.getNumeDepartament());
        }
    }

    public void afiseazaMembriDepartamente() {
        for (Departament d : Departamente.getDepartamente()) {
            System.out.println("Departament: " + d.getNumeDepartament() + " | Membri: " + d.getNumarAngajati());
            for (Angajat a : d.getMembri()) {
                System.out.println("  - " + a.getNume() + " " + a.getPrenume());
            }
        }
    }

    public void salariuMediu(Departament departament) {
        int suma = 0;
        for (Angajat a : departament.getMembri()) {
            suma += a.getSalariu();
        }
        double medie = (departament.getNumarAngajati() > 0) ? (double) suma / departament.getNumarAngajati() : 0;
        System.out.println("Salariul mediu in " + departament.getNumeDepartament() + " este " + medie);
    }
}