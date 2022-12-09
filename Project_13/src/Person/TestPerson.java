package Person;

public class TestPerson {
    public static void test(){
        Person p1 = new Person("Surname", "Name", "Patronymic");
        Person p2 = new Person("Surname", "Name");
        Person p3 = new Person("Surname");
        System.out.printf("Person|\n%s\n%s\n%s\n", p1, p2, p3);
    }
}
