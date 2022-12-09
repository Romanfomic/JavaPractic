package Number3;

public class TestNumber3 {
    public static void main(String[] args) {
        TrippleInterface inter = new Substract(new Multiply(new Const(5), new Variable("x")), new Const(6));
        System.out.println(inter.evaluate(10, 0 , 0));
        System.out.println(new Substract(new Const(5), new Const(10)).evaluate(1,2,3));
    }
}
