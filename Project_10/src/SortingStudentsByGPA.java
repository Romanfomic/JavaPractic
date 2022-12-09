import java.util.ArrayList;

public class SortingStudentsByGPA implements Comparator{
    private ArrayList<Student> array = new ArrayList<>();
    public SortingStudentsByGPA(){
        setArray();
        QuickSort(array, 0, array.size()-1);
    }
    private void setArray(){
        this.array.add(new Student(2));
        this.array.add(new Student(1));
        this.array.add(new Student(3));
        this.array.add(new Student(5));
        this.array.add(new Student(4));
    }
    public void QuickSort(ArrayList<Student> array, int low, int high){
        if (array.size() == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student stdMiddle = array.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).GetGrade() < stdMiddle.GetGrade()) {
                i++;
            }

            while (array.get(j).GetGrade() > stdMiddle.GetGrade()) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }

        if (low < j)
            QuickSort(array, low, j);

        if (high > i)
            QuickSort(array, i, high);
    }
    public void QuickSortGrade(ArrayList<Student> array, int low, int high){
        if (array.size() == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        Student stdMiddle = array.get(middle);

        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).GetIdNumber() < stdMiddle.GetIdNumber()) {
                i++;
            }

            while (array.get(j).GetIdNumber() > stdMiddle.GetIdNumber()) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = array.get(i);
                array.set(i, array.get(j));
                array.set(j, temp);
                i++;
                j--;
            }
        }

        if (low < j)
            QuickSort(array, low, j);

        if (high > i)
            QuickSort(array, i, high);
    }
    public String toString(){
        String info = "";
        for(int i = 0; i < array.size(); i++){
            info += array.get(i).GetIdNumber() + "\n";
        }
        return info;
    }
}
