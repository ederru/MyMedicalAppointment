public class Patient {
    private static int id;
    private String name;
    private String email;
    private String adress;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blod;

    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("Ingresa un numero valido");
        }

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
    //Regresa id,nomre y email
    public void namEmail() {
        System.out.println("ID Patient: " + getId() + " Name: " + getName() + " Email: " + getEmail());
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Patient.id = id;
    }
}