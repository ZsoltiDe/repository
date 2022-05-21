import com.sun.javafx.beans.IDProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import javax.persistence.*;
import java.util.Date;
@Entity

public class Employee {
    @Id
    @GeneratedValue
    @Access(AccessType.PROPERTY)
    private StringProperty emailAddress=new SimpleStringProperty();
    private StringProperty firstName= new SimpleStringProperty();
    private StringProperty lastName = new SimpleStringProperty();
    private ObjectProperty<Address> Address= new SimpleObjectProperty<Address>();
    private ObjectProperty<DateOfBirth> DateOfBirth= new SimpleObjectProperty<DateOfBirth>();
    private StringProperty Profession= new SimpleStringProperty();

    public String getEmailAddress() {
        return emailAddress.getValue();
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress.setValue(emailAddress);
    }

    public String getFirstName() {
        return firstName.getValue();
    }

    public void setFirstName(String firstName) {
        this.firstName.setValue(firstName);
    }

    public String getLastName() {
        return lastName.getValue();
    }

    public void setLastName(String lastName) {
        this.lastName.setValue(lastName);
    }

    public Address getAddress() {
        return Address.getValue();
    }

    public void setAddress(Address address) {this.Address.setValue(address);
    }

    public DateOfBirth getDateOfBirth() {
        return DateOfBirth.getValue();
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        DateOfBirth.setValue(dateOfBirth);
    }

    public String getProfession() {
        return Profession.getValue();
    }

    public void setProfession(String profession) {
        Profession.setValue(profession);
    }

    @Override
    public String toString() {
        return firstName+ " "+lastName;

    }
}
