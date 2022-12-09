import Circle.CircleTester;
import java.util.*;

import java.util.Random;
import java.util.Arrays;
public class Program {
    public static void main(String args[]){
        sort();
        CircleTester tester = new CircleTester(5);
        arrayOfFour();
        arrayOfCount();
        shells();
        Converter con = new Converter("rub", 120.0);
        System.out.println(con);
        TestEmployee t = new TestEmployee();
    }
    static void sort(){
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    static void arrayOfFour(){
        int[] array = new int[4];
        Random rand = new Random();
        boolean flag = true;
        for(int i = 0; i < 4; i++){
            array[i] = (int)(Math.random()*99 - 10);
            System.out.print(array[i] + " ");
            if(i > 0 && array[i] <= array[i-1]) flag = false;
        }
        if(flag) System.out.println("\nМассив возрастающий");
        else System.out.println("\nМассив невозрастающий");
    }
    static void arrayOfCount(){
        System.out.println("Введите натуральное число");
        int count = 0;
        boolean flag = true;
        while (flag) {
            Scanner in = new Scanner(System.in);
            count = in.nextInt();
            if (count < 0) System.out.println("Введите целое число >0!");
            else flag = false;
        }
        int[] array = new int[count];
        int newCount = 0;
        for(int i = 0; i < count; i++){
            int temp = (int)(Math.random()*count);
            array[i] = temp;
            System.out.print(temp + " ");
            if(temp % 2 == 0) newCount++;
        }
        int[] newArray = new int[newCount];
        int temp = 0;
        for(int i = 0; i < count; i++){
            if(array[i] % 2 == 0){
                newArray[temp] = array[i];
                temp++;
            }
        }
        System.out.println();
        if(newCount == 0)System.out.println("Четных элементов не обнаружено!");
        else
            for (int i = 0; i < newCount; i++){
                System.out.print(newArray[i] + " ");
            }
    }
    static void shells(){
        Double number1 = Double.valueOf(10);
        Double number2 = Double.parseDouble("15");
        short s1;
        int i1;
        long l1;
        float f1;
        boolean bl1;
        char c1;
        System.out.println(number2);
        String d = Double.toString(3.14);
    }

}
