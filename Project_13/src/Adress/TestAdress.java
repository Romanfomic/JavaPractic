package Adress;

public class TestAdress {
    public static void test(){
        String str = "Country,Region,City,Street,House,Corp,Flat";
        Adress a1 = new Adress(str, ",");
        System.out.printf("Adress| %s\n", a1);
    }
}
