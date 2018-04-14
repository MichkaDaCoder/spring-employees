package springemployees.main;

import java.util.Date;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springemployees.model.*;
import springemployees.dao.*;

/**
 * Main.java : contains the main(String[]) method, the creation of a new
 * Employee object and the implementation of the Spring CRUD methods of the
 * class EmployeeImplementation.
 * @author MichkaDaCoder
 */
public class Main {

    public static void main(String[] a) {
        // Create and initialize a new Employee object.
        Employee employee = new Employee("John", "DOE", new Date("12/05/1987"), "632-5542-231", "CA, USA", "johndoe@mail.com", "Senior .NET Developer", 30000, new Date("23/02/2005"));
        try {
            // Definition of the Bean file declarations.
            ApplicationContext actx = new ClassPathXmlApplicationContext("Beans.xml");
            // Parsing the xml file to get the Bean object for the class we want.
            EmployeeImplementation ei = (EmployeeImplementation) actx.getBean("employeeImpl");

            System.out.println("Adding a new employee : ");
            ei.add(employee);
            System.out.println("List of the Employees : \n");
            for (Employee e : ei.list()) {
                if(ei.list().isEmpty()) {
                    System.out.println("No data.");
                }
                else {
                System.out.println(e);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        System.out.println("\nBrought to you by : MichkaDaCoder");
    }
}
