public class Doctor {
    //Atributos
    static int id = 0;//AutoIncrement
    String name;
    String speciality;

    public Doctor() {

    }

    public Doctor(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
        id++;
    }

    //Comportamientos

    public void valores() {
        System.out.println("ID Doctor: " + getId() + " Doctor Name: " + getName() + " Doctor Especiality: " + getSpeciality());
    }

    public void showID() {
        System.out.println("ID Doctor is: " + getId());
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
