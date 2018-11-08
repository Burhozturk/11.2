import java.util.Date;

public class Employee extends Person
{
    private String employeeOffice="office";
    private String employeeSalary="salary";
    private Date employeeDate;
    Mydate myDateObject=new Mydate();
    Person newPersonObject=new Person();

    public String getEmployeeOffice() {
        return employeeOffice;
    }

    public void setEmployeeOffice(String employeeOffice) {
        this.employeeOffice = employeeOffice;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(String employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Date getEmployeeDate()
    {
        employeeDate=myDateObject.setDate(System.currentTimeMillis());
        return employeeDate;
    }

    public void setEmployeeDate(Date employeeDate) {
        this.employeeDate = employeeDate;
    }

    public Employee()
    {



    }

    public String toString()
    {
        return getClass().getSimpleName()+newPersonObject.getName();
    }


}
