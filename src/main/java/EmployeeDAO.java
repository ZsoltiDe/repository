import java.util.List;

public interface EmployeeDAO extends AutoCloseable {
    public void saveEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
    public void updateEmployee(Employee employee);
    public List<Employee> getEmployee();
    public void close()throws InterruptedException;

}
