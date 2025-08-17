public class Person {
    
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    

    //Constructores
    public Person() {
        this.firstName = "Jhon";
        this.lastName = "Doe";
        this.email = "jhon.doe@email.com";
        this.phoneNumber = "1122335481";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = "jhon.doe@email.com";
        this.phoneNumber = "1122335481";
    }

    public Person(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = "1122335481";
    }

    public Person(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //toString
    @Override
    public String toString() {
        return String.format("Person: fullName=%s %s, email=%s, phone=%s", firstName,lastName,email,phoneNumber);
        
    }
    
}
