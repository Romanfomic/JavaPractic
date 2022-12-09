package Math;

public class TestMath {
    public TestMath(){
        MathFunc m1 = new MathFunc();
        double length = m1.circleLength(10.2);
        System.out.printf("Math| Circe radius: 10.2, length: %s \n", length);
    }
}
