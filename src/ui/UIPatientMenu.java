package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {

    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:
                    showBookAppointmentMenu();
                    break;
                case 2:
                    showPatientMyAppointment();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0);
    }

    private static void showBookAppointmentMenu() {
        int response = 0;
        do {
            System.out.println("::Book an Appointment");
            System.out.println("Select Date: ");
            //Numeracion de las listas de las fechas
            //Indice de la fecha que seleccione el usuario
            //[Doctors]
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i <  UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppoiment> availableAppoiments = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppoiments();

                 Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppoiments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppoiments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }

            }

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "", "");

            for (Map.Entry<Integer, Doctor> doc: doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName()
                    + " .Date: " + doctorSelected.getAvailableAppoiments().get(indexDate).getDate() + ". Time: "
                    + doctorSelected.getAvailableAppoiments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change data");
            response = Integer.valueOf(sc.nextLine());

            if (response == 1) {
                UIMenu.patientLogged.addAppointementDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppoiments().get(indexDate).getDate(),
                        doctorSelected.getAvailableAppoiments().get(indexDate).getTime());
                showPatientMenu();
            }

        }while(response != 0);
    }

    private static void showPatientMyAppointment() {
        int response = 0;

        do {
            System.out.println("::My Appointments");
            if (UIMenu.patientLogged.getAppointementDoctors().size() == 0){
                System.out.println("Dont have Appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointementDoctors().size(); i++) {
                int j = 1 + 1;
                System.out.println(j + ". " +
                        "Date: " + UIMenu.patientLogged.getAppointementDoctors().get(i).getDate() +
                        " Time:" + UIMenu.patientLogged.getAppointementDoctors().get(i).getTime() +
                        "\nDoctor: " + UIMenu.patientLogged.getAppointementDoctors().get(i).getDoctor());
            }

            System.out.println("0. Return");
            
        }while (response != 0);
    }
}
