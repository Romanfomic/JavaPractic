package Number4;

public class Const implements TrippleInterface {
    Integer iValue;
    Double dValue;
    public Const(Double dValue) {
        this.dValue = dValue;
        this.iValue = Integer.valueOf(dValue.toString());
    }
    public Const(Integer iValue) {
        this.dValue = iValue.doubleValue();
        this.iValue = iValue;
    }
    public int evaluate(int x){
        return iValue;
    }
    public double evaluate(double x){
        return dValue;
    }
    public int evaluate(int x, int y, int z) {
        return iValue;
    }
}
