package pl.coderslab.seleniumcourseonlteaw36.pageobjectpattern_zadania.HotelTestLab;

public class UserPersonalData {
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;

    public String getFirstName() {
        return firstName;
    }

    public UserPersonalData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserPersonalData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserPersonalData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserPersonalData setPassword(String password) {
        this.password = password;
        return this;
    }
}
