public class TestMergeSort {
    public TestMergeSort(){
        Student[] array = new Student[4];
        for(int i = 0; i < array.length; i++){
            Student temp = new Student(0);
            array[i] = temp;
        }
        array[0].SetIdNumber(8);
        array[1].SetIdNumber(5);
        array[2].SetIdNumber(10);
        array[3].SetIdNumber(3);

        MergeSort s1 = new MergeSort(array);
    }
}
