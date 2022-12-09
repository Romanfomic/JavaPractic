public class MergeSort {
    public MergeSort(Student[] array){
        Sort(array, array.length);
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].GetIdNumber());
        }
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right)
    {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].GetIdNumber() <= r[j].GetIdNumber()) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    public static void Sort(Student[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        for(int i = 0; i < l.length; i++){
            Student temp = new Student(7);
            l[i] = temp;
        }
        Student[] r = new Student[n - mid];
        for(int i = 0; i < r.length; i++){
            Student temp = new Student(8);
            r[i] = temp;
        }

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        Sort(l, mid);
        Sort(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }
}
