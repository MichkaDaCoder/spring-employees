package springemployees.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import springemployees.model.Employee;
import org.springframework.jdbc.core.RowMapper;

/**
 * EmployeeMapper.java: Implements <b>RowMapper<Class? object></b> Interface. Contains some
 * declarations and one methods that maps the SQL table rows to the Employee class attributes
 * @author MichkaDaCoder
 */
public class EmployeeMapper implements RowMapper<Employee>{
    
    private final String ID="ID";
    private final String FIRST_NAME="FIRST_NAME";
    private final String LAST_NAME="LAST_NAME";
    private final String BIRTHDATE="BIRTHDATE";
    private final String PHONE="PHONE";
    private final String ADDRESS="ADDRESS";
    private final String EMAIL="EMAIL";
    private final String JOB="JOB";
    private final String SALARY="SALARY";
    private final String HIREDATE="HIREDATE";
    
    /**
     * Maps the SQL table rows to Employee table attributes.
     * @param rs
     * @param i
     * @return <b>Employee</b>
     * @throws SQLException 
     */
    @Override
    public Employee mapRow(ResultSet rs, int i) throws SQLException {
        Employee employee=new Employee();
        employee.setID(rs.getInt(ID));
        employee.setFirstName(rs.getString(FIRST_NAME));
        employee.setLastName(rs.getString(LAST_NAME));
        employee.setBirthdate(rs.getDate(BIRTHDATE));
        employee.setPhone(rs.getString(PHONE));
        employee.setAddress(rs.getString(ADDRESS));
        employee.setEmail(rs.getString(EMAIL));
        employee.setJob(rs.getString(JOB));
        employee.setSalary(rs.getInt(SALARY));
        employee.setHireDate(rs.getDate(HIREDATE));
        return employee;
    }

}
