import java.util.*;

public class Program {
    public static void main(String[] args){
        int[] array = new int[10];
        for(int i = 0; i < 10; i++){
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        Arrays.sort(array);
        for(int i = 0; i < 10; i++){
            System.out.print(array[i] + " ");
        }
    }
}
