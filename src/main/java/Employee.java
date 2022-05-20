import java.util.Date;

public class Employee {
    private String emailAdres;
    private String firstName;
    private String lastName;
    private Adres Adres;
    private Date DateOfBirth;
    private String Profession;

    public String getEmailAdres() {
        return emailAdres;
    }

    public void setEmailAdres(String emailAdres) {
        this.emailAdres = emailAdres;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Adres getAdres() {
        return Adres;
    }

    public void setAdres(Adres adres) {
        Adres = adres;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getProfession() {
        return Profession;
    }

    public void setProfession(String profession) {
        Profession = profession;
    }

    @Override
    public String toString() {
        return firstName+ " "+lastName;

    }
}
