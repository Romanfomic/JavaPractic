package Number4;

public abstract class UnaryOperation implements TrippleInterface {
    private final TrippleInterface object;
    public UnaryOperation(TrippleInterface object) {
        this.object = object;
    }
    abstract protected int evaluate(int object) throws java.lang.ArithmeticException;
    public int evaluate(int x, int y, int z) throws java.lang.ArithmeticException {
        return evaluate(object.evaluate(x, y, z));
    }
}
