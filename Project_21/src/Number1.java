import java.util.ArrayList;

public class Number1 {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList<>();
        String[] ar = new String[5];
        ar[0] = "a";
        ar[1] = "b";
        ar[2] = "c";
        ar[3] = "d";
        ar[4] = "e";
        arrayToArrayList(ar,al);
        System.out.println(al);
    }
    public static <E> void arrayToArrayList(E[] a, ArrayList<E> lst) {
        for (E e : a) lst.add(e);
    }
}
