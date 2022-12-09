public class MVCPatternDemo {

    public static void main(String[] args) {
        StudentController controller = new StudentController(retreiveStudentFromDatabase());
        controller.updateView();
    }

    public static Student retreiveStudentFromDatabase(){
        Student tmp = new Student();
        tmp.setName("Ivan");
        tmp.setRollNo("RollNo");
        return tmp;
    }

}