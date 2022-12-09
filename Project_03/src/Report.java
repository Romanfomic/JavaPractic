public class Report {
    public static void generateReport(Employee[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf("%-15s %15s %n", array[i].getFullname(), array[i].getSalary());
        }
    }
}
