package Number4;

public class Substract extends BinOperation {

    public Substract(TrippleInterface left, TrippleInterface right){
        super(left, right);
    }
    public int evaluate(int left, int right) throws java.lang.ArithmeticException {
        if (left > Integer.MAX_VALUE - right) throw new java.lang.ArithmeticException("Overflow: " + left  + " - " + right);
        return left - right;
    }
}
