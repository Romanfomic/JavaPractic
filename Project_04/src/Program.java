public class Program {
    public static void main(String[] args){
        Recursion r = new Recursion();

        char[] word = "lol".toCharArray();
        if(r.Number_8(word, 0)) System.out.println("Yes");
        else System.out.println("No");

        int a = 2;
        int b = 3;
        System.out.println(r.Number_9(a, b));

        int number = 123;
        System.out.println(r.Number_10(number, 0));
    }
}
