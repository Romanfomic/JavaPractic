public class Student {
    private int iDNumber;
    private int grade;

    public Student(int iDNumber){
        this.iDNumber = iDNumber;
    }
    public Student(int iDNumber, int grade){
        this.iDNumber = iDNumber;
        this.grade = grade;
    }
    public void SetIdNumber(int iDNumber){
        this.iDNumber = iDNumber;
    }
    public int GetIdNumber(){
        return iDNumber;
    }
    public void SetGrade(int grade){
        this.grade = grade;
    }
    public int GetGrade(){
        return grade;
    }
}
