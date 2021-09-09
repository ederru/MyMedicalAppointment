package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends  User {

    //Atributos
    private String speciality;
    private ArrayList<AvailableAppoiment> availableAppoiments = new ArrayList<>();


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




    public void addAvailaleAppoiment(String date, String time) {
        availableAppoiments.add(new Doctor.AvailableAppoiment(date, time));
    }

    public ArrayList<AvailableAppoiment> getAvailableAppoiments() {
        return availableAppoiments;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Ricardo Contreras");
        System.out.println("Departamento: Oncología");
    }


    public static class AvailableAppoiment {
        //Avaliable Appointment
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");



        public AvailableAppoiment(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
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

        public String getDate(String DATE) {
            return format.format(date);
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
