import java.util.ArrayList;

public class TestStudent {
    private ArrayList<Student> studentArray = new ArrayList<Student>();
    public TestStudent(){
        setArray();
        for(int i = 0; i < studentArray.size(); i++){
            Student temp = studentArray.get(i);
            int j = i - 1;
            for(; j >= 0; j--){
                if(temp.GetIdNumber() < studentArray.get(j).GetIdNumber()){
                    studentArray.set(j+1, studentArray.get(j));
                } else {
                    break;
                }
            }
            studentArray.set(j+1, temp);
        }

        for(int i = 0; i < studentArray.size(); i++){
            System.out.println(studentArray.get(i).GetIdNumber());
        }
    }
    void setArray(){
        studentArray.add(new Student(2));
        studentArray.add(new Student(1));
        studentArray.add(new Student(4));
        studentArray.add(new Student(3));
        studentArray.add(new Student(5));
    }
}
