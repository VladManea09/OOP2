import java.util.ArrayList;
import java.util.List;

public class Departamente {
    private static List<Departament> departamente = new ArrayList<>();

    public static void adaugaDepartament(Departament d) {
        departamente.add(d);
    }

    public static List<Departament> getDepartamente() {
        return departamente;
    }
}
