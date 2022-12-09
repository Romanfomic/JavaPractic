public class TestEmployee {
    public TestEmployee(){
        Employee[] array = new Employee[5];
        array[0] = new Employee("Ivan Ivanov", 100);
        array[1] = new Employee("Petr Petrov", 120);
        array[2] = new Employee("Alex Sidorov", 90);
        array[3] = new Employee("Vlad Smirnov", 210);
        array[4] = new Employee("Some Bodyev", 150);
        Report.generateReport(array);
    }
}
