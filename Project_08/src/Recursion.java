import java.util.Scanner;

public class Recursion {
    public static int Number_5(int num){
        if(num <= 0) return 0;
        return num%10 + Number_5(num/10);
    }
    public static int Number_10(int number, int newNumber){
        if(number == 0) return newNumber;
        newNumber = newNumber * 10 + number%10;

        return Number_10(number/10, newNumber);
    }
    public static void Number_15(int N){
        if(N != 0) {
            System.out.print(N%10 + " ");
            Number_15(N/10);
        }
    }
}
