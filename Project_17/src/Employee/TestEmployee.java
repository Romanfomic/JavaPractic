package Employee;

public class TestEmployee {
    public static void main(String[] args) {
        EmployeeController controller = new EmployeeController();
        retreiveDataFromDatabase(controller);
        controller.updateView();
    }

    public static void retreiveDataFromDatabase(EmployeeController controller){
        controller.setEmployeeHours(100);
        controller.setEmployeeHourPayment(20);
        controller.setEmployeeName("Ivan");
    }
}
