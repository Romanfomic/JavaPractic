package Employee;

public class Employee {

    String name;
    Integer hours;

    Integer iHourPayment;

    public Integer getHourPayment() {
        return iHourPayment;
    }

    public void setHourPayment(Integer iHourPayment) {
        this.iHourPayment = iHourPayment;
    }

    public String getName() {
        return name;
    }

    public void setName(String stName) {
        this.name = stName;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer iHours) {
        this.hours = iHours;
    }

    public Integer getSalary(){
        return iHourPayment * hours;
    }
}