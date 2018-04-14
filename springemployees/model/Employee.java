package springemployees.model;
import java.util.Date;

/**
 * Employee.java: model class
 * @author MichkaDaCoder
 */
public class Employee {
    private int ID;
    private String FirstName;
    private String LastName;
    private Date Birthdate;
    private String Phone;
    private String Address;
    private String Email;
    private String Job;
    private int Salary;
    private Date HireDate;

    public Employee() {
    }
    
    public Employee(String FirstName, String LastName, Date Birthdate, String Phone, String Address, String Email, String Job, int Salary, Date HireDate) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Birthdate = Birthdate;
        this.Phone = Phone;
        this.Address = Address;
        this.Email = Email;
        this.Job = Job;
        this.Salary = Salary;
        this.HireDate = HireDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

   

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String Job) {
        this.Job = Job;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate(Date HireDate) {
        this.HireDate = HireDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        return this.ID == other.ID;
    }

    @Override
    public String toString() {
        return  FirstName +" " +LastName + "[ Birthdate: " + Birthdate + ", Phone: " + Phone + ", Address: " + Address + ", Email: " + Email + ", Job: " + Job + ", Salary: " + Salary + ", HireDate: " + HireDate + ']';
    }
}
