package Student;

import java.util.Calendar;

public class TestStudent {
    public static void test(){
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2002);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DAY_OF_MONTH, 10);
        Student s1 = new Student("name", cal);
        System.out.printf("%s\n", s1);
    }
}
