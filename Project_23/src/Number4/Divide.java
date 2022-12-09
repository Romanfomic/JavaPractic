package Number4;

public class Divide extends BinOperation {
    public Divide(TrippleInterface left, TrippleInterface right){
        super(left, right);
    }
    public int evaluate(int left, int right) throws java.lang.ArithmeticException {
        if (right == 0) throw new java.lang.ArithmeticException("Division by zero: " + left + " / " + right);
        if (left == Integer.MIN_VALUE && right == -1) throw new java.lang.ArithmeticException("Overflow : " + left + "/" + right);
        return left / right;
    }
}
