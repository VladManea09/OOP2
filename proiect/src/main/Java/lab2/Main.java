public class Main {
    public static void main(String[] args) {
        ManagementService service = ManagementService.getInstance();

        Departament it = new Departament("IT");
        Departament hr = new Departament("HR");
        Departamente.adaugaDepartament(it);
        Departamente.adaugaDepartament(hr);

        Angajat ang1 = new Angajat("Ion", "Popescu", 2020, 5000, it);
        Angajat ang2 = new Angajat("Maria", "Ionescu", 2021, 5500, it);
        Angajat ang3 = new Angajat("Andrei", "Vasilescu", 2019, 4800, hr);
        Angajat ang4 = new Angajat("Ana", "Georgescu", 2022, 5100, hr);

        service.schimbaDepartament(ang1, hr);
        service.schimbaSalariu(ang4, 6000);

        service.afiseazaDepartamente();
        service.afiseazaMembriDepartamente();

        service.salariuMediu(it);
        service.salariuMediu(hr);
    }
}
