import com.sun.javafx.beans.IDProperty;
import javafx.beans.property.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity

public class Employee {
    @Id
    @GeneratedValue
    @Access(AccessType.PROPERTY)
    private StringProperty emailAddress=new SimpleStringProperty();
    private StringProperty name= new SimpleStringProperty();



    private IntegerProperty phoneNumber=new SimpleIntegerProperty();

    private StringProperty gender= new SimpleStringProperty();

    private StringProperty address= new SimpleStringProperty();
    private ObjectProperty<LocalDate> dateOfBirth= new SimpleObjectProperty<LocalDate>();
    private StringProperty profession= new SimpleStringProperty();
    public String getGender() {
        return gender.getValue();
    }



    public void setGender(String gender) {
        this.gender.set(gender);
    }

    public String getEmailAddress() {return emailAddress.getValue();
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress.setValue(emailAddress);
    }

    public String getName() {
        return name.getValue();
    }

    public void setName(String firstName) {
        this.name.setValue(firstName);
    }



    public String getAddress() {
        return address.getValue();
    }

    public void setAddress(String address) {this.address.setValue(address);
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth.getValue();
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth.setValue(dateOfBirth);
    }
    public int getPhoneNumber() {
        return phoneNumber.get();
    }



    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber.set(phoneNumber);
    }

    public String getProfession() {
        return profession.getValue();
    }

    public void setProfession(String profession) {
        this.profession.setValue(profession);
    }
    public StringProperty emailAddressProperty(){
        return this.emailAddress;
    }
    public StringProperty nameProperty (){
        return this.name;
    }
    public StringProperty genderProperty(){
        return this.gender;
    }
    public StringProperty addressProperty(){
        return this.address;
    }
    public StringProperty professionProperty(){
        return this.profession;
    }
    public ObjectProperty dateOfBirthProperty(){
        return this.dateOfBirth;
    }
    public IntegerProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public Employee() {
    }
}
