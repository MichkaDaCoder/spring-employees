package springemployees.dao;

import com.sun.org.apache.xml.internal.security.Init;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import springemployees.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * EmployeeImplementation.java: implements <b>IEmployeeDAO</b> Interfaces. Contains some 
 * declarations and the implementation of all Spring CRUD methods
 * @author MichkaDaCoder
 */
@Repository("employeeImpl")
public class EmployeeImplementation implements IEmployeeDAO{
    private DataSource dataSource;
    private  JdbcTemplate jdbcTemplate;
    int index;

    final private String SQL_INSERT="INSERT INTO EMPLOYEE(FIRST_NAME,LAST_NAME,BIRTHDATE,PHONE,ADDRESS,EMAIL,JOB,SALARY,HIREDATE) VALUES(?,?,?,?,?,?,?,?,?)";
    final private String SQL_UPDATE="UPDATE EMPLOYEE SET FIRST_NAME=?, LAST_NAME=?, BIRTHDATE=?,PHONE=?,ADDRESS=?,EMAIL=?,JOB=?,SALARY=?, HIREDATE=? WHERE ID=?";
    final private String SQL_DELETE="DELETE FROM EMPLOYEE WERE ID=?";
    final private String SQL_LIST="SELECT * FROM EMPLOYEE";
    final private String SQL_SEARCH="SELECT * FROM EMPLOYEE WHERE ID=?";
    
    public EmployeeImplementation() {
        // jt=new JdbcTemplate(dataSource);
    }

    @Autowired
    @Override
    public void setDataSource(DataSource dataSource) {
        //this.dataSource=dateSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    
    @Override
    public int add(Employee employee) {
       this.index=jdbcTemplate.update(SQL_INSERT, employee.getFirstName(),employee.getLastName(),employee.getBirthdate(),employee.getPhone(),employee.getAddress(),employee.getEmail(),employee.getJob(),employee.getSalary(),employee.getHireDate());
       return index;
    }

    @Override
    public int edit(Employee employee) {
       this.index=jdbcTemplate.update(SQL_INSERT, employee.getFirstName(),employee.getLastName(),employee.getBirthdate(),employee.getPhone(),employee.getAddress(),employee.getEmail(),employee.getJob(),employee.getSalary(),employee.getHireDate());
       return index;
    }

    @Override
    public boolean delete(Employee employee) {
        index=jdbcTemplate.update(SQL_DELETE, employee.getID());
        return index==1;
    }

    @Override
    public List<Employee> list() {
        List<Employee> l=jdbcTemplate.query(SQL_LIST, new EmployeeMapper());
        return l;
    }


    @Override
    public Employee getEmployee(int ID) {
        Employee employee=jdbcTemplate.queryForObject(SQL_SEARCH,new Object[] {ID},new EmployeeMapper());
        return employee;
    }

}
