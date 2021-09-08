public class User {

    private static int id;
    private String name;
    private String email;
    private String adress;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        User.id = id;
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

    @Override
    public String toString() {
        return "name= " + name + " email= " + email + "\n" +
                "adress= " + adress  + " phoneNumber= " + phoneNumber;
    }
}
