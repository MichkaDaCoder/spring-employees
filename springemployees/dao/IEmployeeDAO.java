package springemployees.dao;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import springemployees.model.Employee;

/**
 * IEmployeeDAO.java: interface that contains the declarations of the CRUD methods.
 * @author MichkaDaCoder
 */
public interface IEmployeeDAO {
    /**
     * Adds a new Employee 
     * @param employee
     * @return 
     */
    public int add(Employee employee);
    /**
     * Edits an existant employee
     * @param employee
     * @return <b>int</b>
     */
    public int edit(Employee employee);
    /**
     * Deletes an existant employee
     * @param employee
     * @return <b>boolean</b>
     */
    public boolean delete(Employee employee);
    /**
     * List all the existant employees
     * @return <b>List</b>
     */
    public List<Employee> list();
    /**
     * Gets a specific employee by his ID.
     * @param ID
     * @return <b>Employee</b>
     */
    public Employee getEmployee(int ID);
    /**
     * Initializes a new DataSource object.
     * @param ds 
     */
    @Autowired
    public void setDataSource(DataSource ds);
}
