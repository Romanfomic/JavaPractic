package Number4;

public abstract class BinOperation implements TrippleInterface {
    private Number4.TrippleInterface left;
    private Number4.TrippleInterface right;
    public BinOperation(Number4.TrippleInterface left, Number4.TrippleInterface right){
        this.left = left;
        this.right = right;
    }
    public abstract int evaluate(int left, int right) throws java.lang.ArithmeticException;
    public int evaluate(int x, int y, int z) throws java.lang.ArithmeticException {
        return evaluate(left.evaluate(x,y,z), right.evaluate(x,y,z));
    }
}
