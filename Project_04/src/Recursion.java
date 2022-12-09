import java.util.ArrayList;

public class Recursion {

    public boolean Number_8(char[] word, int position){
        int length = word.length;
        if(length - (position * 2) <= 1) return true;
        if(word[position] == word[length-position-1]) {
            position++;
            return Number_8(word, position);
        }
        return false;
    }
    public int Number_9(int a, int b){
        if(a == 0) return 1;
        if(a == 1) return b+1;
        if((b == 0) && (a >= 2)) return 0;
        return Number_9(a-1, b-1) + Number_9(a, b-1);
    }
    public int Number_10(int number, int newNumber){
        if(number == 0) return newNumber;
        newNumber = newNumber * 10 + number%10;

        return Number_10(number/10, newNumber);
    }
}
