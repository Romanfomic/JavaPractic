import Dev.devTest;
import Student.TestStudent;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        devTest t1 = new devTest();
        compareDates();
        TestStudent.test();
        enterDate();
        compareList();
    }
    static void compareDates(){
        System.out.print("Year: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        System.out.print("Month: ");
        int month = in.nextInt();
        System.out.print("Date: ");
        int date = in.nextInt();
        Calendar enteredDate = Calendar.getInstance();
        Calendar nowDate = Calendar.getInstance();
        enteredDate.set(Calendar.YEAR, year);
        enteredDate.set(Calendar.MONTH, month-1);
        enteredDate.set(Calendar.DAY_OF_MONTH, date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        System.out.printf("Entered date: %s\nNow date: %s\n", sdf.format(enteredDate.getTime()), sdf.format(nowDate.getTime()));
        if(nowDate.after(enteredDate)){
            System.out.printf("Entered date is higher\n");
        }
        else{
            System.out.printf("Entered date is lower\n");
        }
    }
    static void enterDate(){
        Scanner in = new Scanner(System.in);
        int year, month, date, hour, min;
        System.out.print("Year: ");
        year = in.nextInt();
        System.out.print("Month: ");
        month = in.nextInt();
        System.out.print("Date: ");
        date = in.nextInt();
        System.out.print("Hour: ");
        hour = in.nextInt();
        System.out.print("Min: ");
        min = in.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, date, hour, min);
        System.out.printf("%s\n", sdf.format(cal.getTime()));
    }
    static void compareList(){
        Calendar before1 = Calendar.getInstance();
        ArrayList<String> arrList = new ArrayList<String>();
        for(int i = 0; i < 10000; i++) {
            arrList.add("");
            arrList.remove(0);
        }
        Calendar after1 = Calendar.getInstance();
        System.out.printf("ArrayList: %s ms\n", after1.get(Calendar.MILLISECOND) - before1.get(Calendar.MILLISECOND));

        Calendar before2 = Calendar.getInstance();
        LinkedList<String> linkList = new LinkedList<String>();
        for(int i = 0; i < 10000; i++) {
            linkList.add("");
            linkList.remove(0);
        }
        Calendar after2 = Calendar.getInstance();
        System.out.printf("LinkedList: %s ms\n", after2.get(Calendar.MILLISECOND) - before2.get(Calendar.MILLISECOND));
    }
}
