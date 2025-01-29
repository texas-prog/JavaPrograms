class Person{
    String name;
    public Person(String name){
        this.name = name;
    } 
    public String getname() {
         return name;
    } 
    public void setname(String name) {
        this.name = name;
    }
}

class Employee extends Person{
    String employeeId;
    public Employee(String name, String employeeId){
        super(name);
        this.employeeId = employeeId;
    }
    public String getemployeeId() {
        return employeeId;
    }
    public void setemployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}

public class Main {
    public static void main(String args[]) {
        Employee emp = new Employee("Arjun Dagar", "1234");
        System.out.println("Employee Name: " + emp.getname());
        System.out.println("Employee ID: " + emp.getemployeeId());
    }
}