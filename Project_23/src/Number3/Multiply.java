package Number3;

public class Multiply extends Operation{
    public Multiply(TrippleInterface left, TrippleInterface right){
        super(left, right);
    }
    public int evaluate(int left, int right) {
        return left * right;
    }
    public double evaluate(double left, double right){
        return left * right;
    }
}