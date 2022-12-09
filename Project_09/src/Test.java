import java.util.TreeSet;

public class Test {
    public Test(){
        TreeSet<Person> people = new TreeSet<Person>();
        people.add(new Person("Tom"));
        people.add(new Person("Jack"));
        people.add(new Person("Peter"));
        people.add(new Person("Vasya"));
        people.add(new Person("Petya"));
        for(Person person : people){
            System.out.println(person.getName());
        }
    }
}
