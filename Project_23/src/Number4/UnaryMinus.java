package Number4;

public class UnaryMinus extends UnaryOperation{
    public UnaryMinus(TrippleInterface inter){ super(inter); }
    public int evaluate(int number) throws java.lang.ArithmeticException {
        if (number == Integer.MIN_VALUE) throw new java.lang.ArithmeticException("Overflow: -" + number );
        return number * -1;
    }
}
