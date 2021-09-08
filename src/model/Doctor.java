package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends  User {

    //Atributos
    private String speciality;


    public Doctor(String name, String email, String speciality) {
        super(name, email);
        this.speciality = speciality;
    }

    //Comportamientos
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }



    ArrayList<AvailableAppoiment> availableAppoiments = new ArrayList<>();
    public void addAvailaleAppoiment(Date date, String time) {
        availableAppoiments.add(new Doctor.AvailableAppoiment(date, time));
    }

    public ArrayList<AvailableAppoiment> getAvailableAppoiments() {
        return availableAppoiments;
    }


    public static class AvailableAppoiment {
        //Avaliable Appointment
        private int id;
        private Date date;
        private String time;



        public AvailableAppoiment(Date date, String time){
            this.date = date;
            this.time = time;
        }



        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
