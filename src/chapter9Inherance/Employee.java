package chapter9Inherance;

public class Employee extends Person{
    private String employeeId;
    private String employeeTitle;

    //Default constructor
    public Employee(){
        super(20);
        System.out.println("In employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }
}
