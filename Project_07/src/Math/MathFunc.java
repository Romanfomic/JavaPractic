package Math;

public class MathFunc implements MatchCalculate{
    @Override
    public double st(double num, int st) {
        for(int i = 0; i < st; i++)
            num *= num;
        return num;
    }

    @Override
    public double mod(double num, double i) {
        return num;
    }
    public double circleLength(double radius){
        return 2*PI*radius;
    }
}
