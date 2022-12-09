package Number4;

public class Multiply extends BinOperation {

    public Multiply(TrippleInterface left, TrippleInterface right){
        super(left, right);
    }
    public int evaluate(int left, int right) throws java.lang.ArithmeticException {
        if (Math.abs(left) >=Integer.MAX_VALUE / Math.abs(right)) throw new java.lang.ArithmeticException("Overflow: " + left + " / " + right);
        return left * right;
    }
}
