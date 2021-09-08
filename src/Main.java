import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Eder Ruíz", "ederru@mail.com", "Neuro");
        myDoctor.addAvailaleAppoiment(new Date(), "4pm");
        myDoctor.addAvailaleAppoiment(new Date(), "10pm");
        myDoctor.addAvailaleAppoiment(new Date(), "1am");

        for (Doctor.AvailableAppoiment aa: myDoctor.getAvailableAppoiments()) {
            System.out.println(aa.getDate() + " " + aa.getTime());
        }


        Patient patient = new Patient("Ricardo Villalobos", "villardo@gmail.com");
        patient.setPhoneNumber("52147898");
        System.out.println(patient);
        //showMenu();
    }
}
