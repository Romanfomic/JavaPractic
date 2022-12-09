package Number1;

public class TestNumber1 {
    public static void main(String[] args) {
        ConcreateFactory factory = new ConcreateFactory();
        Complex first = factory.createComplex();
        Complex second = factory.createComplex(10,7);
        System.out.println(first);
        System.out.println(second);
    }
}
