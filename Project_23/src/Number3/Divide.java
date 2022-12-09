package Number3;

public class Divide extends Operation{
    public Divide(TrippleInterface left, TrippleInterface right){
        super(left, right);
    }
    public int evaluate(int left, int right){
        return left / right;
    }
    public double evaluate(double left, double right){
        return left / right;
    }
}
