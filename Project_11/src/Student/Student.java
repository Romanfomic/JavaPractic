package Student;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Student {
    private Calendar birthDate = Calendar.getInstance();
    private String name;
    public Student(String name, Calendar birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        return "Student| Name: " + name + "\nBirth date: " + sdf.format(birthDate.getTime());
    }
}
