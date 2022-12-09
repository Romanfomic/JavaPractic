package Number4;

public class Add extends BinOperation {
    public Add(Number4.TrippleInterface left, TrippleInterface right){
        super(left, right);
    }
    public int evaluate(int left, int right) throws java.lang.ArithmeticException {
        if ((right > 0) ? left > Integer.MAX_VALUE - right : left < Integer.MIN_VALUE - right) throw new java.lang.ArithmeticException("Overflow: " + left  + " + " + right);
        return left + right;
    }
    public double evaluate(double left, double right) throws java.lang.ArithmeticException {
        if (right >= Double.MAX_VALUE - left || left >= Double.MAX_VALUE - right) throw new java.lang.ArithmeticException("Overflow: " + left  + " + " + right);
        return left + right;
    }
}
