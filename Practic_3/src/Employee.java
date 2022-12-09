public class Employee {
    private String fullname;
    private int salary;
    public Employee(String fullname, int salary){
        this.fullname = fullname;
        this.salary = salary;
    }
    public String getFullname() { return fullname; }
    public int getSalary() { return salary; }

    public String toString() {
        String info = "fullName: " + fullname + "\t\tSalary: " + salary;
        return info;
    }
}
