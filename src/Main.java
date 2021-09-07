import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Eder Ruíz", "Cardiólogo");
        myDoctor.valores();

        Patient patient = new Patient("Ricardo Villalobos", "villardo@gmail.com");
        patient.namEmail();
        patient.setPhoneNumber("52147898");
        System.out.println(patient.getPhoneNumber());
        //showMenu();
    }
}
