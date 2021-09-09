package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends  User {

    private String birthday;
    private double weight;
    private double height;
    private String blod;

    private ArrayList<AppointementDoctor> appointementDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();



    public ArrayList<AppointementDoctor> getAppointementDoctors() {
        return appointementDoctors;
    }

    public void addAppointementDoctors(Doctor doctor, Date date, String time) {
        AppointementDoctor appointementDoctor = new AppointementDoctor(this, doctor);
        appointementDoctor.schedule(date, time);
        appointementDoctors.add(appointementDoctor);
    }

    public void setAppointementDoctors(ArrayList<AppointementDoctor> appointementDoctors) {
        this.appointementDoctors = appointementDoctors;
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //Peso en kg
    public String getWeightKG(){
        return this.weight + "KG";
    }

    public double getHeight() {
        return height;
    }
    //Altura en cm
    public String getHeightCM(){
        return this.getHeight() + "cm";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlod() {
        return blod;
    }

    public void setBlod(String blod) {
        this.blod = blod;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nbirthday= " + birthday +
                "\nweight=" + weight +
                "\nheight=" + height +
                "\nblod='" + blod;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo.");
    }
}