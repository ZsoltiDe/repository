import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

    private Employee employee;



    private ObservableList<Employee> ObservableListEmployee= FXCollections.observableArrayList();

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public ObservableList<Employee> getObservableListEmployee() {
        return ObservableListEmployee;
    }

    public void setObservableListEmployee(ObservableList<Employee> observableListEmployee) {
        ObservableListEmployee = observableListEmployee;
    }
}
